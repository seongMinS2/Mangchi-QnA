package com.aia.mangch.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aia.mangch.model.BoardRegRequest;
import com.aia.mangch.service.QnaBoardService;
import com.aia.mangch.util.QnaListView;

@RestController
@RequestMapping("/qna/*")
public class QnaBoardController {
	
	@Autowired
	private QnaBoardService boardService;

	//게시글 목록 출력
	@CrossOrigin
	@GetMapping(value="/")
	@ResponseBody
	public QnaListView getView(@RequestParam Map<String,Object> map) {
		int idx = Integer.parseInt((String) map.get("idx"));
//		System.out.println("페이지값====>" + map.get("idx"));
//		System.out.println("검색어====>" + map.get("searchType"));
//		System.out.println("검색타입====>" + map.get("keyword"));
		return boardService.getQnABoardList(map); 
	}
	
	//게시글 쓰기
	@CrossOrigin
	@PostMapping(value="/")
	public int writeBoard(@RequestBody BoardRegRequest regRequest) {
//		System.out.println("게시글쓰기를타니?");
		return boardService.writeBoard(regRequest);
	}
	
	//답글 쓰기
	@CrossOrigin
	@PostMapping(value="reply-board/{idx}")
	public int replyWriteBoard(@RequestBody BoardRegRequest regRequest, @PathVariable int idx) {
//		System.out.println("답글쓰기를타니?");
		return boardService.replyWriteBoard(regRequest,idx);
	}
	
	
	//게시글 수정뷰 출력
	@CrossOrigin
	@GetMapping(value="update-board/{idx}")
	public BoardRegRequest updateBoardView(@PathVariable int idx) {
		return boardService.modifyView(idx);
	}
	//게시글 수정
	@CrossOrigin
	@PutMapping(value="update-board/{idx}")
	public int updateBoard(@PathVariable int idx, @RequestBody BoardRegRequest regRequest) {
		System.out.println("게시글수정=====>" + regRequest);
		return boardService.modifyBoard(idx,regRequest);
	}
	
	//게시글 삭제
	@CrossOrigin
	@DeleteMapping(value="{idx}")
	public int deleteBoard(@PathVariable int idx) {
		
		return boardService.deleteBoard(idx);
	}
	
}
