package Bai2;

import java.util.Scanner;

public class NhanVien {

    public static Scanner scanner= new Scanner(System.in);
    private String tenNV,diaChi,boPhan;
    private int tuoi;
    private static int maNV=0;
    private int stt;

    public NhanVien()
    {

        maNV=maNV+1;
        stt=maNV;
    }
    public void nhap()
    {
        System.out.print("Nhap ten nhan vien: ");
        tenNV=scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi=scanner.nextLine();
        System.out.print("Nhap bo phan: ");
        boPhan=scanner.nextLine();
    }
    public void xuat()
    {
        System.out.printf("%-10d%-10s%-10d%-10s%-10s\n",stt,tenNV,tuoi,diaChi,boPhan);
    }
}
