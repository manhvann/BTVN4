package Bai2;
public class Bai22 {
    public static void main (String[] args) {

        NhanVien []a=new NhanVien[5];


        for (int i=0;i<5;i++)
        {
            a[i]=new NhanVien();
            a[i].nhap();
        }
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","maNV","tenNV","Tuoi","diaChi","boPhan");
        for(int i=0;i<5;i++)
        {
            a[i].xuat();
        }
    }
}
