package com.example.service;

import com.example.model.UploadedFile;
import com.example.repo.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;
import java.util.HashMap;

@Service
public class FileStorageService {

    @Autowired
    private FileRepository fileRepository;

    public UploadedFile storeFile(MultipartFile file) throws Exception {
        UploadedFile dbFile = new UploadedFile();

        dbFile.setName(file.getOriginalFilename());
        dbFile.setContentType(file.getContentType());
        dbFile.setContent(file.getBytes());  // loads into memory (okay for small files)

        return fileRepository.save(dbFile);
    }
}
