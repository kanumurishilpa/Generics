package kanumuri.shilpa.generics;

/**
 * Created by zipcoder on 2/22/17.
 */
public interface MyCollection<E> {

    int size();
    boolean isEmpty();
    boolean contains(Object o);
    boolean add(E e);
    boolean remove(Object o);
    void clear();


}
