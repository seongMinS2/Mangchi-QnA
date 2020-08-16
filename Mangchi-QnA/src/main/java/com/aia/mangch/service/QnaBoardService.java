package com.aia.mangch.service;

import java.util.List;

import com.aia.mangch.model.BoardRegRequest;
import com.aia.mangch.model.QnaBoard;

public interface QnaBoardService {

	public List<QnaBoard> getQnABoardList();

	public int writeBoard(BoardRegRequest regRequest);

	public BoardRegRequest modifyView(int idx);

	public int modifyBoard(int idx, BoardRegRequest regRequest);

	public int deleteBoard(int idx);

	public int replyWriteBoard(BoardRegRequest regRequest, int idx);
}
