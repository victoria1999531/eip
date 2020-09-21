/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.ehm.CompletionStage;

import java.util.List;
import java.util.concurrent.CompletionStage;
public class BookMain {
    public static void main(String[] args)  {
        CompletionStage<List<Book>> completableFuture = BookList.getBookList().thenApply(Booklist -> {
            for (Book book :getBookList.BookList) {
                BookList.getScoreById(book.getId()).thenAccept(score -> book.setScore(score));
                }
                System.out.println(BookList);
                return Booklist;
        });

        System.out.println(completableFuture);

    }
    }
