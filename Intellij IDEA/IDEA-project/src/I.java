import java.util.*;

public class I {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
//        int n = cin.nextInt();
//        int m = cin.nextInt();
//        Vector<Vector<Integer>> v = new Vector<Vector<Integer>>();
//        for (int i = 0; i <= n; i++) {
//            Vector<Integer> v1 = new Vector<>();
//            v.add(v1);
//        }
//        while (m-- > 0) {
//            int num = cin.nextInt();
//            if (num == 0) {
//                int p = cin.nextInt(), q = cin.nextInt();
//                v.get(p).add(q);
//            } else if (num == 1) {
//
//                int p = cin.nextInt();
//                Vector<Integer> cur = v.get(p);
//                if (cur.isEmpty()) {
//                    System.out.println();
//                } else {
//                    for (int i = 0; i <cur.size() - 1; i++) {
//                        System.out.print(cur.get(i) + " ");
//                    }
//                    System.out.println(cur.get(cur.size() - 1));
//                }
//
//            } else if(num==2){
//                int p = cin.nextInt();
//                if(v.size()>p)
//                    v.get(p).clear();
//            }
//        }
        int n = cin.nextInt();
        Deque<Integer> queue = new LinkedList<>();
        Deque<Integer> queue1 = new LinkedList<>();
        if(n%2==1){
            for (int i = 0; i < (n+1)/2; i++) {
                queue.add(cin.nextInt());
            }
            for (int i = (n+1)/2; i < n; i++) {
                queue1.add(cin.nextInt());
            }
            boolean bool = true;
            System.out.println(n);
            while (!queue.isEmpty()) {
                System.out.print(queue.getFirst() + " ");
                queue.removeFirst();
                if (!queue1.isEmpty()) {
                    if(bool){
                        System.out.print(queue1.getLast()+" ");
                        queue1.removeLast();
                        bool = false;
                    }else{
                        System.out.print(queue1.getFirst()+" ");
                        queue1.removeFirst();
                        bool = true;
                    }

                }
            }
            System.out.println();
        }else{
            for (int i = 0; i < n/2; i++) {
                queue.add(cin.nextInt());
            }
            for (int i = n/2; i < n; i++) {
                queue1.add(cin.nextInt());
            }
            boolean bool = true;
            while (!queue.isEmpty()) {
                System.out.print(queue.getFirst() + " ");
                queue.pop();
                if (!queue1.isEmpty()) {
                    if(bool){
                        System.out.print(queue1.getFirst()+" ");
                        queue1.removeFirst();
                        bool = false;
                    }else{
                        System.out.print(queue1.getLast()+" ");
                        queue1.removeLast();
                        bool = true;
                    }

                }
            }
        }
    }
}

