package com.aia.mangch.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aia.mangch.model.BoardRegRequest;
import com.aia.mangch.model.QnaBoard;
import com.aia.mangch.model.QnaComment;

public interface QnADaoInterface {

	//게시글 목록 출력
	public List<QnaBoard> selectTotalList();
	
	//상세 페이지 보기
	public QnaBoard selectDetailView(int idx);
	
	//상세 페이지 + 댓글
	public QnaBoard selectBoardComment(int idx);

	//게시글 쓰기
	public int writeBoard(QnaBoard board);

	//게시글 수정값 가져오기
	public BoardRegRequest modifyView(int idx);

	//게시글 수정
	public int modifyBoard(@Param("idx") int idx,@Param("regReq") BoardRegRequest regRequest);

	//게시글 삭제
	public int deleteBoard(int idx);

	//답글 쓰기
	public int replyWriteBoard(@Param("regReq") BoardRegRequest regRequest,@Param("idx") int idx);
	
	//댓글 쓰기
	public int insertComment(QnaComment comment);

	public int deleteComment(int idx);
	
	
}

