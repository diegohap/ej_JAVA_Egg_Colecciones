package service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public abstract class Service<T> {
    private List<T> t;
    protected Service(List<T> t) {
        this.t = t;
    }
    public List<T> getAll(){
        return t;
    }
    public void add(T t){
        this.t.add(t);
    }
    public Boolean remove(T t){
        return this.t.remove(t);
    }
    public Boolean update(T oldElement, T newElement){
        if(!remove(oldElement))
            return false;
        add(newElement);
        return true;
    }
    public List<T> sortByComparator(Comparator<T> comparator){
        t.sort(comparator);
        return t;
    }
    public List<T> findByAttributeName(String attributeName, Object attributeValue) {
        List<T> filteredItemList = new ArrayList<T>();
        try {
            for (T item : t) {
                String getterMethodName = "get" + attributeName.substring(0,1).toUpperCase() + attributeName.substring(1).toLowerCase();
                Object value = item.getClass().getMethod(getterMethodName).invoke(item);
                if(value.equals(attributeValue))
                    filteredItemList.add(item);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return filteredItemList;
    }
}