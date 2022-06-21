package com.oracle.model;

public class Qingjia {
	private int qd;
	private int id;
	private String stime;
	private String endtime;
	private int sumtime;
	public Qingjia(int qd, int id, String stime, String endtime, int sumtime) {
		super();
		this.qd = qd;
		this.id = id;
		this.stime = stime;
		this.endtime = endtime;
		this.sumtime = sumtime;
	}
	public Qingjia(int id, String stime, String endtime, int sumtime) {
		super();
		this.id = id;
		this.stime = stime;
		this.endtime = endtime;
		this.sumtime = sumtime;
	}
	public Qingjia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQd() {
		return qd;
	}
	public void setQd(int qd) {
		this.qd = qd;
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
		return "Qingjia [qd=" + qd + ", id=" + id + ", stime=" + stime + ", endtime=" + endtime + ", sumtime=" + sumtime
				+ "]";
	}
	
	
}
