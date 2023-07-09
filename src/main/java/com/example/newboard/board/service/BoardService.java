package com.example.newboard.board.service;

import com.example.newboard.board.dto.UpdateBoardRequest;
import com.example.newboard.board.entity.BoardVO;
import com.example.newboard.board.repository.BoardRepository;
import com.example.newboard.board.dto.BoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService  {


    private final BoardRepository boardRepository;

    public BoardVO addBoard(BoardRequest vo) {

        return boardRepository.save(vo.toEntity());
    }
    public BoardVO getBoard(long id) {

        return boardRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("not found: " + id));
    }
    public List<BoardVO> listBoard() {

        return boardRepository.findAll();
    }
    public void deleteBoard(long id) {
        boardRepository.deleteById(id);
    }
    @Transactional
    public BoardVO updateBoard(long id, UpdateBoardRequest request) {
        BoardVO boardVO = boardRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("not found: " + id));

        boardVO.update(request.getTitle(),request.getContent());

        return boardVO;
    }
}
