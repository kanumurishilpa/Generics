package kanumuri.shilpa.gererics;

import kanumuri.shilpa.generics.MyArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zipcoder on 2/22/17.
 */
public class MyArrayListTest {

    MyArrayList<Integer> list;


    @Before
    public void setUp(){
        list = new MyArrayList<Integer>();
    }

    @Test
    public void sizeTest(){
        list.add(1);
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        list.add(777);
        int expected = 8;
        int actual = list.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addTest(){
        list.add(1);
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(5, 1000);
        int expected = 1000;
        int actual = list.get(5);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        list.add(1);
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        list.add(777);
        list.remove(4);
        int expected = 7;
        int actual = list.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTest(){
        list.add(1);
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        list.add(777);
        int expected = 666;
        int actual = list.get(6);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setTest(){
        list.add(1);
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        list.add(777);
        int expected = 9999;
        int actual = list.set(6, 9999 );
        Assert.assertEquals(expected,actual);
    }

  /*  @Test
    public void clearTest(){
        list.add(1);
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        //list.clear();
        int expected = 0;
        int actual = list.size();
        Assert.assertEquals(expected,actual);
    }*/

    @Test
    public void isEmptyTest(){
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void isEmptyFalseTest(){
        list.add(23);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void containsTest(){
        list.add(1);
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        Assert.assertTrue(list.contains(444));
    }

    @Test
    public void containsFalseTest(){
        list.add(1);
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        Assert.assertFalse(list.contains(90));
    }



}
