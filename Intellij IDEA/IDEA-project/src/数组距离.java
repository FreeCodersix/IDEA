import java.util.Scanner;

public class 数组距离 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m, n, k;
        m=cin.nextInt();
        n=cin.nextInt();
        int a[]=new int[n],b[]=new int[m];
        for (int i = 0; i < n; i++)
            a[i]=cin.nextInt();
        for (int i = 0; i < m; i++)
            b[i]=cin.nextInt();
        int min = 99999;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                k = Math.abs(a[i] - b[j]);
                if (k < min) min = k;
            }
        }
        System.out.println(min);
    }
}
