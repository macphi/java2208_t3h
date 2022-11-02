package day9_t3h;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSort {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("b", "2"));
        studentList.add(new Student("a", "1"));
        studentList.add(new Student("f", "4"));
        studentList.add(new Student("c", "3"));
        // Cach 1
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName()); // 0 bang nhau, > 0 lon hon, <0 la nho hon // tang dan
////                return o2.getName().compareTo(o1.getName());// Giam dan
//            }
//        });
//        for (Student student : studentList
//             ) {
//            System.out.println(student.toString());
//        }
        // Cach 2 // Implements Comparable
        studentList.sort(null);
        for (Student student : studentList){
            System.out.println(student.toString());
        }
    }
}
