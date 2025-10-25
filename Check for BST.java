class Solution {
    public boolean isBST(Node root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean checkBST(Node node, long min, long max) {
        if (node == null) return true;
        
        if (node.data <= min || node.data >= max) return false;
        
        return checkBST(node.left, min, node.data) && 
               checkBST(node.right, node.data, max);
    }
}
