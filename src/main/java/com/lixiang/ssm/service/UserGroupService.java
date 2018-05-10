package com.lixiang.ssm.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lixiang.ssm.dao.UgroupMapper;
import com.lixiang.ssm.entity.Ugroup;
import com.lixiang.ssm.entity.User;

@Service
public class UserGroupService {
	
	protected Log log=LogFactory.getLog(UserGroupService.class);
	@Autowired
	private UserService userService;
	
	@Autowired
	private UgroupMapper ugroupMapper;
	
	//用户组用户
	List<User> list;
	
	/**
	 * 分页的查询
	 * @param user
	 * @return
	 */
	public PageInfo<Ugroup> pageList(Ugroup ugroup) {
		//获取第1页，10条内容，默认查询总数count
		PageHelper.startPage(ugroup.getPageNum(), ugroup.getPageSize());
		//查询语句
		List<Ugroup> list = ugroupMapper.selectList(ugroup);
		//用PageInfo对结果进行包装
		PageInfo<Ugroup> page = new PageInfo<>(list);
		return page;
	}
	
	
	/**
	 * 添加用户组
	 * @param ugroup
	 * @return
	 */
	public boolean addUgroup(Ugroup ugroup){
		return ugroupMapper.insert(ugroup)>0;
	}
	/**
	 * 修改用户组普通信息业务
	 * @param ugroup
	 * @return
	 */
	@Transactional
	public boolean ugroupModify(Ugroup ugroup)
	{
		//获取当前用户
		User user = (User)SecurityUtils.getSubject().getPrincipal();
		
		return ugroupMapper.ugroupModify(ugroup,user);
	}
	
	/**
	 * 查询用户组用户
	 */
	/**
	 * 分页的查询
	 * @param user
	 * @return
	 */
	public PageInfo<User> ugroupUsers(Ugroup ugroup) {
		//获取第1页，10条内容，默认查询总数count
		PageHelper.startPage(ugroup.getPageNum(), ugroup.getPageSize());
		//查询语句
		list = ugroupMapper.ugroupUsers(ugroup);
		//用PageInfo对结果进行包装
		PageInfo<User> page = new PageInfo<>(list);
		return page;
	}
	
	
	/**
	 * 修改用户组用户
	 */
	@Transactional
	public void ugroupUsersModify(int groupid ,int[] id)
	{
		
		//去除没改动的用户
		for (int l = 0; l < list.size(); l++)
		{
			for (int i = 0; i < id.length; i++)
			{
				//id数组的设置为0，意义为去除
				if(id[i]!=0)
				{
					//如果用户组已经有的用户，则在list集合和id数组删除
					if(list.get(l).getId().intValue()==id[i])
					{
						list.remove(l);
						id[i] = 0;//id数组的设置为0，意义为去除
						break;
					}
				}
			}
		}
		
		//去除id数组元素为0的
		ArrayList<Integer> addlist = new ArrayList<>();
		for (int i = 0; i < id.length; i++)
		{
			if(id[i] !=0)
				addlist.add(id[i]);
		}
		
		ugroupMapper.ugroupAddUsers(groupid, addlist);
		ugroupMapper.ugroupDelUsers(groupid, list);
		
	}
	
	
	/**
	 * 删除用户组
	 * id:用户组的Id
	 */
	@Transactional
	public boolean deleteUgroup(Integer id){
		int flag;
		flag=ugroupMapper.deleteUgroup(id);
		if(flag>0){
			return true;
		}
		return false;
	}

	
}
