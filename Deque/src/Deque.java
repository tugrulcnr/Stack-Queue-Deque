
import java.util.ArrayList;

/**
 *
 * @author ertugrul
 */

class MyDeque {
    ArrayList<Integer> list = new ArrayList<>();

    boolean isEmpty(){
        return list.size() == 0;
    }
    void addFirst(int num){
        if (isEmpty()){
            list.add(num);
            return;
        }
        list.add(0, num);
    }
    void removeFirst (){
        if (!isEmpty())
            list.remove(list.size() - 1);
    }
    void addLast(int num){
        list.add(num);
    }
    void removeLast (){
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

public class Deque {

    public static void main(String[] args) {
       MyDeque myDeque = new MyDeque();
        
       System.out.println(myDeque.isEmpty());
       myDeque.addFirst(10);
       myDeque.addFirst(20);
       myDeque.addLast(30);
       myDeque.addFirst(40);
       myDeque.addLast(50);
       System.out.println(myDeque.isEmpty());
       myDeque.displayreverse();
       System.out.println("----------------");
       myDeque.removeFirst();
       myDeque.displayreverse();
       System.out.println("----------------");
       myDeque.removeLast();
       myDeque.displayreverse();

    }
    
}
