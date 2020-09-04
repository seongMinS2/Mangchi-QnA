package com.aia.mangch.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.aia.mangch.dao.QnADaoInterface;
import com.aia.mangch.model.BoardRegRequest;
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
//	@Test
//	@Transactional
//	public void writeBoard() throws Exception {
//		
//		QnaBoard board = new QnaBoard("테스트용","단위테스트중7","단위테스트중7","1111");
//		dao = template.getMapper(QnADaoInterface.class);
//		dao.writeBoard(board);
//		log.info("셀렉트키값====>"+ board.getOriginNo());
//		throw new Exception("Exception for rollback");
//		//dao.selectKeyInject(board.getOriginNo());
//		
//	}
	
	@Test
	public void replyWriteBoardTest() {
		BoardRegRequest regRequest = new BoardRegRequest();
		regRequest.setTitle("re:그룹올드답글체크3");
		regRequest.setMemberNick("테스트용");
		regRequest.setContents("답글테스트합니다");
		regRequest.setPw("1111");
		int idx = 39;
		int groupOld;
		
		dao = template.getMapper(QnADaoInterface.class);
		
		//old값 + 1 얻기
		//이유: 답글 정렬시에 필요
		groupOld = dao.groupOldSelect(idx);
		
		dao.replyWriteBoard(regRequest, idx, groupOld);
	}

}
