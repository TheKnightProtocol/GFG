import java.util.*;

class Solution {
    public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        Map<Integer, List<Integer>> pos = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (!pos.containsKey(val)) pos.put(val, new ArrayList<>());
            pos.get(val).add(i);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int[] q : queries) {
            int l = q[0], r = q[1], x = q[2];
            List<Integer> idx = pos.get(x);
            if (idx == null) {
                res.add(0);
            } else {
                int left = lowerBound(idx, l);
                int right = upperBound(idx, r);
                res.add(right - left);
            }
        }
        return res;
    }

    private int lowerBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = l + (r - l) / 2;
            if (list.get(m) < target) l = m + 1;
            else r = m;
        }
        return l;
    }

    private int upperBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = l + (r - l) / 2;
            if (list.get(m) <= target) l = m + 1;
            else r = m;
        }
        return l;
    }
}
