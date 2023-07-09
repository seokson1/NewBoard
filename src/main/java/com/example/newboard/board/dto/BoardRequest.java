package com.example.newboard.board.dto;

import com.example.newboard.board.entity.BoardVO;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BoardRequest {

    private String title;
    private String content;
    private String writer;

    public BoardVO toEntity() {
        return BoardVO.builder()
                .boardTitle(title)
                .boardContent(content)
                .boardWriter(writer)
                .regDate(LocalDateTime.now())
                .build();
    }
}
