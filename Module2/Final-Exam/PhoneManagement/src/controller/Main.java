package controller;

import model.PortablePhone;
import service.GenuinePhoneService;
import service.PhoneService;
import service.PortablePhoneService;

import java.util.Scanner;

public class Main {
    private static GenuinePhoneService genuinePhoneService = new GenuinePhoneService();
    private static PortablePhoneService portablePhoneService = new PortablePhoneService();
    private static PhoneService phoneService = new PhoneService();
    public static void main(String[] args) {
        boolean flag =true;
        do {
            System.out.println("Chọn chức năng cần thực hiên" +
                    "\n1.add" +
                    "\n2.display" +
                    "\n3.edit" +
                    "\n4.delete"+
                    "\n5.search"+
                    "\n6.Exit");
            Scanner scanner = new Scanner(System.in);
            int chooseMenu = scanner.nextInt();
            switch (chooseMenu){
                case 1:
                    System.out.println("Bạn Muốn Thêm Điện Thoai xách tay(1) hay Điện Thoại Chính hãng(2)");

                    int chooseOption = scanner.nextInt();
                    switch(chooseOption){
                        case 1:
                            System.out.println("Bạn Muốn Thêm Điện Thoai xách tay");

                            portablePhoneService.add();
                            break;
                        case 2:
                            System.out.println("Bạn Muốn Thêm Điện Thoại Chính hãng");
                            genuinePhoneService.add();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("chức năng display");
                    portablePhoneService.display();
                    break;
                case 3:
                    System.out.println("chức năng update");
                        portablePhoneService.edit();
                    break;
                case 4:
                    System.out.println("chức năng delete");
                        portablePhoneService.delete();
                    break;
                case 5:
                    System.out.println("chức năng search");
                        portablePhoneService.search();
                    break;
                default:
                    flag=false;
            }
        }while (flag);
    }
}
