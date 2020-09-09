package com.test.fileuploader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.fileuploader.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
