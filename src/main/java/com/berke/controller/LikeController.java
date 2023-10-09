package com.berke.controller;

import com.berke.repository.entity.Like;
import com.berke.repository.entity.User;
import com.berke.service.LikeService;
import static com.berke.utility.Constants.*;

import java.util.Scanner;

public class LikeController {
    LikeService likeService;
    Scanner scanner;

    public LikeController() {
        this.likeService =new LikeService();
        this.scanner = new Scanner(System.in);
    }

    public Like begeniYap(User user) {

        Long userId=user.getId();
        Long postId = 0L;
        System.out.println("Begeni yapacaginiz postun Id'sini giriniz");
        postId = Long.parseLong(scanner.nextLine());

        Like like = Like.builder()
                .userId(userId)
                .postId(postId)
                .baseEntity(getBaseEntity())
                .build();
        return likeService.save(like);
    }

}
