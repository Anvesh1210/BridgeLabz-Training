package com.collectors.librarybookstatistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookStatistics {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
        books.add(new Book("Clean Code", "Programming", 464));
        books.add(new Book("Effective Java", "Programming", 416));
        books.add(new Book("The Alchemist", "Finance", 208));
        books.add(new Book("Atomic Habits", "Self-Help", 320));
        books.add(new Book("Rich Dad Poor Dad", "Finance", 336));
        books.add(new Book("The Hobbit", "Fantasy", 310));
        
        Map<String, Integer> map = books.stream().collect(Collectors.groupingBy(Book::getGenre,Collectors.summingInt(Book::getNoOfPages)));
        System.out.println("No of pages according to genre");
        System.out.println(map);
	}
}
