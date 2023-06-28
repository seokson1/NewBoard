package com.example.newboard.board.controller;

import com.example.newboard.board.entity.BoardVO;
import com.example.newboard.board.repository.BoardRepository;
import com.example.newboard.board.service.BoardService;
import com.example.newboard.dto.BoardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardControl {

    private final BoardService boardService;


    @PostMapping("/api/insert")
    public ResponseEntity<BoardVO> addInsert(@RequestBody BoardDAO dao) {
       BoardVO addVO  = boardService.addBoard(dao);
        return ResponseEntity.status(HttpStatus.CREATED).body(addVO);
    }

    @GetMapping("/api/get/board")
    public BoardVO getBoard() {


        return null;
    }

    @GetMapping("/api/get/list/board")
    public List<BoardVO> listBoard() {

        List<BoardVO> boardVO = new ArrayList<>();


    return null;
    }
}


