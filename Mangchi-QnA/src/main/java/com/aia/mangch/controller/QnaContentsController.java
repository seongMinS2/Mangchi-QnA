package com.aia.mangch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aia.mangch.model.QnaBoard;
import com.aia.mangch.service.QnaContentsService;

@RestController
@RequestMapping("/qna/contents/*")
public class QnaContentsController {
	
	@Autowired
	private QnaContentsService contentsService;

	//상세 페이지 데이터 select
	@RequestMapping(value="/{idx}", method = RequestMethod.GET)
	public QnaBoard qnaDetailView(@PathVariable int idx) {
		
		return contentsService.selectBoardComment(idx);
	}
	
//	//댓글 쓰기
//	@RequestMapping(value="/", method = RequestMethod.POST)
//	public int writeComment() {
//		
//		return 0;
//	}
//	
//	//댓글 수정
//	@RequestMapping(value="/", method = RequestMethod.PUT)
//	public int updateComment() {
//		
//		return 0;
//	}
//	
//	//게시글 삭제
//	@RequestMapping(value="/", method = RequestMethod.DELETE)
//	public int deleteComment() {
//		
//		return 0;
//	}
}
