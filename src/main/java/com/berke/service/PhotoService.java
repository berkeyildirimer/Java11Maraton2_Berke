package com.berke.service;

import com.berke.repository.PhotoRepository;

public class PhotoService {
    PhotoRepository photoRepository;

    public PhotoService() {
        this.photoRepository=new PhotoRepository();
    }
}
