package Bai3;

import java.util.Scanner;

public class PTBac2 {
    Scanner scanner=new Scanner(System.in);
    private float a,b,c;
    public void nhap()
    {
        System.out.print("Nhap a: ");
        a=scanner.nextFloat();
        System.out.print("Nhap b: ");
        b=scanner.nextFloat();
        System.out.print("Nhap c: ");
        c=scanner.nextFloat();
    }
    public void Nghiem()
    {
        double t,x1,x2;

        t=b*b-4*a*c;
        if (t>0)
        {
            x1=(-b+Math.sqrt(t))/(2*a);
            x2=(-b-Math.sqrt(t))/(2*a);
            System.out.println("Nghiem cua phuong trinh la: "+x1+" va "+x2);
        }
        else if(t==0) System.out.println("Nghiem cua phuong trinh la: "+(-b/2*a));
        else System.out.println("Phuong trinh vo nghiem");
    }
}

