package hackerRank1;

import java.util.HashSet;
import java.util.Set;

public class DequeueMain1 {
    public static void main(String[] args) {

        int[] arr={5,3,5,2,3,2};

        Set<Integer> set=new HashSet<>();

        int n =6;
        int m =3;
        int max=0;

        for (int i = 0; i <= n-m; i++) {
            for (int j = i; j < m+i; j++) {
                set.add(arr[j]);
            }
            System.out.println(set);
            //if(set.size()>max) max=set.size();
            set.clear();
        }
        //System.out.println(max);
    }
}
