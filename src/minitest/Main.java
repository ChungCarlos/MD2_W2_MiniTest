package minitest;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BookManage bookManage = new BookManage();

        ProgrammingBook b1 = new ProgrammingBook(1, "The Thorn Birds", 15.0, "Colleen McCullough", "English", "Novel");
        ProgrammingBook b2 = new ProgrammingBook(2, "The Old Man and the Sea,", 20.0, "Ernest Hemingway", "English", "Novel");
        ProgrammingBook b3 = new ProgrammingBook(3, "Kane and Abel", 16.5, "Jeffrey Archer", "English", "Novel");
        ProgrammingBook b4 = new ProgrammingBook(4, "Kẻ trộm sách", 17.5, "Markus Zusak", "English", "Novel");
        ProgrammingBook b5 = new ProgrammingBook(5, "Rừng Na Uy", 15.8, "Haruki Murakami", "English", "Novel");
        FictionBook f1 = new FictionBook(1, "Ubik", 14.0, "Philip K. Dick", "Fiction 1");
        FictionBook f2 = new FictionBook(2, "Dune", 13.0, "Frank Herbert", "Fiction 2");
        FictionBook f3 = new FictionBook(3, "Labyrinths", 16.5, "Jorge Luis Borges", "Fiction 1");
        FictionBook f4 = new FictionBook(4, "1984", 14.7, "George Orwell", "Fiction 3");
        FictionBook f5 = new FictionBook(5, "Neuromancer", 17.6, "William Gibson", "Fiction 2");
        // 5 cuốn sách thuộc lớp ProgrammingBook...
        bookManage.addBook(b1);
        bookManage.addBook(b2);
        bookManage.addBook(b3);
        bookManage.addBook(b4);
        bookManage.addBook(b5);
        // 5 cuốn sách thuộc lớp FictionBook.
        bookManage.addBook(f1);
        bookManage.addBook(f2);
        bookManage.addBook(f3);
        bookManage.addBook(f4);
        bookManage.addBook(f5);
        System.out.println("All Book: \n"
                + f1 + "\n"
                + f2 + "\n"
                + f3 + "\n"
                + f4 + "\n"
                + f5 + "\n"
                + b1 + "\n"
                + b2 + "\n"
                + b3 + "\n"
                + b4 + "\n"
                + b5);

        //Tính tổng tiền của 10 cuốn sách...
        double sum = 0.0;
        for (Book book : bookManage.getBook()) {
            sum += book.getPrice();
        }
        System.out.println("Total price: " + sum);

        //Đếm số sách Fiction có category là Fiction 1...
        int count = 0;
        for (Book book : bookManage.getBook()) {
            if (book instanceof FictionBook) {
                FictionBook fb = (FictionBook) book;
                if (fb.getCategory().equals("Fiction 1")) {
                    count++;
                }
            }
        }
        System.out.println("The number of books with category 'fiction 1' is: " + count);

        //Đếm số sách có giá < 100
        int countPrice = 0;
        for (Book book : bookManage.getBook()) {
            if (book.getPrice() < 100) {
                countPrice++;
            }
        }
        System.out.println("The number of books with price < 100$ is: " + countPrice);
    }
}
