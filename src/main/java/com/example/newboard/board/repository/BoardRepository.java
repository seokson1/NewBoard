package com.example.newboard.board.repository;

import com.example.newboard.board.entity.BoardVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardVO, Long> {

}
