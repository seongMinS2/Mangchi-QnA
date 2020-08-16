package com.aia.mangch.service;

import java.util.List;

import com.aia.mangch.model.BoardRegRequest;
import com.aia.mangch.model.QnaBoard;

public interface QnaBoardService {

	public List<QnaBoard> getQnABoardList();

	public int writeBoard(BoardRegRequest regRequest);

	public BoardRegRequest modifyView(int idx);

	public BoardRegRequest modifyBoard(int idx);
}
