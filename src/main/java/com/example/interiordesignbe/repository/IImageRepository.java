package com.example.interiordesignbe.repository;

import com.example.interiordesignbe.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IImageRepository extends JpaRepository<Image,Long> , JpaSpecificationExecutor<Image> {
}
