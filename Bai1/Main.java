package Bai1;

public class Main {
    public static void main(String[] args)
    {
        HinhChuNhat a= new HinhChuNhat();
        HinhChuNhat b=new HinhChuNhat();
        a.nhap();
        b.nhap();
        a.xuat();
        System.out.println("Chu vi cua hcn la: "+a.ChuVi());
        System.out.println("Dien tich cua hcn la: "+a.DienTich());
        b.xuat();
        System.out.println("Chu vi cua hcn la: "+b.ChuVi());
        System.out.println("Dien tich cua hcn la: "+b.ChuVi());
        if (a.DienTich()>b.DienTich()) System.out.println("Hinh chu nhat co dien tich lon hon la: "+a.DienTich());
        else System.out.println("Hinh chu nhat co dien tich lon hon la: "+b.DienTich());


    }
}
