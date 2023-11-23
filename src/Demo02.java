import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        // khoi tao doi tuong scanner để
        Scanner scanner = new Scanner(System.in);
        // nhập tên của bạn từ bàn phím in ra màn hình console chao tên của bạn
        String fullName;
        System.out.println("Mời bạn nhập vào họ và ten : ");
        fullName = scanner.nextLine();

        System.out.println("Xin chào "+fullName+" Đến với RA");

        // nhap xuat với kiểu dữ liệu int
        System.out.println("Moi bạn nhập vào tuổi");
        int age = scanner.nextInt();
        System.out.println("Năm sinh của bạn là : "+(2023-age));

        // nhap xuat voi kieu float
        System.out.println("Nhạp vao chieu cao");
        float height = scanner.nextFloat();
        System.out.println("chieu cao cua ban la "+height);

    }
}
