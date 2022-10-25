import java.util.ArrayList;

/**
 *
 * @author ertugrul
 */
class MyStack{
    
    ArrayList<Integer> list = new ArrayList<>();

    boolean isEmpty(){
        return list.size() == 0;
    }
    
    void push(int num){
        list.add(num);
    }
    void pop (){
        if (!isEmpty())
            list.remove(list.size() - 1);
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

public class Stack {

    
    public static void main(String[] args) {

       MyStack myStack = new MyStack();
        
       System.out.println(myStack.isEmpty());
       myStack.push(10);
       myStack.push(20);
       myStack.push(30);
       myStack.push(40);
       myStack.push(50);
       System.out.println(myStack.isEmpty());
       myStack.displayreverse();
       System.out.println("----------------");
       myStack.pop();
       myStack.displayreverse();
       
        
        
    }
    
}
