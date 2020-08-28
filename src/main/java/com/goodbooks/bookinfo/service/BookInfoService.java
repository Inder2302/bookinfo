package com.goodbooks.bookinfo.service;

import com.goodbooks.bookinfo.dao.BookRepository;
import com.goodbooks.bookinfo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BookInfoService {

/*    private List<Book> listOfBooks = Arrays.asList(
            new Book("1", "A Suitable Boy"),
            new Book("2", "White Tiger"),
            new Book("3", "Freedom at midnight")
    );*/

    @Autowired
    private BookRepository bookRepository;

    public Optional<Book> getBookById(String bookId) {
        return bookRepository.findById(bookId);
        //return listOfBooks.stream().filter(b-> b.getBookId().equalsIgnoreCase(bookId)).findFirst();
    }
}
