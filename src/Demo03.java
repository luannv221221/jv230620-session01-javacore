import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // xác input output
        float chieuDai,chieuRong;
        System.out.println("moi ban nhap vao chieu dai");
        chieuDai = sc.nextFloat();
        System.out.println("moi ban nhap vao chieu rong");
        chieuRong = sc.nextFloat();
        // tinh toan
        float chuVi = (chieuDai + chieuRong) * 2;
        float dienTinh = (chieuDai + chieuRong);
        // hien thi ket qua
        System.out.println("Chu vi hinh chu nhat la "+chuVi);
        System.out.println("Dien tich hinh chu nhat la "+dienTinh);
    }
}
