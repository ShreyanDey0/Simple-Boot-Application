package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieModel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int aid;
	private String director;
	private String lactor;
	private String lactress;
	private String mname;
	private String year;
	
	
//	public int getAid() {
//		return aid;
//	}
//	public void setAid(int aid) {
//		this.aid = aid;
//	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLactor() {
		return lactor;
	}
	public void setLactor(String lactor) {
		this.lactor = lactor;
	}
	public String getLactress() {
		return lactress;
	}
	public void setLactress(String lactress) {
		this.lactress = lactress;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "MovieModel [aid=" + aid + ", director=" + director + ", lactor=" + lactor + ", lactress=" + lactress
				+ ", mname=" + mname + ", year=" + year + "]";
	}
	
	
	
}
