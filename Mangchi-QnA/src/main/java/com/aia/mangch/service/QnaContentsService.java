package com.aia.mangch.service;

import com.aia.mangch.model.QnaBoard;
import com.aia.mangch.model.QnaComment;

public interface QnaContentsService {
	public QnaBoard selectBoardComment(int idx);

	public int insertComment(QnaComment comment);

	public int deleteComment(int idx);

	public int insertHirachyComment(QnaComment comment);

	public int modifyComment(QnaComment comment);
}
