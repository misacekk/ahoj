import java.util.Scanner;
public class Nejvetsi {
    int max;
    int min;
    static Scanner sc = new Scanner(System.in);
    public void tri(){

        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();

        if(c1>c2 && c1>c3) {
            max = c1;
        }
        if(c2>c1 && c2>c3) {
            max = c2;
        }
        if(c3>c2 && c3>c1) {
            max = c3;
        }
        if(c1<c2 && c1<c3) {
            min = c1;
        }
        if(c2<c1 && c2<c3) {
            min = c2;
        }
        if(c3<c2 && c3<c1) {
            min = c3;
        }

        System.out.println("Max je "+max+" a min je "+min);



    }
}
