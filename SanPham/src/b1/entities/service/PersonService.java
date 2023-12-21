package b1.entities.service;

import b1.entities.Person;

import java.util.Scanner;

public class PersonService {
    public Person insert(Scanner scan) {
        System.out.println("Nhập tên: ");
        String name = scan.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scan.nextLine();
        System.out.println("Nhập role: ");
        String role = scan.nextLine();
        Person person = new Person(name,address,role);
        return person;
    }
}
