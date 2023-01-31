package main;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do {
            System.out.println("Menu---------");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    " 1. Thêm danh sách sinh viên ra màn hình.\n"
                            + "2. In ra danh sách sinh viên ra màn hình.\n"
                            + "3. Kiểm tra danh sách có rỗng hay không. \n"
                            + "4.Lấy ra số lương sinh viên trong danh sách.\n"
                            + "5.Làm rỗng danh sách sinh viên.\n"
                            + "6.Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "7.Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "8.Tìm kiếm tất cả sinh viên có điểm từ cao đến thấp.\n"
                            + "9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                            + "0.Thoát khỏi chương trình");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhập mã sinh viên: ");
                String maSinhVien = scanner.nextLine();
                System.out.println("Nhập họ và tên");
                String hoVaTen = scanner.nextLine();
                System.out.println("Nhập năm sinh");
                int namSinh = scanner.nextInt();
                System.out.println("Nhập điểm trung bình");
                float diemTrungBinh = scanner.nextFloat();
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh,diemTrungBinh);
                dssv.themSinhVien(sv);
            } else if (luaChon == 2) {
                dssv.inDanhSachSinhVien();
            } else if (luaChon == 3) {
                System.out.println("Danh sách rỗng: " + dssv.kiemTraDanhSachRong());
            } else if (luaChon == 4) {
                System.out.println("Só lượng hiện tại: "+ dssv.laySoLuongSinhVien());
            } else if (luaChon == 5) {
                dssv.lamRongDanhSach();
            } else if (luaChon == 6) {
            } else if (luaChon == 7) {
            } else if (luaChon == 8) {
            } else if (luaChon == 9) {
            }
        }
            while (luaChon !=0) ;
        }
    }
//phút 33