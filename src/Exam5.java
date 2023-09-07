import java.util.Scanner;

public class Exam5 {
    //Bài 5: Giải phương trình bậc 2: ax^2 + bx + c = 0 với hệ số được người dùng nhập vào
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a (a # 0): ");
        double a = sc.nextDouble();
        if (a == 0) {
            System.out.println("Hệ số a phải khác 0");
        } else {
            System.out.println("Nhập hệ số b: ");
            double b = sc.nextDouble();
            System.out.println("Nhập hệ số c: ");
            double c = sc.nextDouble();

            double delta = b*b - 4*a*c;
            if (delta < 0){
                System.out.println("Phương trình vô nghiệm");
            }
            else if (delta == 0){
                double x = -b/(2*a);
                System.out.println("Phương trình có 1 nghiệm kép: x = " + x);
            }
            else {
                double x1 = (-b + Math.sqrt(delta))/(2 * a);
                double x2 = (-b - Math.sqrt(delta))/(2 * a);
                System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}
