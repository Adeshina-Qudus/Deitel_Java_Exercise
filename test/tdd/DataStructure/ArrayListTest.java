package tdd.DataStructure;

import DataStructure.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ArrayListTest {

    @Test
    public void arrayListCanBeCreatedTest(){
        ArrayList list = new ArrayList();
        assertNotNull(list);
    }
    @Test
    public void arrayListIsEmptyTest(){
        ArrayList list = new ArrayList();
        assertTrue(list.isEmpty());
    }
    @Test
    public void arrayListIsEmpty_arrayListCanAdd_arrayListIsNotEmptyTest(){
        ArrayList list = new ArrayList();
        assertTrue(list.isEmpty());
        list.add(10);
        assertFalse(list.isEmpty());
    }
    @Test
    public void get_element_Added_Test(){
        ArrayList list = new ArrayList();
        list.add(20);
        assertEquals(20,list.getAddedElement(20));
    }
    @Test
    public void  arraylistCanAdd_arraylistIsNotEmpty_arrayListCanRemove_ArrayListIsEmptyTest(){
        ArrayList list = new ArrayList();
        list.add(20);
        assertFalse(list.isEmpty());
        list.remove(20);
        assertTrue(list.isEmpty());
    }
    @Test
    public void arraylist_Inserts_The_Specified_Element_at_the_specified_position_in_the_list_Test(){
        ArrayList list = new ArrayList();
        list.addElementInIndex(0,11);
        assertEquals(11, list.getElementInIndex(0));
    }
    @Test
    public void remove_element_in_arrayList_test(){
        ArrayList list = new ArrayList();
        list.add(20);
        list.add(30);
        list.remove(20);
        assertEquals(30, list.getElementInIndex(0));
    }

    @Test
    public void remove_Element_In_index_Test(){
        ArrayList list = new ArrayList();
        list.add(20);
        list.add(30);
        list.removeElementInIndex(0);
        assertEquals(30,list.getElementInIndex(0));
    }

    @Test
    public void size_of_arraylist_test(){
        ArrayList list = new ArrayList();
        list.add(20);
        list.add(30);
        list.add(309);
        assertEquals(3,list.returnSize());
    }
    @Test
    public void addToArrayList_and_Remove_thenCheckSize(){
        ArrayList list = new ArrayList();
        list.add(20);
        list.add(30);
        list.add(309);
        list.remove(20);
        list.remove(30);
        list.remove(309);
        assertEquals(0,list.returnSize());
    }
    @Test
    public void test_If_element_contains_in_arraylist(){
        ArrayList list = new ArrayList();
        list.add(20);
        list.add(30);
        list.add(309);
        assertTrue(list.contains(309));
    }
    @Test
    public void test_last_occurrence_of_element_in_Arraylist(){
        ArrayList list = new ArrayList();
        list.add(20);
        list.add(30);
        list.add(309);
        list.add(20);
        assertEquals(3,list.lastIndexOf(20));
    }
    @Test
    public void test_index_of_first_occurrence_test(){
        ArrayList list = new ArrayList();
        list.add(20);
        list.add(30);
        list.add(309);
        list.add(20);
        assertEquals(0,list.indexOf(20));
    }
    @Test
    public void convert_to_array(){
        ArrayList list = new ArrayList();
        list.add(20);
        list.add(30);
        list.add(309);
        list.add(20);
        assertArrayEquals(new int[]{20,30,309,20},list.toArray());
    }

}