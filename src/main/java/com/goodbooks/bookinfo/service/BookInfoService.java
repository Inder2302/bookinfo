package com.goodbooks.bookinfo.service;

import com.goodbooks.bookinfo.controller.BookInfoController;
import com.goodbooks.bookinfo.dao.BookRepository;
import com.goodbooks.bookinfo.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookInfoService {

    @Autowired
    private BookRepository bookRepository;

    Logger logger = LoggerFactory.getLogger(BookInfoService.class);

    public Optional<Book> getBookById(String bookId) {
        // Spring data JPA will lookup in book table by primary key
        logger.info("Looking up book information in database");
        return bookRepository.findById(bookId);
    }
}
