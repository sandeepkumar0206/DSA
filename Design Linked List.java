class MyLinkedList {
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    private Node head=null;
    private int size=0;

    public MyLinkedList() {
        this.head=null;
        this.size=0;
    }
    
    public int get(int index) {
        if(this.size==0 ||  index>=this.size){
            return -1;
        }
        Node curr=this.head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        this.size++;
        Node newNode=new Node(val);
        newNode.next=this.head;
        this.head=newNode;
    }
    
    public void addAtTail(int val) {
        if(this.size==0){
            addAtHead(val);
            return ;
        }
        Node newNode=new Node(val);
        Node curr=this.head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>this.size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return ;
        }
        else if(this.size==index){
            addAtTail(val);
            return;
        }
        Node curr=this.head;
        Node newNode=new Node(val);
        for(int i=0;i<index-1;i++){
            curr=curr.next;
        }
        Node next=curr.next;
        curr.next=newNode;
        newNode.next=next;
        this.size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= this.size){
            return ;
        }
        if(index==0){
            this.head=this.head.next;
        }
        else{
            Node curr=this.head;
            for(int i=0;i<index-1;i++){
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
        this.size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */