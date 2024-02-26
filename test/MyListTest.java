import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyListTest {

    @Test
    public void testThatArrayIsEmpty(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
    }

    @Test
    public void addNewElementToArrayList_listIsNotEmpty(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("rice");
        assertFalse(string.isEmpty());
    }

    @Test
    public void addAndRemoveElementsInArrayList_listIsEmpty(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("potato");
        assertFalse(string.isEmpty());
        string.remove("potato");
        assertTrue(string.isEmpty());

    }

    @Test
    public void addTwoElementsAndRemoveOne_listIsNotEmpty(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        assertFalse(string.isEmpty());
        string.remove("Orange");
        assertFalse(string.isEmpty());
    }
    @Test
    public void AddTwoElement_getIndexOfAnElementTest() {
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        assertFalse(string.isEmpty());

        assertEquals("Orange", string.get(1));
        assertEquals("Apple", string.get(2));
    }

    @Test
    public void AddTwoElement_getTheElementByIndexTest() {
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        assertFalse(string.isEmpty());

        assertEquals(0, string.getIndex("Orange"));
        assertEquals(1, string.getIndex("Apple"));
    }

    @Test
    public void AddThreeElementAndRemoveSecondElement_thirdElementIsIndex2Test() {
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        string.add("pine-apple");
        assertFalse(string.isEmpty());

        string.remove("Apple");
        assertEquals(1, string.getIndex("pine-apple"));
    }

    @Test
    public void addElement_checkIfTheElementContainTheElementTest(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("Apple");
        assertTrue(string.contain("Apple"));

    }

    @Test
    public void addTwoElement_checkIfTheElementContainsTheElementTest(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("Apple");
        string.add("banana");
        assertTrue(string.contain("Apple"));
        assertTrue(string.contain("banana"));

    }

    @Test
    public void testThatListDoesNotContainElement(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("pine-apple");
        assertFalse(string.contain("apple"));
    }


    @Test
    public void getLength_returnTheLengthOfTheListTest(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        assertEquals(2, string.getSize());
    }

    @Test
    public void getSize_returnTheLengthOfTheListTest(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        string.add("Lemon");
        assertEquals(3, string.getSize());
    }

    @Test
    public void addElement_listCanCopyElement(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("Orange");
        assertTrue(string.copy("Orange"));
    }

    @Test
    public void addTwoElementsAndRemoveAll_listIsEmpty(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        assertFalse(string.isEmpty());

        MyList string1 = new MyList();
        string1.add("Orange");
        string1.add("Apple");
        assertTrue(string.removeAll(string));
    }

    @Test
    public void addTwoElementsAndClear_listIsNotEmpty(){
        MyList string = new MyList();
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        assertFalse(string.isEmpty());
        string.clear();
        assertTrue(string.isEmpty());
    }

}
