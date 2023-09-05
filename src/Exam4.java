public class Exam4 {
    //Bài 4: Xây dựng chương trình theo mảng cho sẵn
    public static void main(String[] args) {
        int [] arr = {2,7,6,8,9,21,34,56,32,12,37};

        //Yêu cầu 1: Tìm phần tử lớn nhất trong mảng rồi in ra thông tin
        int max = arr[0];
        for (int i = 1;i < arr.length;i++){
            if(arr [i] > max){
                max = arr[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là " + max);

        //Yêu cầu 2: Tính tổng số đầu tiên và cuối cùng
        int first = arr[0];
        int last = arr[arr.length - 1];
        int sum2 = first + last; // sum2 cho yêu cầu 2
        System.out.println("Tổng số đầu tiên và cuối cùng trong mảng là: " + sum2);

        //Yêu cầu 3: Tính tổng các số chẵn trong mảng
        int sum3 = 0;
        for (int i = 0;i < arr.length;i++){
            if (arr[i] % 2 == 0){
                sum3 += arr[i]; //sum3 cho yêu cầu 3
            }
        }
        System.out.println("Tổng các số chẵn trong mảng là: " + sum3);
    }
}
