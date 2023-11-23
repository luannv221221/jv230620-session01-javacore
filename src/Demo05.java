import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        float diemToan,diemLy,diemHoa;

        Scanner sc = new Scanner(System.in);

        System.out.println("moi ban nhap diem toan");
        diemToan = sc.nextFloat();
        System.out.println("Moi ban nhap diem ly");
        diemLy = sc.nextFloat();
        System.out.println("moi ban nhap diem hoa");
        diemHoa = sc.nextFloat();

        // tinh diem TB
        float diemTB = (diemToan + diemLy + diemHoa) / 3;
        if (diemTB < 5){
            System.out.println("Loai Yeu");
        } else if (diemTB < 6.5) {
            System.out.println("Loai TB");
        } else if (diemTB <8) {
            System.out.println("Loai Kha");
        } else if (diemTB < 9) {
            System.out.println("loai gioi");
        } else {
            System.out.println("loai xuat sac");
        }
        demo();
    }

    public static void demo(){
        System.out.println("ok");
    }
}
