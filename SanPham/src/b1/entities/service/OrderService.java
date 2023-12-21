package b1.entities.service;

import b1.entities.Order;
import b1.entities.OrderDetail;
import b1.entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderService {
    OrderDetailService orderDetailService = new OrderDetailService();
    PersonService personService = new PersonService();
    public Order insertOrder(Scanner scan, Map<Integer, Product> productMap) {

        System.out.println("Nhập ngày đặt hàng:dd/mm/yyyy ");
        String orderDate =  scan.nextLine();
        System.out.println("Nhập tổng tiền: ");
        int total = Integer.parseInt(scan.nextLine());
        System.out.println("Nhập số sản phẩm muốn đặt: ");
        int n = Integer.parseInt(scan.nextLine());
        Map<Integer,OrderDetail> orderDetailMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            OrderDetail orderDetail = orderDetailService.insertOrderDetail(scan,productMap);
            orderDetailMap.put(orderDetail.getId(),orderDetail);
        }
        Order order = new Order(total,personService.insert(scan),orderDetailMap);
        return order;
    }

}
