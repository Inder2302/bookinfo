package com.goodbooks.bookinfo.controller;

import com.goodbooks.bookinfo.entity.Book;
import com.goodbooks.bookinfo.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookInfoController {

    @Autowired
    private BookInfoService bookInfoService;

    @GetMapping("/{bookId}")
    public Book getBookInformation(@PathVariable("bookId") String bookId) {
        Optional<Book> optbook = bookInfoService.getBookById(bookId);
        return optbook.isPresent() ? optbook.get(): null;
    }
}
