package com.berke.service;

import com.berke.repository.LikeRepository;
import com.berke.repository.entity.Like;

public class LikeService {
    LikeRepository likeRepository;

    public LikeService() {
        this.likeRepository=new LikeRepository();
    }


    public Like save(Like like) {
        return likeRepository.save(like);
    }


}
