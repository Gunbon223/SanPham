package b1.entities.service;

import b1.entities.Product;

import java.util.Map;
import java.util.Scanner;

public class ProductService {
    public Product insertProduct(Scanner scan) {
        System.out.println("Nhập tên sp: ");
        String name = scan.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scan.nextLine());
        System.out.println("Nhập số lượng: ");
        int quantity = Integer.parseInt(scan.nextLine());
        Product product = new Product(name,price,quantity);
        return product;
    }

    public Map<Integer,Product> insertProductList(Scanner scan, Map<Integer,Product> mapProduct) {
        System.out.println("Nhập số sản phẩn muốn nhập: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Product product = insertProduct(scan);
            mapProduct.put(product.getId(),product);
        }
        return mapProduct;
    }
}
