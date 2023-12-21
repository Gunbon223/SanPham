package techmaster.entities;

import java.util.List;

public class User {
    private int id;
    private static int autoId;
    private String name;
    private String email;
    private String phone;
    private int roleId;
    private int bankId;
    private List<Integer> listCourseId;

    public User() {
        this.id = autoId++;
    }

    public User( String name, String email, String phone, int roleId, int bankId, List<Integer> listCourseId) {
        this.id = ++autoId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.roleId = roleId;
        this.bankId = bankId;
        this.listCourseId = listCourseId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getRoleId() {
        return roleId;
    }

    public int getBankId() {
        return bankId;
    }

    public String getListCourseId() {
        return listCourseId.toString();
    }
}
