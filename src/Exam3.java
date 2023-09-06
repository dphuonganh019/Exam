import java.util.Scanner;

public class Exam3 {
    // Bài 3: Người dùng nhập vào 1 mảng số N và yêu cầu in ra các kết quả sau:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Nhập phần tử của mảng: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Yêu cầu 1: In ra danh sách số lẻ trong mảng
        System.out.println("Các số lẻ trong mảng là: ");
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        // Yêu cầu 2: In ra danh sách số chẵn trong mảng
        System.out.println("Các số chẵn trong mảng là: ");
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        // Yêu cầu 3: In ra danh sách số nguyên tố trong mảng
        System.out.println("Các số nguyên tố trong mảng là:");
        for (int i = 0; i < N; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        // Yêu cầu 4: In ra dãy số Fibonacci trong mảng
        System.out.println("Các số Fibonacci trong mảng đã nhập là: ");
        for (int i = 0; i < N; i++) {
            if (isFibo(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isFibo(int number) {
        int a = 0;
        int b = 1;
        while (b < number) {
            int sum = b;
            b = a + b;
            a = sum;
        }
        return b == number;
    }
}
