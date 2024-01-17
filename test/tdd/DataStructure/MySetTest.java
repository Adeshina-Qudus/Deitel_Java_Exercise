package tdd.DataStructure;


import DataStructure.MySet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MySetTest {

    @Test
    public void testThatSetExist(){
        MySet set = new MySet();
        Assertions.assertNotNull(set);
    }
    @Test
    public void testThatSetIsEmpty(){
        MySet set = new MySet();
        Assertions.assertTrue(set.isEmpty());
    }
    @Test
    public void set_Is_Empty_Add_To_Set_And_Set_Is_Not_EmptyTest(){
        MySet set = new MySet();
        Assertions.assertTrue(set.isEmpty());
        set.add(21);
        Assertions.assertFalse(set.isEmpty());
    }

    @Test
    public void  testIfAnElementIsPresentInSet(){
        MySet set = new MySet();
        set.add(21);
        set.add(45);
        Assertions.assertTrue(set.contains(21));
    }

    @Test
    public void test_Iterator(){
        MySet set = new MySet();
        set.add(30);
        set.add(45);
        set.add(38);
        set.iterator();

    }

    @Test
    public void testRemove(){
        MySet set = new MySet();
        set.add(30);
        Assertions.assertTrue(set.remove(30));
    }

    @Test
    public void testSize(){
        MySet set = new MySet();
        set.add(34);
        set.add(45);
        set.add(23);
        Assertions.assertEquals(3, set.returnSize());
    }

    @Test
    public void testToArray(){
        MySet set = new MySet();
        set.add(20);
        set.add(30);
        set.add(309);
        set.add(20);
        assertArrayEquals(new int[]{20,30,309,20},set.toArray());

    }



}