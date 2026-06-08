class Solution {
    Node compute(Node head) {
        Node p=null, c=head, n;
        while(c!=null){ n=c.next; c.next=p; p=c; c=n; }
        Node d=new Node(0), t=d;
        int m=Integer.MIN_VALUE;
        for(c=p; c!=null; c=c.next)
            if(c.data>=m){ m=c.data; t.next=c; t=c; }
        t.next=null;
        p=null; c=d.next;
        while(c!=null){ n=c.next; c.next=p; p=c; c=n; }
        return p;
    }
}
