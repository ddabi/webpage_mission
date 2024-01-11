package com.example.mission.repository;

import com.example.forum.dto.ArticleDto;
import com.example.forum.entity.Article;
import com.example.forum.entity.Board;
import com.example.forum.entity.PostType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("article")
public class ArticleController {
    private final ArticleService articleService;
    private final BoardService boardService;
    private final PostTypeService postTypeService;

    @GetMapping("write-view/{boardId}")
    public String writeView(
            @PathVariable("boardId") Long boardId,
            Model model
    ) {
        // 글쓰기 화면 로직 구현
        return "article/write";
    }

    @PostMapping("write/{boardId}")
    public String write(
            @RequestParam("title") String title,
            @RequestParam("contents") String contents,
            @RequestParam("password") String password,
            @RequestParam("postType") Long postTypeId,
            @PathVariable("boardId") Long boardId
    ) {
        // 글쓰기 로직 구현
        return "redirect:/board/read/" + boardId;
    }

    // 다른 메서드들 구현...

}
