package com.example.backendJava.service.image;

import com.example.backendJava.dto.ImageDto;
import com.example.backendJava.entity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageService {

    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);

    void updateImage(MultipartFile file, Long imageId);

    Image getImageById(Long id);

    void deleteImageById(Long id);
}
