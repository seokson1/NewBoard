package com.example.newboard.board.controller;

import com.example.newboard.board.entity.BoardVO;
import com.example.newboard.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardControl {

    private final BoardRepository boardRepository;


    @GetMapping("/api/board")
    public String boardString() {

        return "게시판 입니다.";
    }

    @GetMapping("/api/get/board")
    public BoardVO getBoard() {

        BoardVO boardVO = new BoardVO();
        boardVO.setBoardNo(1);
        boardVO.setBoardTitle("연습중");
        boardVO.setBoardWriter("홍길동");
        boardVO.setRegDate(LocalDateTime.now());
        boardVO.setBoardContent("지금 작성 중입니다.");

        return boardVO;
    }

    @GetMapping("/api/get/list/board")
    public List<BoardVO> listBoard() {

        List<BoardVO> boardVO = new ArrayList<>();


    return null;
    }
}


