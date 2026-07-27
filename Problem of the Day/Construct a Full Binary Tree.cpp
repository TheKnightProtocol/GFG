class Solution {
public:
    unordered_map<int,int> mp; int i=0;

    Node* solve(vector<int>& pre,int l,int r){
        Node* t=new Node(pre[i++]);
        if(l==r||i==pre.size()) return t;
        int k=mp[pre[i]];
        t->left=solve(pre,k,r);
        t->right=solve(pre,l+1,k-1);
        return t;
    }

    Node* constructBinaryTree(vector<int>& pre, vector<int>& mir){
        for(int i=0;i<mir.size();i++) mp[mir[i]]=i;
        return solve(pre,0,pre.size()-1);
    }
};
