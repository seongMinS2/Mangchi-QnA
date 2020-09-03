package com.aia.mangch.service;

import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aia.mangch.dao.QnADaoInterface;
import com.aia.mangch.model.QnaBoard;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })

public class QnaBoardServiceImplTest {

	private QnADaoInterface dao;

	@Autowired
	private SqlSessionTemplate template;
	
	private Logger log = Logger.getLogger(QnaBoardServiceImplTest.class);

//	@Test
//	public void testreplyWrite() {
//		assertNotNull(service);
//
//		int groupOld;
//
//		dao = template.getMapper(QnADaoInterface.class);
//
//		groupOld = dao.groupOldSelect(1);
//
//	}

	// 게시글 쓰기
	@Test
	public void writeBoard() {
		
		QnaBoard board = new QnaBoard("테스트용","단위테스트중5","단위테스트중5","1111");
		dao = template.getMapper(QnADaoInterface.class);
		dao.writeBoard(board);
		log.info("셀렉트키값====>"+ board.getOriginNo());
		dao.selectKeyInject(board.getOriginNo());
		
	}
	
	

}
