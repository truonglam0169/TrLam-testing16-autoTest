
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sear
 */
public class BaiTap2 {

    /*Tìm Giá Trị Lớn Thứ Hai Trong Mảng
    *Mô tả: Viết một hàm để tìm giá trị lớn thứ hai trong một mảng số nguyên. Hàm sẽ nhận vào một
    *mảng số nguyên và trả về giá trị lớn thứ hai trong mảng.
     */
    public static void main(String[] args) {
        //tim so lon thu 2 trong mang
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng n: ");
        int n = scan.nextInt();        
        int[] numArr = new int[n];
        System.out.println("Nhập giá trị phần tử : ");
        for(int i = 0 ; i < numArr.length; i++){
            System.out.printf("num[%d] = : ",i );
            numArr[i] = scan.nextInt();
        }
       
        int maximum = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > maximum) {
                secondMax = maximum;
                maximum = numArr[i];
            } else if (numArr[i] > secondMax && numArr[i] < maximum) {
                secondMax = numArr[i];
            }
        }
        System.out.println("Mảng vừa tạo : ");
        for(int i = 0 ; i < numArr.length; i++){
            System.out.printf("num[%d] = %d\t", i, numArr[i]);
        }
        System.out.println();
        System.out.println("So lon thu 1 : " + maximum);        
        System.out.println("So lon thu 2 : " + secondMax);
    }

}
