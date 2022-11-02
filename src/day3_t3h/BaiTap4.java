package day3_t3h;

import java.util.Scanner;
import java.util.regex.Pattern;
public class BaiTap4 {
    public static void main(String[] args) {
//        String phoneRegex = "(0|84|\\+84)(\\d{3})((\\.|-)?)(\\d{3})((\\.|-)?)(\\d{3})";
        String phoneRegex = "((84|0[3|5|7|8|9])+([0-9]{8})\\b)";
        Pattern pattern = Pattern.compile(phoneRegex);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien thoai: ");
        String phone = scanner.nextLine();
        if (pattern.matcher(phone).find()){
            System.out.println("So "+ phone + " dung dinh dang sdt: ");
        }else {
            System.out.println("So "+ phone + " khong dung dinh dang sdt: ");
        }
    }
}
