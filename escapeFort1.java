import java.util.*;

public class escapeFort1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows and columns
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Read the structure of the fortress
        int[][] fortress = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                fortress[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print the result
        int result = calculateTimeToEscape(fortress);
        System.out.println(result);

        scanner.close();
    }

    private static int calculateTimeToEscape(int[][] fortress) {
        int maxTime = 0;

        // Try blocking each open room and find the maximum time
        for (int i = 0; i < fortress.length; i++) {
            for (int j = 0; j < fortress[0].length; j++) {
                if (fortress[i][j] == 0) {
                    // Temporarily block the room
                    fortress[i][j] = 1;

                    // Calculate time using BFS
                    int time = bfs(fortress);

                    // Update the maximum time
                    maxTime = Math.max(maxTime, time);

                    // Unblock the room for the next iteration
                    fortress[i][j] = 0;
                }
            }
        }

        return maxTime;
    }

    private static int bfs(int[][] fortress) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int time = current[2];

            if (row == fortress.length - 1 && col == fortress[0].length - 1) {
                return time;
            }

            for (int i = 0; i < 4; i++) {
                int newRow = row + dr[i];
                int newCol = col + dc[i];

                if (newRow >= 0 && newRow < fortress.length && newCol >= 0 && newCol < fortress[0].length
                        && fortress[newRow][newCol] == 0) {
                    queue.add(new int[]{newRow, newCol, time + 1});
                    fortress[newRow][newCol] = 1; // Mark visited
                }
            }
        }

        // If no path is found
        return Integer.MAX_VALUE;
    }
}

