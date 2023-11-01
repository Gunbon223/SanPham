package Iterator.service;

import Iterator.entites.Student;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class StudentService {
    public Student inputStudent(Scanner scan) {
        Student student = new Student();
        System.out.println("nhap ten: ");
        student.setName(scan.nextLine());
        System.out.println("nhap diem: ");
        student.setScore(Integer.parseInt(scan.nextLine()));
        return student;
    }

    public void run(Map<Integer,Student> integerStudentMap,Scanner scan) {
        System.out.println("Nhap so hs muon them: ");
        int n= Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Student student= inputStudent(scan);
            integerStudentMap.put(student.getId(),student);
        }

    }
    public void getStudentById(Map<Integer,Student> studentMap, Scanner scan) {
        boolean loop = true;
        while (loop) {
            System.out.println("Nhap id hs can tim: ");
            int inputId = Integer.parseInt(scan.nextLine());
            if(studentMap.get(inputId)==null) {
                System.out.println("k co hs id nay");
            }
            else {
                System.out.println(studentMap.get(inputId));
            loop = false;
            }
        }

    }

    public void getAverageScore(Map<Integer,Student> studentMap) {
        int count=studentMap.size();
        double sum=0;
        for (Map.Entry<Integer,Student> entry:
             studentMap.entrySet()) {
              sum+=entry.getValue().getScore();
        }
        System.out.println("Diem trung binh hoc sinh la: "+ (sum/count));
    }

}
