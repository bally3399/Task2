import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyListTest {
    private MyList string;

    @BeforeEach
    public void MyList() {
        string = new MyList();
    }
    @Test
    public void testThatArrayIsEmpty(){
        assertTrue(string.isEmpty());
    }

    @Test
    public void addNewElementToArrayList_listIsNotEmpty(){
        assertTrue(string.isEmpty());
        string.add("rice");
        assertFalse(string.isEmpty());
    }

    @Test
    public void addAndRemoveElementsInArrayList_listIsEmpty(){
        assertTrue(string.isEmpty());
        string.add("potato");
        assertFalse(string.isEmpty());
        string.remove("potato");
        assertTrue(string.isEmpty());

    }

    @Test
    public void addTwoElementsAndRemoveOne_listIsNotEmpty(){
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        assertFalse(string.isEmpty());
        string.remove("Orange");
        assertFalse(string.isEmpty());
    }
    @Test
    public void AddTwoElement_getIndexOfAnElementTest() {
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        assertFalse(string.isEmpty());

        assertEquals("Orange", string.get(1));
        assertEquals("Apple", string.get(2));
    }

    @Test
    public void AddTwoElement_getTheElementByIndexTest() {
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        assertFalse(string.isEmpty());

        assertEquals(0, string.getIndex("Orange"));
        assertEquals(1, string.getIndex("Apple"));
    }

    @Test
    public void AddThreeElementAndRemoveSecondElement_thirdElementIsIndex2Test() {
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
        assertTrue(string.isEmpty());
        string.add("Apple");
        assertTrue(string.contain("Apple"));

    }

    @Test
    public void addTwoElement_checkIfTheElementContainsTheElementTest(){
        assertTrue(string.isEmpty());
        string.add("Apple");
        string.add("banana");
        assertTrue(string.contain("Apple"));
        assertTrue(string.contain("banana"));

    }

    @Test
    public void testThatListDoesNotContainElement(){
        assertTrue(string.isEmpty());
        string.add("pine-apple");
        assertFalse(string.contain("apple"));
    }


    @Test
    public void getLength_returnTheLengthOfTheListTest(){
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        assertEquals(2, string.getSize());
    }

    @Test
    public void getSize_returnTheLengthOfTheListTest(){
        assertTrue(string.isEmpty());
        string.add("Orange");
        string.add("Apple");
        string.add("Lemon");
        assertEquals(3, string.getSize());
    }

    @Test
    public void addElement_listCanCopyElement(){
        assertTrue(string.isEmpty());
        string.add("Orange");
        assertTrue(string.copy("Orange"));
    }

}
