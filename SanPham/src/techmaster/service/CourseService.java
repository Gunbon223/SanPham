package techmaster.service;

import techmaster.entities.Course;

import java.time.LocalDate;
import java.util.ArrayList;

public class CourseService {
    public void displayCourseStartDay(ArrayList<Course> course ) {
        for (Course i : course) {
            System.out.println(i.toString());
        }
    }


}
