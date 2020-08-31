package com.aia.mangch.service;

import java.util.Map;

import com.aia.mangch.model.BoardRegRequest;
import com.aia.mangch.util.QnaListView;

public interface QnaBoardService {

	public QnaListView getQnABoardList(Map<String,Object> map);

	public int writeBoard(BoardRegRequest regRequest);

	public BoardRegRequest modifyView(int idx);

	public int modifyBoard(int idx, BoardRegRequest regRequest);

	public int deleteBoard(int idx);

	public int replyWriteBoard(BoardRegRequest regRequest, int idx);
}
