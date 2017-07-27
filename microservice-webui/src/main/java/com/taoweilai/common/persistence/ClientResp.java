package com.taoweilai.common.persistence;

import java.util.Map;

/**
 * 封装返回前台的结果集
 * @author lanla
 *
 */
public class ClientResp {

	private Integer status;
	private String msg;
	private Map data;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map getData() {
		return data;
	}
	public void setData(Map data) {
		this.data = data;
	}
	
	
}
