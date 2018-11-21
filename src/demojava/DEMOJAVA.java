package demojava;

import java.util.ArrayList;
import java.util.Scanner;

class SINHVIEN {

    String hoten;
    int tuoi;

    SINHVIEN(String hoten, int tuoi) {
        this.hoten = hoten;
        this.tuoi = tuoi;
    }
}

public class DEMOJAVA {

    static int count = 0;

    static void SHOW(SINHVIEN sv) {
        System.out.println("HỌ & TÊN --->>> "+sv.hoten);
        System.out.println("TUỔI --->>> "+sv.tuoi);
        count++;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList ar = new ArrayList();
        SINHVIEN[] sv = new SINHVIEN[2];
//        sv[0] = new SINHVIEN("LÊ VĂN PHÚ", 21);
//        sv[1] = new SINHVIEN("KIM NGUYỄN", 21);
        for (SINHVIEN item : sv) {
            System.out.print("NHẬP HỌ TÊN: ");
            String hoten = scanner.nextLine();
            System.out.print("NHẬP TUỔI: ");
            int tuoi = Integer.valueOf(scanner.nextLine());
            item = new SINHVIEN(hoten, tuoi);
            SHOW(item);
//            ar.add(item);
        }
//        System.out.println(ar.toString());
//        for (Object item : ar) {
//            if (item instanceof SINHVIEN) {
//                System.out.println(((SINHVIEN) item).hoten);
//                System.out.println(((SINHVIEN) item).tuoi);
//            } else {
//                System.out.println("FALSE");
//            }
//        }
        
//        SINHVIEN sv1 = new SINHVIEN();
//        sv[0].hoten = "LÊ VĂN PHÚ";
//        sv[0].tuoi = 21;
//        SHOW(sv1);
//        SINHVIEN sv2 = new SINHVIEN();
//        SHOW(sv2);
//        System.out.println(count);;

//        System.out.println("INFO OF STUDENT: ");
//        STUDENT sv1 = new STUDENT();
//        sv1.insertINFO();
//        sv1.viewINFO();
//        System.out.println("_____________________");
//        System.out.println("INFO OF TEACHER: ");
//        TEACHER gv1 = new TEACHER();
//        gv1.insertINFO();
//        gv1.viewINFO();

//        ArrayList mang = new ArrayList();
//        float val = 0;
//        int count = 1;
//        System.out.println("HÃY NHẬP VÀO MỘT SỐ LẺ NGUYÊN DƯƠNG!");
//        do {
//            System.out.printf("\t\t NHẬP VÀO SỐ THỨ %d : ", count);
//            val = scanner.nextFloat();
//            if (val % 2 != 0) {
//                mang.add(val);
//            } else {
//                break;
//            }
//            count++;
//        } while (count <= 10);
//        System.out.println("KẾT QUẢ CỦA MẢNG HIỆN TẠI: " + mang.toString());
//        float total1 = 0, total2 = 0;
//        for (int i = 0; i < 5; i++) {
//            total1 = total1 + (float) mang.get(i);
//        }
//        System.out.println("TỔNG 5 PHẦN TỬ ĐẦU TIÊN CỦA MẢNG HIỆN TẠI: " + total1);
//        for (int i = mang.size() - 5; i < mang.size(); i++) {
//            total2 = total2 + (float) mang.get(i);
//        }
//        System.out.println("TỔNG 5 PHẦN TỬ CUỐI CÙNG CỦA MẢNG HIỆN TẠI: " + total2);
//        System.out.println("TỔNG CÁC PHẦN TỬ Ở VỊ TRÍ LẺ CỦA MẢNG HIỆN TẠI: " + (total1 + total2));
    }
}
