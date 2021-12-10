package service;

import model.Phone;
import model.PortablePhone;
import model.GenuinePhone;

import java.util.Scanner;

public class PhoneService implements IService{
    private static GenuinePhoneService genuinePhoneService = new GenuinePhoneService();
    private static PortablePhoneService portablePhoneService = new PortablePhoneService();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {

    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void search() {

    }
}
