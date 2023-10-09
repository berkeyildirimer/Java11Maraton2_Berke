package com.berke.controller;

import com.berke.service.PhotoService;

public class PhotoController {
    PhotoService photoService;

    public PhotoController() {
        this.photoService=new PhotoService();
    }
}
