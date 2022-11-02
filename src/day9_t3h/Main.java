package day9_t3h;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(); // 10 phan tu
//        list.add(1);
//        list.add(2);
//        list.add(4);
//        list.add(2);
//        System.out.println("Do lon cua list: " + list.size());
//        for (Integer i: list){
//            System.out.println(i);
//        }
//        list.remove(0);
//        System.out.println("Do lon cua list: " + list.size());
//        for (Integer i: list){
//            System.out.println(i);
//        }
//        // Mang doc
//        LinkedList<Integer> linkedList = new LinkedList<>();
        // HastSet -> Khong co phan tu trung nhau
        // TreeSet -> Khong co phan tu trung nhau (equal va hasscode) + Sap xep(comparable)
        Set<Student> students = new HashSet<>();
        students.add(new Student("b", "2"));
        students.add(new Student("a", "1"));
        students.add(new Student("c", "3"));

        System.out.println("Do lon cua set la: " + students.size());
        // Them hashCode
        // Map - ghi de len
        Map<String, Student> cache = new HashMap<>();
        // Buoc 1: Lay thong tin theo ma 123 tu database
        // Buoc 2: Put thong tin lay duoc vao cache
        // Buoc 3: Tra ve thong tin cho nguoi dung
        cache.put("123", new Student("A", "1"));
        // Buoc 1: Lay thong tin tu cache theo ma 123
        Student info123 = cache.get("123");
        // Buoc 2: Put thong tin lay duoc vao cache
        // Buoc 3: Tra ve thong tin cho nguoi dung
        cache.put("456",new Student("A","2"));
        for (Map.Entry<String, Student> entry : cache.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue().getName() + " " + entry.getValue().getCode());
        }
    }
}
