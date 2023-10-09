package com.berke.controller;

import com.berke.repository.entity.Post;
import com.berke.repository.entity.User;
import com.berke.service.PostService;

import java.util.List;
import java.util.Scanner;

import static com.berke.utility.Constants.getBaseEntity;


public class PostController {
    PostService postService;
    Scanner scanner;

    public PostController() {
        this.postService = new PostService();
        this.scanner = new Scanner(System.in);

    }


    public Post postOlustur(User user) {
        Long userId = user.getId();
        String comment = "";
        Long computerId = 0L;


        System.out.print("Comment yaziniz : ");
        comment = scanner.nextLine();
        System.out.print("Computer id Giriniz : ");
        computerId = Long.parseLong(scanner.nextLine());

        Post post = Post.builder()
                .comment(comment)
                .computerId(computerId)
                .baseEntity(getBaseEntity())
                .build();

        return postService.save(post);

    }

    public List<Post> findAll() {
        return postService.findAll();
    }

    public List<Post> birKisiyeAitPostlar(Long userId) {
        System.out.print("Kimin postunu görmek istersiniz? (Id'sini giriniz) : ");
        userId = Long.parseLong(scanner.nextLine());

        return postService.birKisiyeAitPostlar(userId);
    }
}
