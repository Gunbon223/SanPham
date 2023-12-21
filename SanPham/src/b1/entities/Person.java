package b1.entities;

public class Person {
    private int id;
    private static int autoId;
    private String name;
    private String address;
    private String role;

    public Person( String name,String address, String role) {
        this.name= name;
        this.id =++ autoId;
        this.address = address;
        this.role = role;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
