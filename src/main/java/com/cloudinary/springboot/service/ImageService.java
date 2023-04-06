package com.cloudinary.springboot.service;

import com.cloudinary.springboot.dto.ImageModel;
import com.cloudinary.springboot.entity.Image;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface ImageService {

    public ResponseEntity<Map> uploadImage(ImageModel imageModel);
}
