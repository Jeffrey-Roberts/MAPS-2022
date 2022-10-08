import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(scan.next());

        int q = Integer.parseInt(scan.next());
        int qIndex = 0;

        ArrayList<Integer> arrSorted = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) arrSorted.add(arr[i]);
        Collections.sort(arrSorted);
        for (int i = 0; i < n; i++) if (arrSorted.get(i) == q) qIndex = i;

        main:
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int index = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = temp;

            if (q == temp) break;

//            for (int k = 0; k < n; k++) if (arr[k] == q && k == qIndex) break main;
        }
        for (int i = 0; i < arr.length; i++){
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }

    }
}
