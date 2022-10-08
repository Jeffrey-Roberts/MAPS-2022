import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next());
        int p = Integer.parseInt(scan.next());
        scan.nextLine();

        HashMap<String, String> table = new HashMap<String, String>();
        table.put("number", "c");
        table.put("amount", "m");
        table.put("most", "cm");
        table.put("fewest", "c");
        table.put("least", "m");
        table.put("more", "cm");
        table.put("fewer", "c");
        table.put("less", "m");
        table.put("many", "c");
        table.put("much", "m");
        table.put("few", "c");
        table.put("little", "m");

        HashMap<String, String> nouns = new HashMap<String, String>();
        for(int i =0; i<n;i++) nouns.put(scan.next(), scan.next());

        scan.nextLine();
        for (int i = 0; i < p; i++) {
            String[] phrase = scan.nextLine().split(" ");
            String tableKey = table.get(phrase[0]);
            String nounKey = nouns.get(phrase[phrase.length-1]);

            if (tableKey.equals("cm")) System.out.println("Correct!");
            else if (tableKey.equals(nounKey)) System.out.println("Correct!");
            else System.out.println("Not on my watch!");
        }

    }
}
