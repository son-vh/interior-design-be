package com.example.interiordesignbe.service;

import com.example.interiordesignbe.entity.Image;
import org.springframework.data.domain.Page;


public interface IImageService {

    Page<Image> findAll();
}
