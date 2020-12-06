package USACO;

import java.io.*;

public class Moobuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("./input/moobuzz.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(".out")));

        int num = Integer.parseInt(f.readLine());
        int counting = 0;
        int result = 1;
        int i = 1;
        while (counting < num) {
            if ((i % 3 != 0) && (i % 5 != 0) && (i % 15 != 0)){
                result = i;
                counting++;
            }
            i++;
            
        }

        System.out.println(result);
    }
}
