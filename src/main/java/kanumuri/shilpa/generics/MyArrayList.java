package kanumuri.shilpa.generics;

import java.util.Arrays;

/**
 * Created by zipcoder on 2/22/17.
 */
public class MyArrayList<E>{
    private static final int initialCapacity = 1;
    private int size = 0;   //number of elements
    private Object[] elements = { };

    public MyArrayList(){
        elements = new Object[initialCapacity];
    }

    public MyArrayList(int Capacity){
        elements = new Object[Capacity];
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public void add(int index ,E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        return (E) elements[index]; // return value on index.
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        elements[index] = element;
        return (E) elements[index]; // return value on index.
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }

        Object removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return removedElement;
    }

/*    public void clear(){

        for(int i = 0; i < size; i++ ){
            remove(elements[]);
        }
    }*/

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(E element){
        boolean exists = false;
        for(int i =0; i < size ; i++){
            if(element.equals(elements[i])){
                exists = true;
            }
        }
        return exists;
    }

    private void ensureCapacity() {
        int newIncreasedCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newIncreasedCapacity);
    }


}

