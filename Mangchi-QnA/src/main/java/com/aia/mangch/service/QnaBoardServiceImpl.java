package com.aia.mangch.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.mangch.dao.QnADaoInterface;
import com.aia.mangch.model.BoardRegRequest;
import com.aia.mangch.model.QnaBoard;
import com.aia.mangch.util.QnaListView;

@Service
public class QnaBoardServiceImpl implements QnaBoardService {

	private QnADaoInterface dao;
	@Autowired
	private SqlSessionTemplate template;
	
	//전체 게시물 수
	private int totalCount;
	//화면에 보여질 총 게시글 수
	private int countList = 5;
	//화면에 보여질 총 페이지 수
	private int countPage = 5;
	//한페이지에 보여질 뷰 리스트
	private List<QnaBoard> boardList;
	
	//게시글 목록 출력
	public QnaListView getQnABoardList(int page){
		
		if(page <= 0) {
			page = 1;
		}
		
		page = (page - 1) * countList;
		
		dao = template.getMapper(QnADaoInterface.class);
		
		//전체 게시물 수 구하기
		totalCount = dao.selectTotalCount();
		
		//한페이지에 보여질 뷰 리스트
		boardList = dao.selectView();
		
		
		 
		 return null;
	}

	//게시글 쓰기
	public int writeBoard(BoardRegRequest regRequest) {
		
		dao = template.getMapper(QnADaoInterface.class);
		
		return dao.writeBoard(regRequest.toQnaBoard());
	}

	//수정뷰 출력
	public BoardRegRequest modifyView(int idx) {
		
		dao = template.getMapper(QnADaoInterface.class);

		return dao.modifyView(idx);
	}

	//수정하기
	public int modifyBoard(int idx, BoardRegRequest regRequest) {
		
		dao = template.getMapper(QnADaoInterface.class);

		return dao.modifyBoard(idx, regRequest);
	}

	//삭제하기
	public int deleteBoard(int idx) {
		return dao.deleteBoard(idx);
	}

	//답글작성
	public int replyWriteBoard(BoardRegRequest regRequest, int idx) {
		return dao.replyWriteBoard(regRequest,idx);
	}
}
