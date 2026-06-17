class Solution {
	int minToggle(int[] arr) {
		// code here
		int zeros = 0;
		for (int x : arr) if (x == 0)
			zeros++;
		
		int minToggles = zeros, current = zeros;
		for (int x : arr) {
			current += (x == 0) ? -1 : 1;
			minToggles = Math.min(minToggles, current);
		}
		return minToggles;
	}
}
