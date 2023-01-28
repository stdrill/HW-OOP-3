package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListList<E> implements Iterable<E>{
    public List<E> list = new ArrayList<>();

    public List<E> getList() {
        return list;
    }
    public void addList(E e){
        getList().add(e);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index;
            @Override
            public boolean hasNext() {
                return getList().size() > index;
            }

            @Override
            public E next() {
                return getList().get(index++);
            }
        };
    }

}
