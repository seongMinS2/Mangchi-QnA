package com.aia.mangch.util;

import java.util.List;

import com.aia.mangch.model.QnaBoard;

public class QnaListView {
	/*==================================*/
	/*개발자가 선택하는 부분*/
	//현재 페이지
	private int page;
	//화면에 보여질 총 게시글 수
	private int countList;
	//화면에 보여질 총 페이지 수
	private int countPage;
	/*==================================*/
	/*==================================*/
	/*DB에서 가져올 데이터*/ 
	//총 게시물 수
	private int totalCount;
	//보여줄 게시글 리스트
	private List<QnaBoard> boardList;
	/*==================================*/
	//전체 페이지
	private int totalPage;
	//시작 페이지
	private int startPage;
	//마지막 페이지(mysql은 필요x)
	//private int endPage;
	
	public QnaListView(int page, int countList, int countPage, int totalCount, List<QnaBoard> boardList) {
		this.page = page;
		this.countList = countList;
		this.countPage = countPage;
		this.totalCount = totalCount;
		this.totalPage = totalCount / countList;
		this.startPage = ((page - 1) / countPage) * countPage + 1;
		this.boardList = boardList;
	}

	public int getPage() {
		return page;
	}

	public int getCountList() {
		return countList;
	}

	public int getCountPage() {
		return countPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public List<QnaBoard> getBoardList() {
		return boardList;
	}

	@Override
	public String toString() {
		return "QnaListView [page=" + page + ", countList=" + countList + ", countPage=" + countPage + ", totalCount="
				+ totalCount + ", totalPage=" + totalPage + ", startPage=" + startPage + ", boardList=" + boardList + "]";
	}


//	if (totalCount % countList > 0) {
//	    totalPage++;
//	}
//
//
//
//	if (totalPage < page) {
//	    page = totalPage;
//	}
//
//
//
//
//
//
//	if (endPage > totalPage) {
//	    endPage = totalPage;
//	}
//
//
//
//	if (startPage > 1) {
//
//	    System.out.print("<a href=\"?page=1\">처음</a>");
//
//	}
//
//
//
//	if (page > 1) {
//
//	    System.out.println("<a href=\"?page=" + (page - 1)  + "\">이전</a>");
//
//	}
//
//
//
//	for (int iCount = startPage; iCount <= endPage; iCount++) {
//	    if (iCount == page) {
//	        System.out.print(" <b>" + iCount + "</b>");
//	    } else {
//	        System.out.print(" " + iCount + " ");
//	    }
//	}
//
//
//	if (page < totalPage) {
//	    System.out.println("<a href=\"?page=" + (page + 1)  + "\">다음</a>");
//	}
//
//
//
//	if (endPage < totalPage) {
//	    System.out.print("<a href=\"?page=" + totalPage + "\">끝</a>");
//	}
}
