package com.example.mission.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String title;

    @Setter
    @Lob
    private String contents; // contents를 content로 수정

    @Setter
    private String password; // 사용할 필요가 없을 수도 있음

    @Setter
    private Long boardsId; // boardsId를 boardsId로 수정

    @ManyToOne
    @Setter
    private Board board; // 엔티티 구조에 맞게 조정

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<Comment> commentList = new ArrayList<>();
}
