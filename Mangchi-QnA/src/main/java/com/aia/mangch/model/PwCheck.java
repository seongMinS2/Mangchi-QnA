package com.aia.mangch.model;

public class PwCheck {
	private int idx;
	private int pw;
	
	public PwCheck() {}
	
	public PwCheck(int idx, int pw) {
		this.idx = idx;
		this.pw = pw;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}


	@Override
	public String toString() {
		return "PwCheck [idx=" + idx + ", pw=" + pw + "]";
	}
	
	
}
