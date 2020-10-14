/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.ehm.CompletionStage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class BookList {
    /*
     *API to get the List of books returned with ComplationStage<List<Book>>
     */
    public static CompletionStage<List<Book>> getBookList() {
        return CompletableFuture.supplyAsync(() -> {
            List<Book> BookList = new ArrayList<>();
            BookList.add(new Book(1L, "K", null));
            BookList.add(new Book(2L, "I", null));
            BookList.add(new Book(3L, "N", null));
            BookList.add(new Book(4L, "G", null));
            BookList.add(new Book(5L, "L", null));
            BookList.add(new Book(6L, "A", null));
            BookList.add(new Book(7L, "N", null));
            BookList.add(new Book(8L, "D", null));
            return BookList;
        });


    }
    /*
     *API to get book scores
     */
    public static CompletionStage<Double> getScoreById(Long bookId) {
            Map<Long, Double> bookscore = new HashMap<>();
            bookscore.put(1L, 3.0);
            bookscore.put(2L, 3.1);
            bookscore.put(3L, 3.2);
            bookscore.put(4L, 3.3);
            bookscore.put(5L, 3.4);
            bookscore.put(6L, 3.5);
            bookscore.put(7L, 3.6);
            bookscore.put(8L, 3.7);
            return CompletableFuture.supplyAsync(() -> bookscore .get(bookId));
        }

    }

