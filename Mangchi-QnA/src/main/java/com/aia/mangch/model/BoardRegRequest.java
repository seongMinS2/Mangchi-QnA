package com.aia.mangch.model;

public class BoardRegRequest {
	
	private String memberNick;
	private String title;
	private String contents;
	private String pw;
	private int originNo;
	private int groupOrd;
	private int groupLayer;
	private int pwCheck;
	
	public BoardRegRequest() {}
	
	public BoardRegRequest(String memberNick, String title, String contents, String pw, int pwCheck) {
		this.memberNick = memberNick;
		this.title = title;
		this.contents = contents;
		this.pw = pw;
		this.pwCheck = pwCheck;
	}

	public String getMemberNick() {
		return memberNick;
	}

	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
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

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	// BoardRegRequest -> QnABoard
	public QnaBoard toQnaBoard() {
		return new QnaBoard(memberNick,title,contents,pw,pwCheck);
	}

	@Override
	public String toString() {
		return "BoardRegRequest [memberNick=" + memberNick + ", title=" + title + ", contents=" + contents + ", pw="
				+ pw + ", originNo=" + originNo + ", groupOrd=" + groupOrd + ", groupLayer=" + groupLayer + ", pwCheck="
				+ pwCheck + "]";
	}


	
	
	
}
