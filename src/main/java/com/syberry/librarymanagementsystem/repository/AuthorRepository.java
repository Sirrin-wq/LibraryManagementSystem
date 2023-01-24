package com.syberry.librarymanagementsystem.repository;

import com.syberry.librarymanagementsystem.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
