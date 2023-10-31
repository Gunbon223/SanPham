package Iterator;

import Iterator.entites.Student;
import Iterator.service.StudentService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Student> studentMap = new HashMap<>();
        StudentService studentService = new StudentService();
        studentService.run(studentMap,scanner);
        studentService.getStudentById(studentMap,scanner);
        studentService.getAverageScore(studentMap);
        }
}