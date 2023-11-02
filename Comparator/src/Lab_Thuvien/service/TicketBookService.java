package Lab_Thuvien.service;

import Lab_Thuvien.entites.Book;
import Lab_Thuvien.entites.User;

import java.util.Map;
import java.util.Scanner;

public class TicketBookService {
    BookService bookService = new BookService();
    UserService userService = new UserService();
    public  void inputTicket(Map<Integer, Book> bookMap, Map<Integer, User> bookUser ,Map<> ,Scanner scan ) {
        System.out.println("Nhap ten sach: ");
        bookService.findBook(bookMap,scan).getId();

        System.out.println("Nhap ten user: ");
    }
}
