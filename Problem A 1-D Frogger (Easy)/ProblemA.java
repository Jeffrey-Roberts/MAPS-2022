import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt() - 1;
        int m = scan.nextInt();

        int[] board = new int[n];
        ArrayList<Integer> positions = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) board[i] = scan.nextInt();

        boolean gameOver = false;
        int counter = 0;

        whileloop:
        while (!gameOver) {
            int value = board[s];

            if (!positions.isEmpty()) {
                for (int i = 0; i < positions.size(); i++) {
                    if (positions.get(i) == s) {
                        System.out.println("cycle");
                        System.out.println(counter);
                        break whileloop;
                    }
                }
            }

            positions.add(s);

            if (value == m) {
                System.out.println("magic");
                System.out.println(counter);
                break;
            }

            if (value > 0) {
                counter++;
                if (s + value > board.length-1) {
                    System.out.println("right");
                    System.out.println(counter);
                    break;
                }
                else {
                    s += value;
                }
            }
            else {
                counter++;
                if (s - Math.abs(value) < 0) {
                    System.out.println("left");
                    System.out.println(counter);
                    break;
                }
                else {
                    s -= Math.abs(value);
                }
            }
        }

    }
}