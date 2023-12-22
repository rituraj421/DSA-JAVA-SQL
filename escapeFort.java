import java.util.*;

public class escapeFort {

    private static int timeRequired(int[][] fort) {
        int mTime = 0;
        for (int i = 0; i < fort.length; i++) {
            for (int j = 0; j < fort[0].length; j++) {
                if (fort[i][j] == 0) {
                    fort[i][j] = 1;
                    int time = bfs(fort);
                    mTime = Math.max(mTime, time);
                    fort[i][j] = 0;
                }
            }
        }
        return mTime;
    }

    private static int bfs(int[][] fort) {
        int[] r = { -1, 1, 0, 0 };
        int[] c = { 0, 0, -1, 1 };

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { 0, 0, 0 });

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int time = curr[2];
            if (row == fort.length - 1 && col == fort[0].length - 1) {
                return time;
            }
            for (int i = 0; i < 4; i++) {
                int r1 = row + r[i];
                int c1 = col + c[i];
                if (r1 >= 0 && r1 < fort.length && c1 >= 0 && c1 < fort[0].length
                        && fort[r1][c1] == 0) {
                    queue.add(new int[] { r1, c1, time + 1 });
                    fort[r1][c1] = 1;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[][] fort = new int[A][B];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                fort[i][j] = sc.nextInt();
            }
        }
        int ans = timeRequired(fort);
        System.out.println(ans);

        sc.close();
    }
}
