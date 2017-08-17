package com.taoweilai.modules.career.entity;

import java.util.List;

import com.taoweilai.common.persistence.BaseEntity;

public class CtQuestion extends BaseEntity<CtQuestion> {

	private static final long serialVersionUID = 7201665558069707705L;
	
	private String questionId;
	
	private int typeNumber;
	
	private String titleId;
	
	private String questionNo;
	
	private String questionName;
	
	private String questionType;
	
	private Integer score;
	
	private String optionId;
		
	private String optionType;
	
	private String optionDesc;
	
	private String optionName;
	
	private List<CtOption> options;
	
	private String insertUserId;
	
	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public List<CtOption> getOptions() {
		return options;
	}

	public void setOptions(List<CtOption> options) {
		this.options = options;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getOptionDesc() {
		return optionDesc;
	}

	public void setOptionDesc(String optionDesc) {
		this.optionDesc = optionDesc;
	}

	public int getTypeNumber() {
		return typeNumber;
	}

	public void setTypeNumber(int typeNumber) {
		this.typeNumber = typeNumber;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getOptionId() {
		return optionId;
	}

	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	public String getInsertUserId() {
		return insertUserId;
	}

	public void setInsertUserId(String insertUserId) {
		this.insertUserId = insertUserId;
	}	
	
}
