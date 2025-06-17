package turing;

import java.util.ArrayList;
import java.util.List;

public class CharStackImpl implements CharStack {

    List<Character> list = new ArrayList<>();

    @Override
    public void push(char c) {
        list.add(0, c);
    }

    @Override
    public char pop() {
        return list.remove(0);
    }

    @Override
    public char top() {
        return list.get(0);
    }

    @Override
    public void init() {
        list = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
}
