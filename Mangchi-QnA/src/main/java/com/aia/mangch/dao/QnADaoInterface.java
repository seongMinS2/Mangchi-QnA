package com.aia.mangch.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aia.mangch.model.BoardRegRequest;
import com.aia.mangch.model.PwCheck;
import com.aia.mangch.model.QnaBoard;
import com.aia.mangch.model.QnaComment;

public interface QnADaoInterface {

	//총 게시물 수 구하기
	public int selectTotalCount(Map<String, Object> map);
	
	//한페이지에 보여질 게시물
	public List<QnaBoard> selectView(Map<String,Object> map);
	
	//상세 페이지 보기
	public QnaBoard selectDetailView(int idx);
	
	//상세 페이지 + 댓글
	public QnaBoard selectBoardComment(Map<String,Integer> idx);

	//게시글 쓰기
	public int writeBoard(QnaBoard board);
	
	//selectKey주입
	public int selectKeyInject(int selectKey);

	//게시글 수정값 가져오기
	public BoardRegRequest modifyView(int idx);

	//게시글 수정
	public int modifyBoard(@Param("idx") int idx,@Param("regReq") BoardRegRequest regRequest);

	//게시글 삭제
	public int deleteBoard(int idx);

	//답글 쓰기
	public int replyWriteBoard(@Param("regReq") BoardRegRequest regRequest,@Param("idx") int idx,@Param("groupOrd") int ord);
	
	//이전 groupOld가져오기
	public int groupOldSelect(int idx);
	
	//댓글 쓰기
	public int insertComment(QnaComment comment);
	
	//댓글 삭제
	public int deleteComment(int idx);

	//대댓글 쓰기
	public int insertHirachyComment(QnaComment comment);

	//댓글 수정
	public int modifyComment(QnaComment comment);
	
	//비밀글 비밀번호 체크
	public int pwCheck(PwCheck check);

	public void countView(Map<String, Integer> map);

}

