package testOptimization;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
//https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
//https://www.hackerrank.com/challenges/java-dequeue/problem?h_r=profile

public class DequeueOptMain {
    public static void main(String[] args) throws FileNotFoundException {

        long start =System.currentTimeMillis();

        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        File file = new File("DequeTestCase.txt");
        Scanner sc = new Scanner(file);

        int n =sc.nextInt();
        int m =sc.nextInt();
        int max=0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        for (int i = 0; i <= n-m; i++) {
            for (int j = i; j < m+i; j++) {
                set.add(list.get(j));
            }
            if(set.size()>max) max=set.size();
            set.clear();
        }

        System.out.println(max);

        long end =System.currentTimeMillis();
        System.out.println("Time taken "+(end-start)+" ms");
    }
    }

