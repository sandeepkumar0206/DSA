class MyCircularDeque {
    int maxSize=0;
    int size=0;
    List<Integer>li;


    public MyCircularDeque(int k) {
        this.maxSize=k;
        li=new ArrayList<>();
    }
    
    public boolean insertFront(int value) {
        if(this.size==this.maxSize){
            return false;
        }
        li.add(0,value);
        this.size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(this.size==this.maxSize){
            return false;
        }
        li.add(value);
        this.size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(this.size==0){
            return false;
        }
        li.remove(0);
        this.size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(this.size==0){
            return false;
        }
        li.remove(size-1);
        this.size--;
        return true;
    }
    
    public int getFront() {
        if(size==0){
            return -1;
        }
        return li.get(0);
    }
    
    public int getRear() {
        if(size==0){
        return -1;
        }
        return li.get(this.size-1);
    }
    
    public boolean isEmpty() {
        return this.size==0;
    }
    
    public boolean isFull() {
        return this.maxSize==this.size;
    }
}
