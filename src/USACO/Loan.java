package USACO;

import java.io.*;

public class Loan {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("./input/loan.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(".out")));

        String str = f.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int K = Integer.parseInt(str.split(" ")[1]);
        int M = Integer.parseInt(str.split(" ")[2]);

//        int result = 0;
//        for (int i = 1; i < N; i++) {
//            int X = i;
//            int G = 0;
//            for (int j = 0; j < K; j++) {
//                int Y = (N - G) / X;
//                if (Y < M) Y = M;
//                G += Y;
//                N = N - Y;
//            }
//            if (N > 0) {
//                System.out.println(result);
//                break;
//            } else {
//                result = X;
//            }
//
//        }


        int left = 1;
        int right = N;
        int temp = (right + left) / 2;

//        int X = 2;
//        System.out.println(checkFeasibility(N, K, M, X));


    }


//    public static int solution(int left, int right, int N, int K, int M) {
//        int temp = (left + right) / 2;
//        if (checkFeasibility(N, K, M, temp) == true) {
//            if (checkFeasibility(N, K, M, temp - 1) == true && checkFeasibility(N, K, M, temp + 1) == false) {
//                return temp;
//            } else if (checkFeasibility(N, K, M, temp - 1) == true && checkFeasibility(N, K, M, temp + 1) == true) {
//                solution(temp, right, N, K, M);
//            }else if(checkFeasibility())
//        }
//    }

    public static boolean checkFeasibility(int N, int K, int M, int X) {
        int G = 0;
        for (int j = 0; j < K; j++) {
            int Y = (N - G) / X;
            if (Y < M) Y = M;
            G += Y;
        }
        if (N - G > 0) {
            return false;
        } else {
            return true;
        }

    }

}
