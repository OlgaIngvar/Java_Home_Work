package org.example;

import org.example.Object3.Books;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        Books book1 = new Books("Анна Каренина", "Толстой", 300.00, 1990, 102);
        Books book2 = new Books("Преступление и наказание", "Достоевский", 305.85, 1999, 135);
        Books book3 = new Books("Идиот", "Достоевский", 258.6, 1961, 124);
        Books book4 = new Books("Пир", "Платон", 1000.5, -435, 120);
        Books book5 = new Books("Ярмарка тщеславия", "Теккерей", 155.00, 1847, 210);
        Books book6 = new Books("Супружеская жизнь", "Эрве-Базен", 199.00, 1960, 350);
        Books book7 = new Books("Семья Резо", "Эрве-Базен", 199.00, 1970, 350);
        Books book8 = new Books("Трое в лодке, не считая собаки", "Джером К. Джером", 60.50, 2001, 105);

        List<Books> booksList = new ArrayList<>();

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);
        System.out.println(booksList);

        StringBuilder sortedBooks = new StringBuilder();
        for (Books books : booksList) {
            if (isPrime(books.getPgNum()) && books.getAuthor().toLowerCase().contains("а")) {
                if (books.getYear() >= 2010 && books.getYear() <= 2023) {
                    sortedBooks.append(books.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }

    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}
