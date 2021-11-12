package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void add(List<Product> products) {
        int id, price;
        String name, manufacturer, desc;
        Scanner scr = new Scanner(System.in);
        System.out.print("Nhập Id: ");
        id = scr.nextInt();
        scr.nextLine();
        System.out.print("Nhập name: ");
        name = scr.nextLine();
        System.out.print("Nhập manufacturer: ");
        manufacturer = scr.nextLine();
        System.out.print("Nhập price: ");
        price = scr.nextInt();
        scr.nextLine();
        System.out.print("Nhập desc: ");
        desc = scr.nextLine();
        products.add(new Product(id, name, manufacturer, price, desc));
    }

    public static void search(List<Product> products) {
        Scanner scr = new Scanner(System.in);
        int fId;
        System.out.print("Nhập index sảm phẩm cần tìm: ");
        fId = scr.nextInt();
        System.out.println(products.get(fId));
        writeToFile("product.txt", products);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Scanner scr = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn: " +
                    "\n1. Thêm sản phẩm" +
                    "\n2. Tìm kiếm sản phẩm" +
                    "\n0. Exit");
            choice = scr.nextInt();
            if (choice == 1) {
                System.out.println("Thêm sán phẩm: ");
                add(products);
            } else if (choice == 2) {
                search(products);
            }
        } while (choice != 0);
        writeToFile("product.txt", products);
        List<Product> productDataFromFile = readDataFromFile("product.txt");
        for (Product product : productDataFromFile) {
            System.out.println(product);
        }
    }
}
