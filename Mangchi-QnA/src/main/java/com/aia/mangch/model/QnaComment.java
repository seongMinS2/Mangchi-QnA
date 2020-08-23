package com.aia.mangch.model;

import java.util.Date;

public class QnaComment {
	
	private int idx;
	private int boardIdx;
	private String writer;
	private String contents;
	private Date regdate;
	private int parents;
	private String from;
	
	public QnaComment() {}
	
	public QnaComment(int idx, int boardIdx, String writer, String contents, Date regdate, int parents, String from) {
		this.idx = idx;
		this.boardIdx = boardIdx;
		this.writer = writer;
		this.contents = contents;
		this.regdate = regdate;
		this.parents = parents;
		this.from = from;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getBoardIdx() {
		return boardIdx;
	}
	public void setBoardIdx(int boardIdx) {
		this.boardIdx = boardIdx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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
	public int getParents() {
		return parents;
	}
	public void setParents(int parents) {
		this.parents = parents;
	}
	public String getfrom() {
		return from;
	}
	public void setfrom(String from) {
		this.from = from;
	}

	@Override
	public String toString() {
		return "QnAComment [idx=" + idx + ", boardIdx=" + boardIdx + ", writer=" + writer + ", contents=" + contents
				+ ", regdate=" + regdate + ", parents=" + parents + ", from=" + from + "]";
	}
	
	

}
