package com.siit.tutorial.exercise3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Domain object representing a collection of books
 */
public class Books {
    static {
        Book book1 = new Book("Star Wars", new Author("Jhon", "Doe"), new Publisher("Editura Junimea"));
    }

    /**
     * Apply a mapping of Books to titles (Strings)
     *
     * @param books - books to transform
     * @return list of book titles
     */
    public static List<String> titlesOf(List<Book> books) {
        return books.stream()
                .map(n -> n.getTitle())
                .collect(Collectors.toCollection(ArrayList::new));
        // [your code here]


    }

    /**
     * Apply a mapping of Books to their author's full names
     *
     * @param books - books to transform
     * @return list of author full names
     */
    public static List<String> namesOfAuthorsOf(List<Book> books) {
        return books.stream()
                .map(n -> n.getAuthor().getFirstName() + " " + n.getAuthor().getLastName())
                .collect(Collectors.toCollection(ArrayList::new));
        // [your code here]


    }

    /**
     * Apply a mapping of Books to a unique set of their publishers
     *
     * @param books - books to transform
     * @return set of publishers
     */
    public static Set<Publisher> publishersRepresentedBy(List<Book> books) {
        return books.stream()
                .map(book -> book.getPublisher())
                .collect(Collectors.toCollection(HashSet::new));
        // [your code here]


    }
}
