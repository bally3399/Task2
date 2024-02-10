package set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set mySet;

    @BeforeEach
    public void Set() {
        mySet = new Set();
    }
    @Test
    public void testThatSetIsEmpty(){
        assertTrue(mySet.isEmpty());
    }
    @Test
    public void addElement_setIsNotEmpty(){
        assertTrue(mySet.isEmpty());
        mySet.add("Orange");
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void addTwoElementsTest(){
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("Orange");
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void addA_removeA_setIsEmptyTest(){
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.remove("Apple");
        assertTrue(mySet.isEmpty());

    }
    @Test
    public void addAB_removeAll_setIsEmptyTest(){
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("Orange");
        mySet.add("Banana");
        assertFalse(mySet.isEmpty());
        mySet.removeAll();
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void addSameElement_returnOneTest(){
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("Apple");
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void addA_checkIfTheElementContainATest() {
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        assertTrue(mySet.contains("Apple"));
    }

    @Test
    public void addXY_checkIfTheSetContainXYTest(){
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("Orange");
        assertTrue(mySet.contains("Apple"));
        assertTrue(mySet.contains("Orange"));
    }

    @Test
    public void setDoesNotContainsElement(){
        assertTrue(mySet.isEmpty());
        mySet.add("Orange");
        assertFalse(mySet.contains("Apple"));
    }
    @Test
    public void addSameElement_returnTwoTest(){
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("apple");
        assertFalse(mySet.isEmpty());
    }
    @Test
    public void addXY_checkIfTheSetContainAllTest(){
        assertTrue(mySet.isEmpty());
        mySet.add("Apple");
        mySet.add("Orange");
        assertTrue(mySet.containAll());
    }
    @Test
    public void getSize_returnTheLengthOfTheSetTest(){
        assertTrue(mySet.isEmpty());
        mySet.add("Orange");
        mySet.add("Apple");
        mySet.add("Lemon");
        assertEquals(3, mySet.getSize());
    }

    @Test
    public void addThreeElementTest(){
        assertTrue(mySet.isEmpty());
        mySet.add("Orange");
        mySet.add("Apple");
        mySet.add("Lemon");
        assertTrue(mySet.addAll());
    }


    }
