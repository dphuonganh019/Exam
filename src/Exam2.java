import java.util.Scanner;

public class Exam2 {
    //Bài 2: Nhập số N (2<= N <=20) và in ra bảng cửu chương với số N.
    //Bảng cửu chương bắt đầu từ 1 và kết thúc là 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên N để tính bảng cửu chương, với điều kiều 2 <= N <= 20: ");
        int N = sc.nextInt();

        System.out.println("Bảng cửu chương của số bạn nhập là:");

        if (N < 2 || N > 20){
            System.out.println("Vui lòng nhập số nguyên thỏa mãn điều kiện 2 <= N <= 20");
        }
        else {
            for (int i = 1;i <= 10;i++){
                int product = N * i;
                System.out.println( N + " x " + i + " = " + product);
            }
        }

    }
}
