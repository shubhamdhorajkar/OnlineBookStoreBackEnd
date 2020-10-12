package com.book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.book.Entity.BookCategory;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
