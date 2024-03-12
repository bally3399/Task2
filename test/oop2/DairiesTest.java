package oop2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DairiesTest {

    @Test
    public void addTest(){
        Dairies dairies = new Dairies();
        dairies.add("username","password");
        assertEquals(1, dairies.getLength().size());
    }

    @Test
    public void findByUserNameTest(){
        Dairies dairies = new Dairies();
        dairies.add("username","password");
        Diary foundDairy = dairies.findByUserName("username");
        assertEquals("username", foundDairy.getUsername());

    }

    @Test
    public void deleteTest(){
        Dairies dairies = new Dairies();
        dairies.add("username","password");
        dairies.remove("username", "password");
        assertEquals(0, dairies.getLength().size());
    }
    @Test
    public void addTwiceTest(){
        Dairies dairies = new Dairies();
        dairies.add("username","password");

        dairies.add("username1","password1");
        assertEquals(2, dairies.getLength().size());
    }

    @Test
    public void addTwice_deleteOneTest(){
        Dairies dairies = new Dairies();
        dairies.add("username","password");
        dairies.add("username1","password1");

        dairies.remove("username", "password");
        assertEquals(1, dairies.getLength().size());
    }
    @Test
    public void findTwoUSerByName(){
        Dairies dairies = new Dairies();
        dairies.add("username","password");
        dairies.add("username1","password1");

        Diary foundDairy = dairies.findByUserName("username");
        Diary foundDairy1 = dairies.findByUserName("username1");

        assertEquals("username", foundDairy.getUsername());
        assertEquals("username1", foundDairy1.getUsername());

    }


}
