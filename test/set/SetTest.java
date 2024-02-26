package set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    @Test
    public void testThatSetIsEmpty(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
    }
    @Test
    public void addElement_setIsNotEmpty(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Orange");
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void addTwoElementsTest(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("Orange");
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void addA_removeA_setIsEmptyTest(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.remove("Apple");
        assertTrue(mySet.isEmpty());

    }
    @Test
    public void addAB_removeAll_setIsEmptyTest(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("Orange");
        mySet.add("Banana");
        mySet.removeAll(mySet);
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void addSameElement_returnOneTest(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("Apple");
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void addA_checkIfTheElementContainATest() {
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        assertTrue(mySet.contains("Apple"));
    }

    @Test
    public void addXY_checkIfTheSetContainXYTest(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("Orange");
        assertTrue(mySet.contains("Apple"));
        assertTrue(mySet.contains("Orange"));
    }

    @Test
    public void setDoesNotContainsElement(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Orange");
        assertFalse(mySet.contains("Apple"));
    }
    @Test
    public void addSameElement_returnTwoTest(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("apple");
        assertFalse(mySet.isEmpty());
    }
    @Test
    public void addXY_checkIfTheSetContainAllTest(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("Orange");
        mySet.add("lemon");

        Set mySet1 = new Set();
        mySet.add("Orange");
        mySet.add("pine_apple");
        mySet.add("lemon");
        assertTrue(mySet.containAll(mySet1));
    }
    @Test
    public void getSize_returnTheLengthOfTheSetTest(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Orange");
        mySet.add("Apple");
        mySet.add("Lemon");
        assertEquals(3, mySet.getSize());
    }

    @Test
    public void addThreeElementTest(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Orange");
        mySet.add("Apple");
        mySet.add("Lemon");

        Set mySet1 = new Set();
        mySet.add("orange");
        mySet.add("apple");
        assertTrue(mySet.addAll(mySet1));
    }
    @Test
    public void testThatSetCanIterate(){
        Set mySet = new Set();
        assertTrue(mySet.isEmpty());
        mySet.add("Orange");
        mySet.add("Apple");
        assertTrue(mySet.iterator());
    }

    }
