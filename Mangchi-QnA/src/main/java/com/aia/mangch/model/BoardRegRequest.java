package com.aia.mangch.model;

public class BoardRegRequest {
	
	private String memberNick;
	private String title;
	private String contents;
	private String pw;
	
	public BoardRegRequest() {}
	
	public BoardRegRequest(String memberNick, String title, String contents, String pw) {
		this.memberNick = memberNick;
		this.title = title;
		this.contents = contents;
		this.pw = pw;
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

	// BoardRegRequest -> QnABoard
	public QnaBoard toQnaBoard() {
		return new QnaBoard(memberNick,title,contents,pw);
	}

	@Override
	public String toString() {
		return "BoardRegRequest [memberNick=" + memberNick + ", title=" + title + ", contents=" + contents + ", pw="
				+ pw + "]";
	}
	
	
	
}
