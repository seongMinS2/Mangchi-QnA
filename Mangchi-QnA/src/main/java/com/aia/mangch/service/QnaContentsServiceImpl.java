package com.aia.mangch.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.mangch.dao.QnADaoInterface;
import com.aia.mangch.model.QnaBoard;

@Service
public class QnaContentsServiceImpl implements QnaContentsService {

	private QnADaoInterface dao;

	@Autowired
	private SqlSessionTemplate template;

	//상세 페이지 보기
	public QnaBoard selectBoardComment(int idx) {
		
		dao = template.getMapper(QnADaoInterface.class);

		return dao.selectBoardComment(idx);
	}
}
