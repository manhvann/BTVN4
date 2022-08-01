package Bai1;

import java.util.Scanner;

public class HinhChuNhat {
    Scanner scanner =new Scanner(System.in);
    private float chieuDai,chieuRong;
    public void nhap()
    {
        System.out.println("Nhap chieu dai: ");
        chieuDai=scanner.nextFloat();
        System.out.println("Nhap chieu rong:");
        chieuRong=scanner.nextFloat();
    }
    public void xuat()
    {
        System.out.println("Chieu dai= "+chieuDai);
        System.out.println("Chieu rong= "+chieuRong);
    }
    public float DienTich()
    {
        return chieuRong*chieuDai;
    }
    public float ChuVi()
    {
        return (chieuDai+chieuRong)*2;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
}