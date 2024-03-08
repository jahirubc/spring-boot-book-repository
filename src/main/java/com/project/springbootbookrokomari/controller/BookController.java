package com.project.springbootbookrokomari.controller;

import com.project.springbootbookrokomari.dto.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/books")
public class BookController {
    List<Book> bookList = new ArrayList<>();
    Integer id = 0;

    @GetMapping("/")
    public List<Book> getBooks(){
        return bookList;
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Integer id){
        for (Book book: bookList){
            if (book.getId().equals(id)){
                return book;
            }
        }
//        Book book = new Book();
//        book.setName("Money Management");
//        book.setPageCount(160);
//        return book;
        return null;
    }


    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        book.setId(++id);
        System.out.println(book);
        bookList.add(book);
        return book;
    }

    @PutMapping ("/update/{id}")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book book){
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId().equals(id)){
                book.setId(id);
                bookList.set(i, book);
            }
        }
        return book;
    }
    @DeleteMapping("/delete")
    public void deleteBook(@RequestParam Integer id){
        bookList.removeIf(book -> Objects.equals(book.getId(), id));
    }

}
