package com.goodbooks.bookinfo.controller;

import com.goodbooks.bookinfo.entity.Book;
import com.goodbooks.bookinfo.service.BookInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookInfoController {

    Logger logger = LoggerFactory.getLogger(BookInfoController.class);

    @Autowired
    private BookInfoService bookInfoService;

    @GetMapping("/{bookId}")
    public Book getBookInformation(@PathVariable("bookId") String bookId) {
        logger.info("Got a request for book information. Book ID - {}", bookId);
        Optional<Book> optbook = bookInfoService.getBookById(bookId);
        logger.info("Returning book information");
        // if book is not present in database - return null
        return optbook.isPresent() ? optbook.get(): null;
    }
}
