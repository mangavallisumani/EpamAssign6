package collections;

import java.util.Arrays;

public class CustomList<E> {
	
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object ele[];
    public CustomList() {
    	ele = new Object[DEFAULT_CAPACITY];
    }
    public void add(E e) {
        if (size == ele.length) {
            ele = Arrays.copyOf(ele, ele.length*2);
        }
        ele[size++] = e;
    }
    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("given index is out of the list size");
        }
        return (E) ele[i];
    }
    @SuppressWarnings("unchecked")
    public E remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("given index is out of the list size");
        }
        Object e = ele[i];
        int rem = ele.length - ( i + 1 ) ;
        System.arraycopy( ele, i + 1, ele, i, rem) ;
        size--;
        return (E) e;
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(ele[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
   
	
}
