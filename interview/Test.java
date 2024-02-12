package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int T = Integer.parseInt(br.readLine().trim());

        for (int t = 0; t < T; t++) {
            int K = Integer.parseInt(br.readLine().trim());
            int Threshold = Integer.parseInt(br.readLine().trim());
            int N = Integer.parseInt(br.readLine().trim());

            String[] arrHit = br.readLine().split(" ");
            int[] Hit = new int[N];

            for (int iHit = 0; iHit < arrHit.length; iHit++) {
                Hit[iHit] = Integer.parseInt(arrHit[iHit]);
            }

            int result = notify(K, Threshold, Hit);
            System.out.println(result);
        }
    }

    private static int notify(int K, int Threshold, int[] Hit) {
        int maxHitCount = getMaxHitCountInRange(Hit, K);
        return (maxHitCount >= Threshold) ? 1 : 0;
    }

    private static int getMaxHitCountInRange(int[] Hit, int K) {
        int maxHitCount = Integer.MIN_VALUE;
        for (int i = Hit.length - K; i < Hit.length; i++) {
            if (i >= 0) {
                maxHitCount = Math.max(maxHitCount, Hit[i]);
            }
        }
        return maxHitCount;
    }
}


