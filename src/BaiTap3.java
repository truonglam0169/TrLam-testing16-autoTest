
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author TruongLam
 */
public class BaiTap3 {

    /*Tính Tổng Các Số Chẵn
    *Mô tả: Viết một hàm tính tổng các số chẵn từ 0 đến một số nguyên dương n cho trước.
    *Yêu cầu:
    *Hàm nhận vào một số nguyên dương n.
    *Trả về tổng của tất cả các số chẵn từ 0 đến n.
     */
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Nhập giá trị nguyên dương n: ");
            n = scan.nextInt();
        } while (n < 0);
        System.out.print("Tổng số chẵn là : " + tongChan(n));
        System.out.println();

    }

    public static int tongChan(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
