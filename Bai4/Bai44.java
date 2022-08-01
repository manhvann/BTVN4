package Bai4;

public class Bai44 {
    public static void main(String[] args) {
        Employee a = new Employee("123","Manh",18,30);
        System.out.println("Tien luong: "+a.getSalary());
        a.input();
        a.output();
    }
}
