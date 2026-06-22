import java.util.Scanner;

public class bt2{
    static int n;
    static int[][] maze;

    static boolean solve(int r, int c) {
        if (r == n - 1 && c == n - 1) return true;

        if (c + 1 < n && maze[r][c + 1] == 1)
            if (solve(r, c + 1)) return true;

        if (r + 1 < n && maze[r + 1][c] == 1)
            if (solve(r + 1, c)) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        n = sc.nextInt();

        maze = new int[n][n];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                maze[i][j] = sc.nextInt();

        System.out.println(solve(0,0) ? "Path Found" : "No Path");
    }
}