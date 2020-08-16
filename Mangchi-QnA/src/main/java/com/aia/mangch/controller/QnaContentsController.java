package com.aia.mangch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aia.mangch.model.QnaBoard;
import com.aia.mangch.model.QnaComment;
import com.aia.mangch.service.QnaContentsService;

@RestController
@RequestMapping("/qna/contents/*")
public class QnaContentsController {
	
	@Autowired
	private QnaContentsService contentsService;

	//상세 페이지 데이터 select
	@GetMapping(value="{idx}")
	public QnaBoard qnaDetailView(@PathVariable int idx) {
		
		return contentsService.selectBoardComment(idx);
	}
	
	//댓글 쓰기
	@PostMapping(value="/")
	public int writeComment(@RequestBody QnaComment comment) {
		System.out.println("댓글 받은 데이터 ============>" + comment);
		return contentsService.insertComment(comment);
	}
//	
//	//댓글 수정
//	@RequestMapping(value="/", method = RequestMethod.PUT)
//	public int updateComment() {
//		
//		return 0;
//	}
	
	//게시글 삭제
	@DeleteMapping(value="/{idx}")
	public int deleteComment(@PathVariable int idx) {
		
		return contentsService.deleteComment(idx);
	}
}
