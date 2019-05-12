import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        LinkedList<info> list1 = new LinkedList<info>();
        LinkedList<info> list2 = new LinkedList<info>();
        while (n-- > 0) {
            String a = cin.next();
            double b = cin.nextDouble();
            if (!a.contains("female")) {
                list1.add(new info(a, b));
            }
            if (a.contains("female")) {
                list2.add(new info(a, b));
            }
        }
        Collections.sort(list1, new Comparator<info>() {
            public int compare(info o1, info o2) {
                return (int) ((o1.tall - o2.tall) * 100);
            }
        });
        Collections.sort(list2, new Comparator<info>() {
            public int compare(info o1, info o2) {
                return (int) ((o2.tall - o1.tall) * 100);
            }
        });
        for (info j : list1) {
            System.out.printf("%.2f ", j.tall);
        }
        for (info j : list2) {
            System.out.printf("%.2f ", j.tall);
        }
        cin.close();
    }
    static class info {
        String name;
        double tall;
        info(String name, double tall) {
            this.name = name;
            this.tall = tall;
        }
    }
}