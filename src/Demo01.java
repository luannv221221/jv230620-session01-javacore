public class Demo01 {
    public static void main(String[] args) {

        // khai bao bien kiểu du lieu byte
        /*
            nhiều dòng
         */

        // khai bao kiểu dữ liệu int (số nguyên)
        int soNguyen = 10;
        soNguyen = 100;
        System.out.println("Gia tri bien so nguyen "+soNguyen);
        // khai bao kiểu dữ liệu số thực
        float banKinh = 3.1F;
        System.out.println("Gia tri bien banKinh "+banKinh);
        // khai bao kieu double
        double chuVi = 3.33333;
        System.out.println("Gia tri bien kieu double "+chuVi);
        // kiểu string kiểu chuỗi
        String fullName = "Nguyễn Văn A";
        System.out.println("Họ và tên là "+fullName);

        // khai bao hang
        final double PI = 3.14;

        // PI = 10 sai;
        final String COLOR = "#FFFFFF";

        System.out.println("ma mau trang la "+COLOR);
    }
}
