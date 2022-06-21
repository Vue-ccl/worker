package com.oracle.model;

public class Chuchai {
	private int cd;
	private int id;
	private String stime;
	private String endtime;
	private int sumtime;
	public Chuchai(int cd, int id, String stime, String endtime, int sumtime) {
		super();
		this.cd = cd;
		this.id = id;
		this.stime = stime;
		this.endtime = endtime;
		this.sumtime = sumtime;
	}
	public Chuchai(int id, String stime, String endtime, int sumtime) {
		super();
		this.id = id;
		this.stime = stime;
		this.endtime = endtime;
		this.sumtime = sumtime;
	}
	public Chuchai() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCd() {
		return cd;
	}
	public void setCd(int cd) {
		this.cd = cd;
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
	@Override
	public String toString() {
		return "Chuchai [cd=" + cd + ", id=" + id + ", stime=" + stime + ", endtime=" + endtime + ", sumtime=" + sumtime
				+ "]";
	}
	
	
}
