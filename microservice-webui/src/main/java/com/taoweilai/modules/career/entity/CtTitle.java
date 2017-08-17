package com.taoweilai.modules.career.entity;

import java.util.List;

import com.taoweilai.common.persistence.BaseEntity;

public class CtTitle extends BaseEntity<CtTitle> {

	private static final long serialVersionUID = 7201665558069707705L;
	
	private Long titleId;
	
	private String insertUserId;
	
	private String titleName;
	
	private String titleDescript;
	
	private String titleType;
	
	private String titleImg;
	
	private String squestions;
	
	private List<CtQuestion> questions;
	
	private List<CtResultConfig> resultConfig;

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getTitleDescript() {
		return titleDescript;
	}

	public void setTitleDescript(String titleDescript) {
		this.titleDescript = titleDescript;
	}

	public String getTitleType() {
		return titleType;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public Long getTitleId() {
		return titleId;
	}

	public void setTitleId(Long titleId) {
		this.titleId = titleId;
	}

	public List<CtQuestion> getQuestions() {
		return questions;
	}

	public void setQuestions(List<CtQuestion> questions) {
		this.questions = questions;
	}

	public String getSquestions() {
		return squestions;
	}

	public void setSquestions(String squestions) {
		this.squestions = squestions;
	}

	public String getTitleImg() {
		return titleImg;
	}

	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

	public List<CtResultConfig> getResultConfig() {
		return resultConfig;
	}

	public void setResultConfig(List<CtResultConfig> resultConfig) {
		this.resultConfig = resultConfig;
	}

	public String getInsertUserId() {
		return insertUserId;
	}

	public void setInsertUserId(String insertUserId) {
		this.insertUserId = insertUserId;
	}
	
}
