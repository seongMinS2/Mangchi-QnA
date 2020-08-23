package com.aia.mangch.service;

import java.util.List;
import java.util.logging.Logger;

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
	//시작행
	private int startRow;
	//시작페이지
	private int startPage;
	//끝페이지
	private int endPage;
	//총 페이지
	private int totalPage;
	//한페이지에 보여질 뷰 리스트
	private List<QnaBoard> boardList;
	
	//게시글 페이징 목록 출력
	public QnaListView getQnABoardList(int page){
		
		dao = template.getMapper(QnADaoInterface.class);
		
		//페이지가 0보다 같거나 작을때
		if(page<=0) {
			page=1;
		}
		
		//시작페이지
		startPage = ((page - 1) / countPage) * countPage + 1;		

		//끝페이지
		endPage = startPage + countPage - 1;
		
		//전체 게시물 수 구하기
		totalCount = dao.selectTotalCount();
		
		//총 페이지
		totalPage = totalCount / countList;
		
		//시작 Row
		System.out.println("페이지에서 -1한 값" + (page-1));
		startRow = (page-1) * countList;
		
		//전체 게시물 수 나누기 한 페이지에 보여줄 글 수를 한 나머지가 0 보다 클때
		if (totalCount % countList > 0) {
		    totalPage++;
		}
		
		//현재페이지가 전체페이지보다 클때
		if (totalPage < page) {
		    page = totalPage;
		}
		
		//마지막페이지가 총 페이지수 보다 클때 보정
		if (endPage > totalPage) {
		    endPage = totalPage;
		}
		
		//한페이지에 보여질 뷰 리스트
		boardList = dao.selectView(startRow,countList);
		
		 return new QnaListView(page,countList,countPage,
				 totalCount,startPage,totalPage,endPage,boardList);
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
