package service;

import java.util.Comparator;
import java.util.List;


public abstract class Service<T> {
    private List<T> t;
    protected Service(List<T> t) {
        this.t = t;
    }
    protected List<T> getAll(){
        return t;
    }
    protected void add(T t){
        this.t.add(t);
    }
    protected Boolean remove(T t){
        return this.t.remove(t);
    }
    protected Boolean update(T oldElement, T newElement){
        if(!remove(oldElement))
            return false;
        add(newElement);
        return true;
    }
    protected List<T> sortByComparator(Comparator<T> comparator){
        t.sort(comparator);
        return t;
    }
}