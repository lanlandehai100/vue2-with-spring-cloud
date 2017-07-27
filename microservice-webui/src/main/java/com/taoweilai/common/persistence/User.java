package com.taoweilai.common.persistence;

public class User extends BaseEntity<User>{

	private static final long serialVersionUID = 879580868328244477L;

	private String loginName;
	
	private String password;
      
    private String name;  
      
    private String phone;
    
    private String headerImg;
    
    private String sex;
    
    private String bornMonth;
    
    private String bornDay;
  
    private String area;
    
    private String grade;
    
    private String subject;
    
    private Double balance;
    
    private Double score;
    
    private Integer rank;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHeaderImg() {
		return headerImg;
	}

	public void setHeaderImg(String headerImg) {
		this.headerImg = headerImg;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBornMonth() {
		return bornMonth;
	}

	public void setBornMonth(String bornMonth) {
		this.bornMonth = bornMonth;
	}

	public String getBornDay() {
		return bornDay;
	}

	public void setBornDay(String bornDay) {
		this.bornDay = bornDay;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}
    
    
}
