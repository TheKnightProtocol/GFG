class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null) return result;
        
        if (!isLeaf(node)) {
            result.add(node.data);
        }
        
        addLeftBoundary(node.left, result);
        addLeaves(node, result);
        addRightBoundary(node.right, result);
        
        return result;
    }
    
    private boolean isLeaf(Node node) {
        return node != null && node.left == null && node.right == null;
    }
    
    private void addLeftBoundary(Node node, ArrayList<Integer> result) {
        Node current = node;
        while (current != null) {
            if (!isLeaf(current)) {
                result.add(current.data);
            }
            if (current.left != null) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
    }
    
    private void addLeaves(Node node, ArrayList<Integer> result) {
        if (node == null) return;
        
        if (isLeaf(node)) {
            result.add(node.data);
            return;
        }
        
        addLeaves(node.left, result);
        addLeaves(node.right, result);
    }
    
    private void addRightBoundary(Node node, ArrayList<Integer> result) {
        ArrayList<Integer> temp = new ArrayList<>();
        Node current = node;
        while (current != null) {
            if (!isLeaf(current)) {
                temp.add(current.data);
            }
            if (current.right != null) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        
        for (int i = temp.size() - 1; i >= 0; i--) {
            result.add(temp.get(i));
        }
    }
}
