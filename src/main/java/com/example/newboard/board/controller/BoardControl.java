package com.example.newboard.board.controller;

import com.example.newboard.board.dto.BoardRequest;
import com.example.newboard.board.dto.BoardResponse;
import com.example.newboard.board.dto.UpdateBoardRequest;
import com.example.newboard.board.entity.BoardVO;
import com.example.newboard.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
public class BoardControl {

    private final BoardService boardService;


    @PostMapping("/api/insert")
    public ResponseEntity<BoardVO> addBoard(@RequestBody BoardRequest dao) {
        BoardVO addVO = boardService.addBoard(dao);
        return ResponseEntity.status(HttpStatus.CREATED).body(addVO);
    }

    @GetMapping("/api/get/board/{id}")
    public ResponseEntity<BoardResponse> getBoard(@PathVariable long id) {
        BoardVO vo = boardService.getBoard(id);

        return ResponseEntity.ok().body(new BoardResponse(vo));
    }

    @GetMapping("/api/get/list/board")
    public ResponseEntity<List<BoardResponse>> listBoard() {

        List<BoardResponse> list = boardService.listBoard()
                .stream()
                .map(BoardResponse::new)
                .collect(Collectors.toList());


        return ResponseEntity.ok().body(list);
    }
    @DeleteMapping("/api/delete/board/{id}")
    public ResponseEntity<Void> deleteBoard(@PathVariable long id) {

        boardService.deleteBoard(id);

        return ResponseEntity.ok().build();
    }
    @PutMapping("/api/update/board/{id}")
    public ResponseEntity<BoardVO> updateBoard(@PathVariable long id, @RequestBody UpdateBoardRequest request) {

        BoardVO updateBoard = boardService.updateBoard(id, request);

     return ResponseEntity.ok().body(updateBoard);
    }
}


