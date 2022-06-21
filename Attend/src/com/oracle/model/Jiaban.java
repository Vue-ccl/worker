package com.oracle.model;

public class Jiaban {
	private int jd;
	private int id;
	private String stime;
	private String endtime;
	private int sumtime;
	private String dday;
	public Jiaban(int jd, int id, String stime, String endtime, int sumtime, String dday) {
		super();
		this.jd = jd;
		this.id = id;
		this.stime = stime;
		this.endtime = endtime;
		this.sumtime = sumtime;
		this.dday = dday;
	}
	public Jiaban(int id, String stime, String endtime, int sumtime, String dday) {
		super();
		this.id = id;
		this.stime = stime;
		this.endtime = endtime;
		this.sumtime = sumtime;
		this.dday = dday;
	}
	public Jiaban() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getJd() {
		return jd;
	}
	public void setJd(int jd) {
		this.jd = jd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStime() {
		return stime;
	}
	public void setStime(String stime) {
		this.stime = stime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public int getSumtime() {
		return sumtime;
	}
	public void setSumtime(int sumtime) {
		this.sumtime = sumtime;
	}
	public String getDday() {
		return dday;
	}
	public void setDday(String dday) {
		this.dday = dday;
	}
	@Override
	public String toString() {
		return "Jiaban [jd=" + jd + ", id=" + id + ", stime=" + stime + ", endtime=" + endtime + ", sumtime=" + sumtime
				+ ", dday=" + dday + "]";
	}
	
	
	

}
