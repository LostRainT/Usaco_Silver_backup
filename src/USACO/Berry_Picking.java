package USACO;

import java.util.*;
import java.io.*;

public class Berry_Picking {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("./input/berries.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("./output/berries.out")));

        String str = f.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int K = Integer.parseInt(str.split(" ")[1]);
        str = f.readLine();
        int[] trees = new int[N];
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(str.split(" ")[i]);
        }
        Arrays.sort(trees);

        ArrayList<Integer> arr = new ArrayList<>();

        int result = 0;
        for (int i = 1; i < trees[N - 1]; i++) {
            int temp_result = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < trees[j] / i; k++) {
                    arr.add(i);
                }
                if (trees[j] % i != 0) {
                    arr.add(trees[j] % i);
                }
            }
            Collections.sort(arr, Collections.reverseOrder());
            for (int j = K / 2; j < K; j++) {
                temp_result += arr.get(j);
            }

            if (temp_result > result) {
                result = temp_result;
            } else if (temp_result <= result) {
                break;
            }
        }

        out.println(result);
        System.out.println(result);
    }

}
