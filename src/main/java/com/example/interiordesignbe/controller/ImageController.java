package com.example.interiordesignbe.controller;

import com.example.interiordesignbe.config.AppListResponse;
import com.example.interiordesignbe.entity.Image;
import com.example.interiordesignbe.service.IImageService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/images")
public class ImageController {

    private final IImageService iImageService;

    public ImageController(IImageService iImageService) {
        this.iImageService = iImageService;
    }

    @GetMapping
    public ResponseEntity<?> getImages() {
        Page<Image> result = iImageService.findAll();
        return ResponseEntity.ok(new AppListResponse<>(result.getContent(), result.getTotalPages(), result.getTotalElements()));
    }


}
