package com.aia.mangch.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.mangch.dao.QnADaoInterface;
import com.aia.mangch.model.BoardRegRequest;
import com.aia.mangch.model.QnaBoard;

@Service
public class QnaBoardServiceImpl implements QnaBoardService {
	private QnADaoInterface dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	//게시글 목록 출력
	public List<QnaBoard> getQnABoardList(){
		
		dao = template.getMapper(QnADaoInterface.class);
		
		return dao.selectTotalList();
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

	@Override
	public BoardRegRequest modifyBoard(int idx) {
		
		dao = template.getMapper(QnADaoInterface.class);

		return dao.modifyBoard(idx);
	}
}
