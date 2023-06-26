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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardNo;

    @Column
    private String boardTitle;

    @Column
    private String boardWriter;

    @Column
    private String boardContent;

    @Column
    private LocalDateTime regDate;

    @Column
    private LocalDateTime updateDate;

    @Column
    private LocalDateTime deleteDate;

    @Column
    private long goodHit;

}
