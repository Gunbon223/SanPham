package b1.entities;

import java.time.LocalDate;
import java.util.Map;

public class Order {
    private int id;
    private static int autoId;
    private LocalDate orderDate;
    private int total;
    private int personId;
    private Map<Integer,OrderDetail> orderDetailMap;

    public Order( int total, int personId, Map<Integer, OrderDetail> orderDetailMap) {
        this.id = ++autoId;
        this.orderDate = orderDate.toString().equals("")? LocalDate.now():orderDate;
        this.total = total;
        this.personId = personId;
        this.orderDetailMap = orderDetailMap;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", total=" + total +
                ", person=" + personId +
                ", orderDetailMap=" + orderDetailMap +
                '}';
    }
}
