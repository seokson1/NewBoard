package com.example.newboard.board.dto;

import com.example.newboard.board.entity.BoardVO;
import lombok.Getter;

@Getter
public class BoardResponse {

    private final String writer;
    private final String date;
    private final String title;
    private final String content;

    public BoardResponse(BoardVO vo) {

        this.writer = vo.getBoardWriter();
        this.date = String.valueOf(vo.getRegDate());
        this.title = vo.getBoardTitle();
        this.content = vo.getBoardContent();
    }


}
