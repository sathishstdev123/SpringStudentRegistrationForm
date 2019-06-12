package com.app.bean;

public class Student {

	private String stdId;
	private String stdName;
	private String month;
	private String day;
	private String year;
	private String stdGen;
	private String stdAddr;
	private String stdCity;
	private String stdState;
	private String stdCourse;
	private String stdMobile;
	private String stdEmail;
	private String stdCntry;
	public Student() {
		super();
	}
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getStdGen() {
		return stdGen;
	}
	public void setStdGen(String stdGen) {
		this.stdGen = stdGen;
	}
	public String getStdAddr() {
		return stdAddr;
	}
	public void setStdAddr(String stdAddr) {
		this.stdAddr = stdAddr;
	}
	public String getStdCity() {
		return stdCity;
	}
	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}
	public String getStdState() {
		return stdState;
	}
	public void setStdState(String stdState) {
		this.stdState = stdState;
	}
	public String getStdCourse() {
		return stdCourse;
	}
	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}
	public String getStdMobile() {
		return stdMobile;
	}
	public void setStdMobile(String stdMobile) {
		this.stdMobile = stdMobile;
	}
	public String getStdEmail() {
		return stdEmail;
	}
	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}
	public String getStdCntry() {
		return stdCntry;
	}
	public void setStdCntry(String stdCntry) {
		this.stdCntry = stdCntry;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", month=" + month + ", day=" + day + ", year="
				+ year + ", stdGen=" + stdGen + ", stdAddr=" + stdAddr + ", stdCity=" + stdCity + ", stdState="
				+ stdState + ", stdCourse=" + stdCourse + ", stdMobile=" + stdMobile + ", stdEmail=" + stdEmail
				+ ", stdCntry=" + stdCntry + "]";
	}
	
}