package main;

import java.util.ArrayList;

public class DanhSachSinhVien {
    private final ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
    this.danhSach = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);

    }

    @Override
    public String toString() {
        return "DanhSachSinhVien{" +
                "danhSach=" + danhSach +
                '}';
    }

    public void inDanhSachSinhVien(){
        for (SinhVien sinhVien: danhSach)
              {
                  System.out.println(sinhVien);
        }
    }

    public boolean kiemTraDanhSachRong(){
       return this.danhSach.isEmpty();
    }

    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }

    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }



}
