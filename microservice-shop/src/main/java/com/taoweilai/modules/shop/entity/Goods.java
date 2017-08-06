package com.taoweilai.modules.shop.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;
import com.taoweilai.common.persistent.BaseEntity;

@TableName("goods")
public class Goods extends BaseEntity<Goods>{

	private static final long serialVersionUID = 4912972748820578335L;
	
	private String name;
	private Double price;
	private Date effectiveDate;
	private Date expiredDate;
	private String serviceName;
	private String status;
	private Integer sku;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}

}
