package day2_t3h;

public class Main {
    public static void main(String[] args) {
        boolean bienBool = false;
        char bienChar = 'a'; // 1 byte 8 bit 0- 127
        char bienCharB = 'b';
        System.out.println(bienCharB - bienChar);
        byte bienByte = 0; // so nguyen to chay tu -128 -127
        short bienShort = 0; // 2 byte
        int bienInt = 0; // 4 byte
        long bienLong = 0; // 8byte
        float bienFloat = 0f; //4byte
        double bienDouble = 0; //8byte

        String str = "Hello";

        int a = 10;
        int b = a++ ;  // int b = a; a = a + 1;
        int c = ++a; // a = a + 1; int c = a;
        System.out.println(a + " | " + b + " | " + c);
        double pi = 3.144;
        double d = pi * 6;
        double r = pi * 3 * 3 ;
    }
}
