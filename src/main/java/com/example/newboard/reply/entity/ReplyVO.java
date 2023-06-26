package com.example.newboard.reply.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity

public class ReplyVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long replyNo;

    @Column
    private String replyContent;

    @Column
    private LocalDateTime replyRegDate;

    @Column
    private LocalDateTime replyUpdateDate;

    @Column
    private  LocalDateTime replyDeleteDate;



}
