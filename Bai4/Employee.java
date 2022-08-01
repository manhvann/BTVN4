package Bai4;

import java.util.Scanner;

public class Employee {
    Scanner scanner =new Scanner(System.in);
    private String iD,name;
    private int age,workingDays;
    private double salary;
    private static float Price=50;

    public String getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
    public Employee(String maNV,String ten,int tuoi,int ngaycong)
    {
        iD=maNV;
        name=ten;
        age=tuoi;
        workingDays=ngaycong;
        salary=workingDays*Price;
    }
    public void input()
    {
        System.out.println("Nhap id: ");
        iD=scanner.nextLine();
        System.out.println("Nhap ten: ");
        name=scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap so ngay lm: ");
        workingDays=scanner.nextInt();
        salary=workingDays*Price;
    }
    public double getSalary()
    {
        return salary;
    }
    public void output()
    {
        System.out.println("Ma nhan vien: "+iD);
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("So ngay cong: "+workingDays);
        System.out.println("Tien luong: "+salary);
    }

}
