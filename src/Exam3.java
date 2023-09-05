import java.util.Scanner;

public class Exam3 {
    //Bài 3: Người dùng nhập vào 1 mảng số N và yêu cầu in ra các kết quả sau:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int N = sc.nextInt();

        int [] arr = new int[N];
        System.out.println("Nhập phần tử của mảng: ");
        for (int i = 0;i < N;i++){
            arr[i] = sc.nextInt();
        }
//        //Yêu cầu 1: In ra danh sách số lẻ trong mảng
//        System.out.println("Các số lẻ trong mảng là: ");
//        for (int i = 0; i < N; i++){
//            if(arr[i] % 2 != 0){
//                System.out.print(arr[i] + " ");
//            }
//        }
        //Yêu cầu 2: In ra danh sách số chẵn trong mảng
        System.out.println("Các số chẵn trong mảng là: ");
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        //Yêu cầu 3: In ra dãy số nguyên tố có trong N
        //khó qué xin làm thành BTVN ạ
    }
}
