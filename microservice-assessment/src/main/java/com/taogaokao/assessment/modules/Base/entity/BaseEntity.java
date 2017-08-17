package com.taogaokao.assessment.modules.Base.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.annotation.JSONField;

public abstract class BaseEntity<T> implements Serializable {

	private static final long serialVersionUID = 2960946344983152262L;
	
	/**
	 * 瀹炰綋缂栧彿锛堝敮涓�鏍囪瘑锛�
	 */
	protected String id;
	
	protected String createBy;
	
	protected String updateBy;
	
	protected Date createDate;
	
	protected Date updateDate;
	
	protected String deleteFlag;
	
	/**
	 * 鏄惁鏄柊璁板綍锛堥粯璁わ細false锛夛紝璋冪敤setIsNewRecord()璁剧疆鏂拌褰曪紝浣跨敤鑷畾涔塈D銆�
	 * 璁剧疆涓簍rue鍚庡己鍒舵墽琛屾彃鍏ヨ鍙ワ紝ID涓嶄細鑷姩鐢熸垚锛岄渶浠庢墜鍔ㄤ紶鍏ャ��
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
	 * 鏄惁鏄柊璁板綍锛堥粯璁わ細false锛夛紝璋冪敤setIsNewRecord()璁剧疆鏂拌褰曪紝浣跨敤鑷畾涔塈D銆�
	 * 璁剧疆涓簍rue鍚庡己鍒舵墽琛屾彃鍏ヨ鍙ワ紝ID涓嶄細鑷姩鐢熸垚锛岄渶浠庢墜鍔ㄤ紶鍏ャ��
	 */
	public void setIsNewRecord(boolean isNewRecord) {
		this.isNewRecord = isNewRecord;
	}

	@JSONField(serialize=false)
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@JSONField(serialize=false)
	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
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
	
}
