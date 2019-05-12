import java.util.Scanner;
public class 众数 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n,m,i,max=-1,num=99999;
        int mp[]=new int[100001];
        n=cin.nextInt();
        for(i=0; i<n; i++)
        {
            m=cin.nextInt();
            mp[m]++;
            if(max<mp[m] ||(max==mp[m]&&num>m))
            {
                max=mp[m];
                num=m;
            }
        }
        System.out.println(num);
        System.out.println(max);
    }
}
