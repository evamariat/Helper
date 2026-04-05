package com.example.repo;

import com.example.model.UploadedFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<UploadedFile, Long> {
    // you can add custom methods here later if needed
}
