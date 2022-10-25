
import java.util.ArrayList;

/**
 *
 * @author ertugrul
 */
class MyQueue {
    ArrayList<Integer> list = new ArrayList<>();

    boolean isEmpty(){
        return list.size() == 0;
    }
    
    void enqueue(int num){
        list.add(num);
    }
    void dequeue (){
        if (!isEmpty())
            list.remove(0);
    }
    int showLast(){
        return list.get(list.size() - 1);
    }
    int sizeList(){
        return list.size();
    }
    
    void display(){
        for (int j : list){
            System.out.println(j);
        }
    }
    void displayreverse(){
        for (int i = list.size()-1; i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
public class Queue {

    
    public static void main(String[] args) {
        
        MyQueue myQueue = new MyQueue();
        
       System.out.println(myQueue.isEmpty());
       myQueue.enqueue(10);
       myQueue.enqueue(20);
       myQueue.enqueue(30);
       myQueue.enqueue(40);
       myQueue.enqueue(50);
       System.out.println(myQueue.isEmpty());
       myQueue.displayreverse();
       System.out.println("----------------");
       myQueue.dequeue();
       myQueue.displayreverse();
    }
    
}
