import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // demo vè if
        // nhap vao tuoi
        System.out.println("Moi ban nhap vao tuoi");
        int age = sc.nextInt();
        // neu tuoi > 18 thi moi nguoi nt xem phim
        /*
        if(age > 18){
            System.out.println("Moi ban xem phim");
        }
        */
        /*
        if(age > 18){
            System.out.println("moi ban xem phim");
        } else {
            System.out.println("moi ban xem hoat hinh");
        }
        */
        /*
        if(age > 18){
            if(age > 60){
                System.out.println("Moi ban xem thoi su");
            } else {
                System.out.println("moi ban xem phim");
            }
        } else {
            System.out.println("moi ban xem hoat hinh");
        }
        */

        if(age > 18){
            System.out.println("moi ban xem phim");
        } else if (age > 16) {
            System.out.println("moi ban xem phim 16+");
        } else {
            System.out.println("moi ban xem hoat hinh");
        }
    }
}
