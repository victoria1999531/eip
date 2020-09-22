/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.ehm.CompletionStage;

import java.util.List;
import java.util.concurrent.CompletionStage;
public class BookMain {
    /*
     *Fill in the corresponding book list with the book's score.Finally, the populated Book list is printed.
     */
    public static void main(String[] args)  {
        CompletionStage<List<Book>> completableFuture = BookList.getBookList().thenApply(list -> {
            for (Book book :list) {
                BookList.getScoreById(book.getId()).thenAccept(score -> book.setScore(score));
                }
                System.out.println(list);
                return list;
        });

        System.out.println(completableFuture);

    }
    }
