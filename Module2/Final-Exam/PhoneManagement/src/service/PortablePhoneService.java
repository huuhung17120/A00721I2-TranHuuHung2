package service;

import model.Phone;
import model.PortablePhone;
import util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PortablePhoneService implements IService {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số lượng");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập nhà sản xuất");
        String producer = scanner.nextLine();
        System.out.println("nhập quoc gia");
        String country = scanner.nextLine();
        System.out.println("nhập trang thai");
        String status = scanner.nextLine();
        PortablePhone portablePhone = new PortablePhone(id,name,price,quantity,producer,country,status);
        List<PortablePhone> portablePhoneList = new ArrayList<>();
        portablePhoneList.add(portablePhone);
        ReadAndWriteFile.writePPhoneListToCSV(portablePhoneList,true);
    }

    @Override
    public void display() {
        System.out.println("hiên thi ra danh sách");
        List<PortablePhone> portablePhoneList = ReadAndWriteFile.readPPhoneListFromCSV();
        for (int i=0;i<portablePhoneList.size();i++){
            System.out.println((i+1)+"."+portablePhoneList.get(i));
        }
    }

    @Override
    public void delete() {
        display();
        System.out.println("chọn dien thoai cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        List<PortablePhone> portablePhoneList = ReadAndWriteFile.readPPhoneListFromCSV();
        portablePhoneList.remove(index-1);
        ReadAndWriteFile.writePPhoneListToCSV(portablePhoneList,false);


    }

    @Override
    public void edit() {
        display();
        System.out.println("chọn dien thoai cần edit");
        int index = Integer.parseInt(scanner.nextLine());
        List<PortablePhone> portablePhoneList = ReadAndWriteFile.readPPhoneListFromCSV();
        System.out.println("nhập tên cần sửa");
        String nameNew= scanner.nextLine();
        portablePhoneList.get(index-1).setName(nameNew);
        ReadAndWriteFile.writePPhoneListToCSV(portablePhoneList,false);

    }

    @Override
    public void search() {
        System.out.println("nhập tên cần tìm kiếm");
        String searchName = scanner.nextLine();
        List<PortablePhone> portablePhoneList = ReadAndWriteFile.readPPhoneListFromCSV();
        for (PortablePhone portablePhone: portablePhoneList){
            if (portablePhone.getName().contains(searchName)){// tìm kiếm gần đúng
                System.out.println(portablePhone.toString());
            }
        }
    }
}
