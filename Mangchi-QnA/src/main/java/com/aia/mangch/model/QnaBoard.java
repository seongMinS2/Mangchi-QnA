package com.aia.mangch.model;

import java.util.Date;
import java.util.List;

public class QnaBoard {
	/*============================*/
	private int idx;
	private String memNick;
	private String title;
	private String contents;
	private Date regdate;
	private int count;
	private int status;
	private String pw;
	private int originNo;
	private int groupOrd;
	private int groupLayer;
	private int pwCheck;
	private List<QnaComment> comment;
	/*============================*/
	
	public QnaBoard() {	}
	
	// 화면에 출력될때 필요한 모델 데이터
	public QnaBoard(int idx, String memNick, String title, Date regdate, int count, int status, List<QnaComment> comment) {
		this.idx = idx;
		this.memNick = memNick;
		this.title = title;
		this.regdate = regdate;
		this.count = count;
		this.status = status;
		this.comment = comment;
	}
	
	//글쓰기 모델
	public QnaBoard(String memNick, String title, String contents, String pw,int pwCheck) {
		this.memNick = memNick;
		this.title = title;
		this.contents = contents;
		this.pw = pw;
		this.pwCheck = pwCheck;
	}



	public QnaBoard(int idx, String memNick, String title, String contents, Date regdate, int count, int status,
					int originNo, int groupOrd, int groupLayer,int pwCheck, List<QnaComment> comment) {
		this.idx = idx;
		this.memNick = memNick;
		this.title = title;
		this.contents = contents;
		this.regdate = regdate;
		this.count = count;
		this.status = status;
		this.originNo = originNo;
		this.groupOrd = groupOrd;
		this.groupLayer = groupLayer;
		this.pwCheck = pwCheck;
		this.comment = comment;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getMemNick() {
		return memNick;
	}

	public void setMemNick(String memNick) {
		this.memNick = memNick;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public List<QnaComment> getComment() {
		return comment;
	}

	public void setComment(List<QnaComment> comment) {
		this.comment = comment;
	}

	public int getOriginNo() {
		return originNo;
	}

	public void setOriginNo(int originNo) {
		this.originNo = originNo;
	}

	public int getGroupOrd() {
		return groupOrd;
	}

	public void setGroupOrd(int groupOrd) {
		this.groupOrd = groupOrd;
	}

	public int getGroupLayer() {
		return groupLayer;
	}

	public void setGroupLayer(int groupLayer) {
		this.groupLayer = groupLayer;
	}
	
	public int getPwCheck() {
		return pwCheck;
	}

	public void setPwCheck(int pwCheck) {
		this.pwCheck = pwCheck;
	}

	@Override
	public String toString() {
		return "QnaBoard [idx=" + idx + ", memNick=" + memNick + ", title=" + title + ", contents=" + contents
				+ ", regdate=" + regdate + ", count=" + count + ", status=" + status + ", pw=" + pw + ", originNo="
				+ originNo + ", groupOrd=" + groupOrd + ", groupLayer=" + groupLayer + ", pwCheck=" + pwCheck
				+ ", comment=" + comment + "]";
	}

	
	
}
