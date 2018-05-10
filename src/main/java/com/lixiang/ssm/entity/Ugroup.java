package com.lixiang.ssm.entity;

import java.util.Date;

import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

public class Ugroup extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ugroup.id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ugroup.group_name
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ugroup.gorup_desc
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private String groupDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ugroup.creator_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private Integer creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ugroup.create_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Past
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ugroup.modidior_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    private Integer modidiorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ugroup.modify_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Past
    private Date modifyDate;

    
    private Integer num;
    
    public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ugroup
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    
	 public Ugroup(Integer id, String groupName, String groupDesc, Integer creatorId, Date createDate,
				Integer modidiorId, Date modifyDate, Integer num) {
			super();
			this.id = id;
			this.groupName = groupName;
			this.groupDesc = groupDesc;
			this.creatorId = creatorId;
			this.createDate = createDate;
			this.modidiorId = modidiorId;
			this.modifyDate = modifyDate;
			this.num = num;
		}
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ugroup
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Ugroup() {
        super();
    }

   

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ugroup.id
     *
     * @return the value of ugroup.id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ugroup.id
     *
     * @param id the value for ugroup.id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ugroup.group_name
     *
     * @return the value of ugroup.group_name
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ugroup.group_name
     *
     * @param groupName the value for ugroup.group_name
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ugroup.gorup_desc
     *
     * @return the value of ugroup.gorup_desc
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ugroup.gorup_desc
     *
     * @param  the value for ugroup.gorup_desc
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc == null ? null : groupDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ugroup.creator_id
     *
     * @return the value of ugroup.creator_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ugroup.creator_id
     *
     * @param creatorId the value for ugroup.creator_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ugroup.create_date
     *
     * @return the value of ugroup.create_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ugroup.create_date
     *
     * @param createDate the value for ugroup.create_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ugroup.modidior_id
     *
     * @return the value of ugroup.modidior_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Integer getModidiorId() {
        return modidiorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ugroup.modidior_id
     *
     * @param modidiorId the value for ugroup.modidior_id
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setModidiorId(Integer modidiorId) {
        this.modidiorId = modidiorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ugroup.modify_date
     *
     * @return the value of ugroup.modify_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ugroup.modify_date
     *
     * @param modifyDate the value for ugroup.modify_date
     *
     * @mbg.generated Thu May 03 17:07:31 CST 2018
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

	@Override
	public String toString() {
		return "Ugroup [id=" + id + ", groupName=" + groupName + ", groupDesc=" + groupDesc + ", creatorId=" + creatorId
				+ ", createDate=" + createDate + ", modidiorId=" + modidiorId + ", modifyDate=" + modifyDate + "]";
	}
    
    
}