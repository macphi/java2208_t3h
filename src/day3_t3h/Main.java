package day3_t3h;

public class Main {
    public static void main(String[] args) {
        String h1 = "xin chao t3h";
        String h2 = new String("xin chao t3h");
        String h3 = "xin chao t3h";
        String h4 = new String("xin chao t3h");
        if (h1 == h2) {
            System.out.println("h1 bang h2");
        } else {
            System.out.println("h1 khac h2");
        }
        if (h1 == h3) {
            System.out.println("h1 bang h3");
        } else {
            System.out.println("h1 khac h3");
        }
        if (h4 == h2) {
            System.out.println("h4 bang h2");
        } else {
            System.out.println("h4 khac h2");
        }
        if (h4.equals(h2)){
            System.out.println("h4 equals h2");
        }else {
            System.out.println("h4 not equals h2");
        }
        System.out.println("Do dai chuoi h4 la:" + h4.length());
        System.out.println("Ky tu tai vi tri 0 la: " +h4.charAt(0));
        System.out.println("Chuoi bat dau tu vi tri 1 la: "+h4.substring(1));
        System.out.println("Chuoi bat dau tu vi tri 1 den 10 la: "+h4.substring(1,10));
        String split[] = h4.split("");
        for (int i = 0; i < split.length; i++){
            System.out.println(split[i]);
        }
    }
}
