package com.taoweilai.user.common.persistence;

import java.io.Serializable;
import java.util.Date;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.taoweilai.user.common.utils.IdGen;
import com.taoweilai.user.modules.base.entity.User;

public abstract class BaseEntity<T> implements Serializable {

	private static final long serialVersionUID = 2960946344983152262L;
	
	/**
	 * 实体编号（唯一标识）
	 */
	protected String id;
	
	protected User createBy;
	
	protected User updateBy;
	
	protected Date createDate;
	
	protected Date updateDate;
	
	protected String deleteFlag;
	
	/**
	 * 是否是新记录（默认：false），调用setIsNewRecord()设置新记录，使用自定义ID。
	 * 设置为true后强制执行插入语句，ID不会自动生成，需从手动传入。
	 */
	protected boolean isNewRecord = false;
	
	public BaseEntity() {
		
	}
	
	public BaseEntity(String id) {
		this();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean getIsNewRecord() {
        return isNewRecord || StringUtils.isEmpty(getId());
    }

	/**
	 * 是否是新记录（默认：false），调用setIsNewRecord()设置新记录，使用自定义ID。
	 * 设置为true后强制执行插入语句，ID不会自动生成，需从手动传入。
	 */
	public void setIsNewRecord(boolean isNewRecord) {
		this.isNewRecord = isNewRecord;
	}

	@JSONField(serialize=false)
	public User getCreateBy() {
		return createBy;
	}

	public void setCreateBy(User createBy) {
		this.createBy = createBy;
	}

	@JSONField(serialize=false)
	public User getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(User updateBy) {
		this.updateBy = updateBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
	public void preInsert(){
		// 不限制ID为UUID，调用setIsNewRecord()使用自定义ID
		if (!this.isNewRecord){
			setId(IdGen.uuid());
		}
		this.updateDate = new Date();
		this.createDate = this.updateDate;
	}
	
	/**
	 * 更新之前执行方法，需要手动调用
	 */
	public void preUpdate(){
		this.updateDate = new Date();
	}

}
