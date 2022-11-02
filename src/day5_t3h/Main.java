package day5_t3h;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        // Ham khoi tao mac dinh
//        Person p = new Person(); // Tao ra 1 nguoi
//        p.setHoVaTen("Duogn qua");
//        p.setNgaySinh("20/20/2002");
//        p.setTuoi((byte)22); // ep kieu
//        p.show();
//        System.out.println("+=================+");
//        Person p2 = new Person("Tran van a",(byte)10,"20,202,200");
//        p2.show();
        Scanner scanner = new Scanner(System.in);
        Person p = new Person();
        p.nhapThongTin(scanner);
        p.show();
        System.out.println("==================================");
        Student s = new Student();
        s.nhapThongTin(scanner);
        s.show();
        System.out.println("==================================");
        Worker w = new Worker();
        w.nhapThongTin(scanner);
        w.show();
        // Check regex nam
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
//        Date date = null;
//        try {
//            date = simpleDateFormat.parse("161as/09/2022");
//            System.out.println(date.getTime());
//        } catch (ParseException e) {
//            System.out.println("Loi");
//        }
    }
}
