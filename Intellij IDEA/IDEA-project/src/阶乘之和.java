import java.util.Scanner;

public class 阶乘之和 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int mp[] = new int[9];
        for (int i = 1; i <= 9; i++) {
            int mul = 1;
            for (int j = 1; j <= i; j++) {
                mul *= j;
            }
            mp[i-1] = mul;
        }
        int n=cin.nextInt();
        while(n-->0){
            int m=cin.nextInt();
            for (int i = 8; i >=0 ; i--) {
                if(m>=mp[i]){
                    m-=mp[i];
                }
            }
            if(m==0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
