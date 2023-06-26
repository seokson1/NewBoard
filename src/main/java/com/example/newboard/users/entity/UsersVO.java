package com.example.newboard.users.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UsersVO {

    @Id
    private String userId;

    @Column
    private String userPw;

    @Column
    private LocalDateTime userCreateDate;

    @Column
    private LocalDateTime userUpdateDate;

    @Column
    private LocalDateTime userDeleteDate;

    @Column
    private int role;

}
