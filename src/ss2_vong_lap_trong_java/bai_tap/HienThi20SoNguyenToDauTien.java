package ss2_vong_lap_trong_java.bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {

        int numbers = 20;
        int count = 0;
        int n = 2;
        int count1 = 0;

        while (n >= 2 && count < numbers) {
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    count1++;
                }
            }
            if (count1 == 2) {
                System.out.println(n + ", ");
                count++;
            }
            count1 = 0;
            n++;
        }
    }
}
