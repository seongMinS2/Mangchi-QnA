package com.aia.mangch.service;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aia.mangch.dao.QnADaoInterface;
import com.aia.mangch.model.PwCheck;
import com.aia.mangch.model.QnaBoard;
import com.aia.mangch.model.QnaComment;

@Service
public class QnaContentsServiceImpl implements QnaContentsService {

	private QnADaoInterface dao;

	@Autowired
	private SqlSessionTemplate template;

	//상세 페이지 보기
	@Transactional
	public QnaBoard selectBoardComment(int idx) {
		
		dao = template.getMapper(QnADaoInterface.class);
		
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("idx",idx);
		dao.countView(map);
		return dao.selectBoardComment(map);
	}

	//댓글 쓰기
	public int insertComment(QnaComment comment) {
		dao = template.getMapper(QnADaoInterface.class);
		return dao.insertComment(comment);
	}

	//댓글 삭제
	public int deleteComment(int idx) {
		dao = template.getMapper(QnADaoInterface.class);
		return dao.deleteComment(idx);
	}

	//대댓글 쓰기
	public int insertHirachyComment(QnaComment comment) {
		dao = template.getMapper(QnADaoInterface.class);
		return dao.insertHirachyComment(comment);
	}

	//댓글 수정
	public int modifyComment(QnaComment comment) {
		dao = template.getMapper(QnADaoInterface.class);
		return dao.modifyComment(comment);
	}

	@Override
	public int pwCheck(PwCheck check) {
		dao = template.getMapper(QnADaoInterface.class);
		return dao.pwCheck(check);
	}
}
