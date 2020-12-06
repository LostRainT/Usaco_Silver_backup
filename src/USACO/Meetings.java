package USACO;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.io.*;
import java.util.Arrays;

public class Meetings {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("./input/meetings.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("./output/meetings.out")));
        String str = f.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int L = Integer.parseInt(str.split(" ")[1]);

        int[] init_positions = new int[N];
        int[] weights = new int[N];
        double[] speeds = new double[N];
        for (int i = 0; i < N; i++) {
            str = f.readLine();
            init_positions[i] = Integer.parseInt(str.split(" ")[0]);
            weights[i] = Integer.parseInt(str.split(" ")[1]);
            speeds[i] = Double.parseDouble(str.split(" ")[2]);
        }

        int total_weight = 0;
        for (int i = 0; i < weights.length; i++) {
            total_weight += weights[i];
        }

        double[] cur_positions = new double[N];
        for (int i = 0; i < N; i++) {
            cur_positions[i] = init_positions[i];
        }
        int weight_achieved = 0;
//        int t = 0;
        int result = 0;
//        while (weight_achieved <= total_weight / 2) {
////            t += 0.5;
//            for (int i = 0; i < N; i++) {
//                cur_positions[i] += speeds[i] / 2;
//                if ((cur_positions[i] == L || cur_positions[i] == 0) && speeds[i] != 0) {
//                    speeds[i] = 0;
//                    weight_achieved += weights[i];
//                }
//            }
//            for (int i = 0; i < cur_positions.length - 1; i++) {
//                for (int j = i + 1; j < cur_positions.length; j++) {
//                    if (cur_positions[i] == cur_positions[j] && speeds[i] != 0 && speeds[j] != 0) {
//                        result++;
//                        double speed = speeds[i];
//                        speeds[i] = speeds[j];
//                        speeds[j] = speed;
//                        break;
//                    }
//                }
//            }
//        }

        int result2 = 0;
        int[][] positions = new int[2][2 * (L + 1)];
        while ((weight_achieved <= total_weight / 2)) {
            for (int i = 0; i < N; i++) {
                cur_positions[i] += speeds[i] / 2;
                if ((cur_positions[i] == L || cur_positions[i] == 0) && speeds[i] != 0) {
                    speeds[i] = 0;
                    weight_achieved += weights[i];
                }
            }

            Arrays.fill(positions[0], 0);
            for (int i = 0; i < cur_positions.length; i++) {
                positions[0][(int) cur_positions[i] * 2] += 1;
                if (positions[0][(int) cur_positions[i] * 2] > 1 && (int) cur_positions[i] * 2 != 0 && (int) cur_positions[i] * 2 != L) {
                    result2++;
                }
            }
        }

        System.out.println(result);
        System.out.println(result2);
    }
}
