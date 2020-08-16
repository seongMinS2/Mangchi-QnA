package com.aia.mangch.dao;

import java.util.List;

import com.aia.mangch.model.BoardRegRequest;
import com.aia.mangch.model.QnaBoard;

public interface QnADaoInterface {

	//게시글 목록 출력
	public List<QnaBoard> selectTotalList();
	
	//상세 페이지 보기
	public QnaBoard selectDetailView(int idx);
	
	//상세 페이지 + 댓글
	public QnaBoard selectBoardComment(int idx);

	public int writeBoard(QnaBoard board);

	public BoardRegRequest modifyView(int idx);

	public BoardRegRequest modifyBoard(int idx);
	
	
}

