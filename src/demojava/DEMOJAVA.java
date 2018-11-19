package demojava;

import java.util.ArrayList;
import java.util.Scanner;

class SO {

    int num;
}

public class DEMOJAVA {

    void DEMOJAVA() {

    }

    static void DEMOJAVA(int a, int b) {
        System.out.println(a + b);
    }

    void DEMOJAVA(int a, int b, int c) {

    }

    static float congso(int a, int b) {
        return a + b;
    }

    static float congso(int a, int b, int c) {
        return a + b + c;
    }

    static float sum(SO so1, SO so2) {
        return so1.num + so2.num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("INFO OF STUDENT: ");
//        STUDENT sv1 = new STUDENT();
//        sv1.insertINFO();
//        sv1.viewINFO();
//        System.out.println("_____________________");
//        System.out.println("INFO OF TEACHER: ");
//        TEACHER gv1 = new TEACHER();
//        gv1.insertINFO();
//        gv1.viewINFO();
//        SO  so1 = new SO();
//        so1.num = 1;
//        SO  so2 = new SO();
//        so2.num = 2;
//        System.out.println(sum(so1, so2));
//        DEMOJAVA(9, 10);

        ArrayList mang = new ArrayList();
        float val = 0;
        int count = 1;
        System.out.println("HÃY NHẬP VÀO MỘT SỐ LẺ NGUYÊN DƯƠNG!");
        do {
            System.out.printf("\t\t NHẬP VÀO SỐ THỨ %d : ", count);
            val = scanner.nextFloat();
            if (val % 2 != 0) {
                mang.add(val);
            } else {
                break;
            }
            count++;
        } while (count <= 10);
        System.out.println("KẾT QUẢ CỦA MẢNG HIỆN TẠI: " + mang.toString());
        float total1 = 0, total2 = 0, total3 = 0;
        for (int i = 0; i < 5; i++) {
            total1 = total1 + (float) mang.get(i);
        }
        System.out.println("TỔNG 5 PHẦN TỬ ĐẦU TIÊN CỦA MẢNG HIỆN TẠI: " + total1);
        for (int i = mang.size() - 5; i < mang.size(); i++) {
            total2 = total2 + (float) mang.get(i);
        }
        System.out.println("TỔNG 5 PHẦN TỬ CUỐI CÙNG CỦA MẢNG HIỆN TẠI: " + total2);
        for (int i = 0; i < mang.size()+1; i++) {
            if(i % 2 != 0){
                total3 += (float)mang.get(i);
        for (int i = 0; i < mang.size() + 1; i++) {
            if (i % 2 != 0) {
                total3 += (float) mang.get(i);
            }
        }
        System.out.println("TỔNG CÁC PHẦN TỬ Ở VỊ TRÍ LẺ CỦA MẢNG HIỆN TẠI: " + total3);
    }
}
