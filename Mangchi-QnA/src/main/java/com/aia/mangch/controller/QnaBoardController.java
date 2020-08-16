package com.aia.mangch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aia.mangch.model.BoardRegRequest;
import com.aia.mangch.model.QnaBoard;
import com.aia.mangch.service.QnaBoardService;

@RestController
@RequestMapping("/qna/*")
public class QnaBoardController {
	
	@Autowired
	private QnaBoardService boardService;

	//게시글 목록 출력
	@GetMapping(value="/")
	@ResponseBody
	public List<QnaBoard> getView(){
		
		return boardService.getQnABoardList(); 
	}

	//게시글 쓰기
	@PostMapping(value="/")
	public int writeBoard(@RequestBody BoardRegRequest regRequest) {
		System.out.println(regRequest);
		return boardService.writeBoard(regRequest);
	}
	
	//게시글 수정뷰 출력
	@GetMapping(value="update-board/{idx}")
	public BoardRegRequest updateBoardView(@PathVariable int idx) {
		return boardService.modifyView(idx);
	}
	//게시글 수정
	@PutMapping(value="update-board/{idx}")
	public BoardRegRequest updateBoard(@PathVariable int idx) {
		return boardService.modifyBoard(idx);
	}
//	
//	//게시글 삭제
//	@RequestMapping(value="/", method = RequestMethod.DELETE)
//	public int deleteBoard() {
//		
//		return 0;
//	}
}
