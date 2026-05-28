class Solution {
    class TrieNode {
        TrieNode[] child = new TrieNode[26];
        int idx = -1;
        int len = Integer.MAX_VALUE;
    }

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        TrieNode root = new TrieNode();
        for (int i = 0; i < wordsContainer.length; i++) {
            String w = wordsContainer[i];
            int l = w.length();
            TrieNode node = root;
            if (l < node.len || (l == node.len && i < node.idx)) {
                node.len = l;
                node.idx = i;
            }
            for (int j = l - 1; j >= 0; j--) {
                int c = w.charAt(j) - 'a';
                if (node.child[c] == null) node.child[c] = new TrieNode();
                node = node.child[c];
                if (l < node.len || (l == node.len && i < node.idx)) {
                    node.len = l;
                    node.idx = i;
                }
            }
        }
        int[] ans = new int[wordsQuery.length];
        for (int i = 0; i < wordsQuery.length; i++) {
            String q = wordsQuery[i];
            TrieNode node = root;
            int best = node.idx;
            for (int j = q.length() - 1; j >= 0; j--) {
                int c = q.charAt(j) - 'a';
                if (node.child[c] == null) break;
                node = node.child[c];
                best = node.idx;
            }
            ans[i] = best;
        }
        return ans;
    }
}
