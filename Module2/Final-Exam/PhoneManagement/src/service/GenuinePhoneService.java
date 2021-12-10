package service;

import model.GenuinePhone;
import util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenuinePhoneService implements IService {
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
        System.out.println("nhập hạn bảo hành");
        String warrantyPeriod = scanner.nextLine();
        System.out.println("nhập phạm vi bảo hành");
        String warrantyCoverage = scanner.nextLine();
        GenuinePhone genuinePhone = new GenuinePhone(id,name,price,quantity,producer,warrantyPeriod,warrantyCoverage);
        List<GenuinePhone> genuinePhoneList = new ArrayList<>();
        genuinePhoneList.add(genuinePhone);
        ReadAndWriteFile.writeGPhoneListToCSV(genuinePhoneList,true);
    }

    @Override
    public void display() {
        System.out.println("hiên thi ra danh sách");
        List<GenuinePhone> genuinePhoneList = ReadAndWriteFile.readGPhoneListFromCSV();
        for (int i=0;i<genuinePhoneList.size();i++){
            System.out.println((i+1)+"."+genuinePhoneList.get(i));
        }
    }

    @Override
    public void delete() {
        display();
        System.out.println("chọn dien thoai cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        List<GenuinePhone> genuinePhoneList = ReadAndWriteFile.readGPhoneListFromCSV();
        genuinePhoneList.remove(index-1);
        ReadAndWriteFile.writeGPhoneListToCSV(genuinePhoneList,false);

    }

    @Override
    public void edit() {
        display();
        System.out.println("chọn dien thoai cần edit");
        int index = Integer.parseInt(scanner.nextLine());
        List<GenuinePhone> genuinePhoneList = ReadAndWriteFile.readGPhoneListFromCSV();
        System.out.println("nhập tên cần sửa");
        String nameNew= scanner.nextLine();
        genuinePhoneList.get(index-1).setName(nameNew);
        ReadAndWriteFile.writeGPhoneListToCSV(genuinePhoneList,false);
    }

    @Override
    public void search() {
        System.out.println("nhập tên cần tìm kiếm");
        String searchName = scanner.nextLine();
        List<GenuinePhone> genuinePhoneList = ReadAndWriteFile.readGPhoneListFromCSV();
        for (GenuinePhone genuinePhone: genuinePhoneList){
            if (genuinePhone.getName().contains(searchName)){// tìm kiếm gần đúng
                System.out.println(genuinePhone.toString());
            }
        }
    }
}
