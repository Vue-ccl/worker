package com.oracle.model;

public class Chuqin {
	private int wd;
	private int id;
	private String uutime;
	private String untime;
	private String nutime;
	private String nntime;
	private String abcord;
	private String dday;
	public Chuqin(int wd, int id, String uutime, String untime, String nutime, String nntime, String abcord,
			String dday) {
		super();
		this.wd = wd;
		this.id = id;
		this.uutime = uutime;
		this.untime = untime;
		this.nutime = nutime;
		this.nntime = nntime;
		this.abcord = abcord;
		this.dday = dday;
	}
	public Chuqin(int id, String uutime, String untime, String nutime, String nntime, String abcord, String dday) {
		super();
		this.id = id;
		this.uutime = uutime;
		this.untime = untime;
		this.nutime = nutime;
		this.nntime = nntime;
		this.abcord = abcord;
		this.dday = dday;
	}
	public Chuqin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getWd() {
		return wd;
	}
	public void setWd(int wd) {
		this.wd = wd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUutime() {
		return uutime;
	}
	public void setUutime(String uutime) {
		this.uutime = uutime;
	}
	public String getUntime() {
		return untime;
	}
	public void setUntime(String untime) {
		this.untime = untime;
	}
	public String getNutime() {
		return nutime;
	}
	public void setNutime(String nutime) {
		this.nutime = nutime;
	}
	public String getNntime() {
		return nntime;
	}
	public void setNntime(String nntime) {
		this.nntime = nntime;
	}
	public String getAbcord() {
		return abcord;
	}
	public void setAbcord(String abcord) {
		this.abcord = abcord;
	}
	public String getDday() {
		return dday;
	}
	public void setDday(String dday) {
		this.dday = dday;
	}
	@Override
	public String toString() {
		return "Chuqin [wd=" + wd + ", id=" + id + ", uutime=" + uutime + ", untime=" + untime + ", nutime=" + nutime
				+ ", nntime=" + nntime + ", abcord=" + abcord + ", dday=" + dday + "]";
	}
	
	
}
