Defines the Book entity class Book (field id, name, score)
Call an API to get a List of books return ComplationStage<List<Book>>
An API is called to get the score of the book with the id of the book and the return value of the CompletionStage<Double>. The API passes in a bookId and then returns the score of the current book, which can be modeled using a map.
Using CompletionStage/CompletableFuture books grading fill into the corresponding book list.
Finally, the populated Book list is printed.
Note :(since there is no corresponding API, you can just define the method and return the data)