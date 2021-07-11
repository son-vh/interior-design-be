package com.example.interiordesignbe.service.implement;

import com.example.interiordesignbe.entity.Image;
import com.example.interiordesignbe.repository.IImageRepository;
import com.example.interiordesignbe.service.IImageService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ImageService implements IImageService {

    private final IImageRepository iImageRepository;

    public ImageService(IImageRepository iImageRepository) {
        this.iImageRepository = iImageRepository;
    }


    @Override
    public Page<Image> findAll() {
        Pageable pageable = PageRequest.of(0, 10);
        return iImageRepository.findAll(pageable);
    }
}
