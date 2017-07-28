package com.taoweilai.common.persistence;

import java.util.HashMap;

/**
 * 封装返回前台的结果集
 * @author lanla
 *
 */
public class ClientResp<T> {
	
	public static final Integer  ERROR= 1;
	public static final Integer SUCCESS = 200;
	public static final Integer TOKEN_INVALID = 404;
	private Integer status = SUCCESS;
	private String msg;
	private HashMap<String , T> data = new HashMap<String , T>();
	
	public ClientResp(String key , T data){
		this.data.put(key, data);
	}
	
	public ClientResp(){
		
	}
	
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
	public HashMap<String,T> getData() {
		return data;
	}
	public void setData(HashMap<String,T> data) {
		this.data = data;
	}
	
	
}
