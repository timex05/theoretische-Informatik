package sem12;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    List<T> data = new ArrayList<>();

    public void push(T element){
        data.add(0,element);
    }

    public T pop(){
        return data.remove(0);
    }

    public T top(){
        return data.get(0);
    }
}
