package com.example.mission.dto;

import com.example.forum.entity.Article; // Change this to the appropriate entity package
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ArticleDto {
    private Long id;
    private String title;
    private String content;
    private String password; // Password field may or may not be used
    private Long boardId; // Change boardsId to boardId for consistency

    private List<CommentDto> commentDtoList = new ArrayList<>();

    public ArticleDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public ArticleDto(String title, String content, String password) {
        this.title = title;
        this.content = content;
        this.password = password;
    }

    public ArticleDto(String title, String content, String password, Long boardId) {
        this.title = title;
        this.content = content;
        this.password = password;
        this.boardId = boardId;
    }

    public static ArticleDto fromEntity(Article article) {
        ArticleDto dto = new ArticleDto();
        dto.id = article.getId();
        dto.title = article.getTitle();
        dto.content = article.getContents();
        dto.password = article.getPassword(); // Password field from the first code
        dto.boardId = article.getBoardId(); // Change accordingly based on entity field name

        dto.commentDtoList = new ArrayList<>(); // Initialize the list

        return dto;
    }
}