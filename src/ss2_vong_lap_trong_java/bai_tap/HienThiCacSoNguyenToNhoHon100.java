package ss2_vong_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println(2);
        for (int i = 3; i <= 100; i++) {
            boolean count = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = false;
                    break;
                } else {
                    count = true;
                }
            }
            if (count) {

                System.out.println(i);
            }
        }
    }
}
