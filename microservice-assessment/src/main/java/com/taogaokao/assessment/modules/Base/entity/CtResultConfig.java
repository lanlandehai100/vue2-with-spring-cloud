package com.taogaokao.assessment.modules.Base.entity;

public class CtResultConfig extends BaseEntity<CtResultConfig> {

	private static final long serialVersionUID = 7201665558069707705L;
	
	private Long titleId;
	
	private String contentIntro;
	
	private String resultType;
	
	private String resultTypeName;
	
	private String childTitle;
	
	private String childContent;
	
	private String insertUserId;
	
	private String optionName;

	public Long getTitleId() {
		return titleId;
	}

	public void setTitleId(Long titleId) {
		this.titleId = titleId;
	}
	

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public String getChildTitle() {
		return childTitle;
	}

	public void setChildTitle(String childTitle) {
		this.childTitle = childTitle;
	}

	public String getChildContent() {
		return childContent;
	}

	public void setChildContent(String childContent) {
		this.childContent = childContent;
	}

	public String getResultTypeName() {
		return resultTypeName;
	}

	public void setResultTypeName(String resultTypeName) {
		this.resultTypeName = resultTypeName;
	}

	public String getContentIntro() {
		return contentIntro;
	}

	public void setContentIntro(String contentIntro) {
		this.contentIntro = contentIntro;
	}

	public String getInsertUserId() {
		return insertUserId;
	}

	public void setInsertUserId(String insertUserId) {
		this.insertUserId = insertUserId;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	
	
	
}

