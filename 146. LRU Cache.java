public class LRUCache {
    class dlinkedlist{
        int key;
        int value;
        dlinkedlist pre;
        dlinkedlist next;
        dlinkedlist(int k, int v){
            key=k;
            value=v;
        }
    }
    int ca;
    int count;
    HashMap<Integer,dlinkedlist> map;
    dlinkedlist head;
    dlinkedlist tail;
    public LRUCache(int capacity) {
    ca=capacity;
    count=0;
    map=new HashMap<>();
    head=new dlinkedlist(-2,0);
    tail=new dlinkedlist(-2,0);
    head.pre=null;
    head.next=tail;
    tail.pre=head;
    tail.next=null;
    }
    public void delete(dlinkedlist node){
    node.pre.next=node.next;
    node.next.pre=node.pre;
    }
    public void add(dlinkedlist node){//add to head.next
    dlinkedlist temp=head.next;
    head.next=node;
    node.next=temp;
    node.pre=head;
    temp.pre=node;
    }
    public int get(int key) {
    if(map.get(key)!=null){
        dlinkedlist temp=map.get(key);
        int res=temp.value;
        delete(temp);
        add(temp);
        return res;
    }    
    return -1;
    }
    
    public void put(int key, int value) {
    if(map.get(key)!=null){
        dlinkedlist temp=map.get(key);
        temp.value=value;
        delete(temp);
        add(temp);
    }
    else{
        dlinkedlist temp=new dlinkedlist(key,value);
        map.put(key,temp);
        if(count<ca){
            add(temp);
            count++;
        }
        else{
            map.remove(tail.pre.key);
            delete(tail.pre);
            add(temp);
            
        }
    }
    
    }
}



It is obvious to use a hashmap to implement the basic function of get and put. And the first idea to get the least recent used item is to use a queue. However, 
it takes O(n) time to update the queue because a single linkedlist is slow to delete a item. Hence, double linkedlist is chosen in this problem to update in 
constant time. Dummy head and tail is used in the list to support operation on head and tail. 
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */