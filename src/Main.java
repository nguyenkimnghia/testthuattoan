import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tuong tuong = new Tuong();
        System.out.println("nhập vị trí quân: x");
        Scanner ox = new Scanner(System.in);
        System.out.println("nhập vị trí quân: y");
        Scanner oy = new Scanner(System.in);
        int x = ox.nextInt();
        String y = oy.nextLine();
        tuong.viTri(x, y);
        System.out.println("vị trí quân cờ: " + x + y);
        System.out.println("nhập vị trí nước đi: x");
        Scanner dx = new Scanner(System.in);
        System.out.println("nhập vị trí nước đi: y");
        Scanner dy = new Scanner(System.in);
        int bx = dx.nextInt();
        String by = dy.nextLine();
        tuong.diChuyen(bx,by);
        tuong.check();
    }
}
