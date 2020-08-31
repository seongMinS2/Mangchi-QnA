package com.aia.mangch.model;

public class ReqHeaders {
	
	int idx;
	String searchType;
	String keyword;
	
	public ReqHeaders() {}
	
	public ReqHeaders(int idx, String searchType, String keyword) {
		this.idx = idx;
		this.searchType = searchType;
		this.keyword = keyword;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	@Override
	public String toString() {
		return "ReqHeaders [idx=" + idx + ", searchType=" + searchType + ", keyword=" + keyword + "]";
	}

}
