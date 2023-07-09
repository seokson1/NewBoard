package com.example.newboard.board.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BoardVO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long boardNo;

    @Column(name = "board_title", nullable = false)
    private String boardTitle;

    @Column(name = "board_writer", nullable = false)
    private String boardWriter;

    @Column(name = "board_content", nullable = false)
    private String boardContent;

    @Column(name = "board_regdate", nullable = false)
    private LocalDateTime regDate;

    @Column(name = "board_modify")
    private LocalDateTime updateDate;

    @Column(name = "board_deletedate")
    private LocalDateTime deleteDate;

    @Column(name = "board_good")
    private long good;

    public void update(String boardTitle, String boardContent) {

        this.boardTitle = boardTitle;

        this.boardContent = boardContent;
    }

}
