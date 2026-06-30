
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sear
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments Xóa Nguyên Âm Trong Chuỗi Mô tả:
     * Viết một hàm để xóa tất cả các nguyên âm (a, e, i, o, u) trong một chuỗi
     * ký tự. Hàm sẽ nhận vào một chuỗi và trả về chuỗi đó sau khi đã xóa tất cả
     * các nguyên âm. Yêu cầu: Hàm sẽ nhận vào một chuỗi và trả về chuỗi đó sau
     * khi đã xóa tất cả các nguyên âm. Không sử dụng các hàm có sẵn để xóa ký
     * tự. Ví dụ: Input: "Cybersoft" Output: "Cbrsft" Input: "hello" Output:
     * "hll"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập chuỗi muốn xóa Nguyên Âm \"ueoai\": ");
        String strInput = scan.nextLine();
        String emptyChar = "";
        System.out.print("Chuỗi vừa nhập : " + strInput);
        for (int i = 0; i < strInput.length(); i++) {
            char eachChar = strInput.charAt(i);
            char exLowChar = Character.toLowerCase(eachChar);
            boolean check = "ueoai".contains(String.valueOf(exLowChar));
            if (!check) {
                emptyChar += eachChar;
            }
        }
        if (!emptyChar.isEmpty()) {
            System.out.print("\nChuỗi đã xóa nguyên âm : " + emptyChar + "\n");
        } else {
            System.out.println("\nChuỗi toàn nguyên âm");
        }
    }
    
}
