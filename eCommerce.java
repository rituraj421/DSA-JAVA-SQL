import java.util.*;

public class eCommerce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] coupon = new int[n];
        for (int i = 0; i < n; i++) {
            coupon[i] = sc.nextInt();
        }
        int[] reward = new int[n];
        for (int i = 0; i < n; i++) {
            reward[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Map<String, Integer> items = new HashMap<>();
        sc.nextLine();
        String[] info = sc.nextLine().split(" ");
        for (String item : info) {
            String[] price = item.split(":");
            items.put(price[0], Integer.parseInt(price[1]));
        }

        List<String> ans = selectItems(coupon, reward, k, items);
        Collections.sort(ans);
        for (String item : ans) {
            System.out.println(item);
        }

        sc.close();
    }

    private static List<String> selectItems(int[] coupon, int[] reward, int k, Map<String, Integer> items) {
        List<String> ans = new ArrayList<>();
        int maxCoupan = 0;
        for (int i = 0; i <= coupon.length - k; i++) {
            int currCoupan = 0;
            for (int j = i; j < i + k; j++) {
                if (reward[j] == 0) {
                    currCoupan += coupon[j];
                }
            }
            if (currCoupan > maxCoupan) {
                maxCoupan = currCoupan;
                ans.clear();

                for (Map.Entry<String, Integer> entry : items.entrySet()) {
                    if (entry.getValue() <= maxCoupan) {
                        ans.add(entry.getKey());
                    }
                }
            } else if (currCoupan == maxCoupan) {
                for (Map.Entry<String, Integer> entry : items.entrySet()) {
                    if (entry.getValue() <= maxCoupan) {
                        ans.add(entry.getKey());
                    }
                }
            }
        }
        return ans;
    }

}
