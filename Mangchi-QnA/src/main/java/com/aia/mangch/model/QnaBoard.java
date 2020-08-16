package com.aia.mangch.model;

import java.util.Date;
import java.util.List;

public class QnaBoard {
	private int idx;
	private String memNick;
	private String title;
	private String contents;
	private Date regdate;
	private int count;
	private int status;
	private String pw;
	private int parents;
	private int depth;
	private List<QnaComment> comment;
	
	
	public QnaBoard() {	}
	
	// 화면에 출력될때 필요한 모델 데이터
	public QnaBoard(int idx, String memNick, String title, Date regdate, int count, int status, int parents, int depth, List<QnaComment> comment) {
		this.idx = idx;
		this.memNick = memNick;
		this.title = title;
		this.regdate = regdate;
		this.count = count;
		this.status = status;
		this.parents = parents;
		this.depth = depth;
		this.comment = comment;
	}
	
	//글쓰기 모델
	public QnaBoard(String memNick, String title, String contents, String pw) {
		this.memNick = memNick;
		this.title = title;
		this.contents = contents;
		this.pw = pw;
	}

	public QnaBoard(int idx, String memNick, String title, String contents, Date regdate, int count, int status,
			String pw, int parents, int depth, List<QnaComment> comment) {
		this.idx = idx;
		this.memNick = memNick;
		this.title = title;
		this.contents = contents;
		this.regdate = regdate;
		this.count = count;
		this.status = status;
		this.pw = pw;
		this.parents = parents;
		this.depth = depth;
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

	public int getParents() {
		return parents;
	}

	public void setParents(int parents) {
		this.parents = parents;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public List<QnaComment> getComment() {
		return comment;
	}

	public void setComment(List<QnaComment> comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "QnABoard [idx=" + idx + ", memNick=" + memNick + ", title=" + title + ", contents=" + contents
				+ ", regdate=" + regdate + ", count=" + count + ", status=" + status + ", pw=" + pw + ", parents="
				+ parents + ", depth=" + depth + ", comment=" + comment + "]";
	}

	
	
}