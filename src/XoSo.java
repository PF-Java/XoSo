import java.util.Random;
import java.util.Scanner;

public class XoSo {
    public static void main(String[] args) {
        Random rd = new Random();
        int so = rd.nextInt(100);
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập vào chữ số đầu tiên: ");
        int a = sc.nextInt();
        System.out.println("Mời bạn nhập vào chữ số thứ hai");
        int b = sc.nextInt();
        System.out.println("Số bạn đã nhập là:" + a + b);
        System.out.println(so);

        int x = so / 10;
        int y = so % 10;

        if (x == a && y == b) {
            System.out.println("Bạn đã trúng độc đắc, phần thưởng là $10000");
        }else if (x == b && y == a) {
            System.out.println("Bạn trúng giải nhì, phần thưởng là $3000");
        }else  if (x == a || x == b || y == a || y == b){
            System.out.println("Bạn trúng giải ba, phần thưởng là 1000$");
        }else
        {
            System.out.println("May mắn lần sau");
        }
    }
}
