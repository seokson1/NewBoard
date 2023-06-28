package com.example.newboard.board.service;

import com.example.newboard.board.entity.BoardVO;
import com.example.newboard.board.repository.BoardRepository;
import com.example.newboard.dto.BoardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardService  {


    private final BoardRepository boardRepository;

    public BoardVO addBoard(BoardDAO dao) {

        return boardRepository.save(dao.toEntity());
    }
}
