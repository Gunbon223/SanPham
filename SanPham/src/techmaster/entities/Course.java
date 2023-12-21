package techmaster.entities;

import java.util.ArrayList;

public class Course {
    private int id;
    private static int autoId;
    private String name;
    private String description;
    private Double price;
    private String type_course  ;
    private int vote;
    private ArrayList<Integer>  listUserId;
    private ArrayList<Integer>  startDateId;

    public Course( String name, String description, Double price, String type_course, int vote, ArrayList<Integer> listUserId, ArrayList<Integer> startDateId) {
        this.id = ++autoId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.type_course = type_course;
        this.vote = vote;
        this.listUserId = listUserId;
        this.startDateId = startDateId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getType_course() {
        return type_course;
    }

    public int getVote() {
        return vote;
    }

    public ArrayList<Integer> getListUserId() {
        return listUserId;
    }

    public ArrayList<Integer> getStartDateId() {
        return startDateId;
    }
}
