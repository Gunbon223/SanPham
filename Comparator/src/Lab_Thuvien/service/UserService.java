package Lab_Thuvien.service;

import Lab_Thuvien.entites.Book;
import Lab_Thuvien.entites.User;
import Lab_Thuvien.utility.Utility;

import javax.swing.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserService {

    Utility utility = new Utility();
    public void inpuUser(Map<Integer, User> bookUser, Scanner scan) {
        User user = new User();
        System.out.println("Nhap ten sach: ");
        user.setName(utility.inputString(scan));
        System.out.println("nhap dia chi:");
        user.setAddress(utility.inputString(scan));
        System.out.println("Nhap so dien thoai: ");
        user.setPhoneNumber(utility.inputString(scan));
        bookUser.put(user.getId(),user);
    }

    public User findUser(Map<Integer,User> bookUser,Scanner scan) {
        while (true) {
            int id= utility.inputInt(scan);
            if (bookUser.containsKey(id)) {
                return bookUser.get(id);
            }
            else {
                System.out.println("Nhap sai nhap lai");
            }
        }
    }

    public void delete(Map<Integer, User> bookUser,Scanner scan) {
        String choice = "";
        do {
            System.out.println("Nhap ten user muon xoa: ");
            String userFind= utility.inputString(scan);
            Set<Integer> set = bookUser.keySet();
            for (Integer key:
                    set) {
                if (bookUser.get(key).getName().equalsIgnoreCase(userFind)) {
                    bookUser.remove(key);
                    System.out.println("da xoa sach tim thay");
                }
                else {
                    System.out.println("khong tim thay lam lai ? y/n");
                    choice = utility.inputString(scan);
                }
            }
        }
        while (choice.equalsIgnoreCase("y"));
    }

    public void update(Map<Integer ,User> bookUser,Scanner scan) {
        String choice = "";
        do {
            System.out.println("Nhap ten user muon doi: ");
            String userFind= utility.inputString(scan);
            Set<Integer> set = bookUser.keySet();
            for (Integer key:
                    set) {
                if (bookUser.get(key).getName().equalsIgnoreCase(userFind)) {
                    System.out.println("Nhap ten: ");
                    bookUser.get(key).setName(utility.inputString(scan));
                    System.out.println("nhap dia chi:");
                    bookUser.get(key).setPhoneNumber(utility.inputString(scan));
                    System.out.println("Nhap sdt: ");
                    bookUser.get(key).setPhoneNumber(utility.inputString(scan));
                } else {
                    System.out.println("khong tim thay lam lai ? y/n");
                    choice = utility.inputString(scan);
                }
            }
            }

        while (choice.equalsIgnoreCase("y"));
    }
}

