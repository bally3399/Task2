import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike myBike;

    @BeforeEach
    public void bike() {
        myBike = new Bike();
    }

    @Test
    public void isOn_bikeIsOnTest() {
        assertFalse(myBike.bikeIsOn());
        myBike.toggle();
        assertTrue(myBike.bikeIsOn());

    }

    @Test
    public void isOff_bikeIsOffTest() {
        myBike.toggle();
        assertTrue(myBike.bikeIsOn());
        myBike.toggle();
        assertFalse(myBike.bikeIsOn());
    }

    @Test
    public void bikeAccelerate_incrementByOneTest() {
        assertFalse(myBike.bikeIsOn());
        myBike.toggle();
        assertTrue(myBike.bikeIsOn());

        assertEquals(1, myBike.getGear());
        assertEquals(0, myBike.getSpeed());
        myBike.setSpeed(15);
        assertEquals(15, myBike.getSpeed());
        assertEquals(1, myBike.getGear());
        myBike.accelerate();
        assertEquals(16, myBike.getSpeed());


    }

    @Test
    public void bikeAccelerate_incrementByTwoTest() {
        assertFalse(myBike.bikeIsOn());
        myBike.toggle();
        assertTrue(myBike.bikeIsOn());

        assertEquals(1, myBike.getGear());
        assertEquals(0, myBike.getSpeed());
        myBike.setSpeed(20);
        assertEquals(20, myBike.getSpeed());
        assertEquals(2, myBike.getGear());
        myBike.accelerate();
        assertEquals(22, myBike.getSpeed());


    }

    @Test
    public void bikeAccelerate_incrementByThreeTest() {
        assertFalse(myBike.bikeIsOn());
        myBike.toggle();
        assertTrue(myBike.bikeIsOn());

        assertEquals(1, myBike.getGear());
        assertEquals(0, myBike.getSpeed());
        myBike.setSpeed(35);
        assertEquals(35, myBike.getSpeed());
        assertEquals(3, myBike.getGear());
        myBike.accelerate();
        assertEquals(38, myBike.getSpeed());


    }

    @Test
    public void bikeAccelerate_incrementByFourTest() {
        assertFalse(myBike.bikeIsOn());
        myBike.toggle();
        assertTrue(myBike.bikeIsOn());

        assertEquals(1, myBike.getGear());
        assertEquals(0, myBike.getSpeed());
        myBike.setSpeed(40);
        assertEquals(40, myBike.getSpeed());
        assertEquals(4, myBike.getGear());
        myBike.accelerate();
        assertEquals(44, myBike.getSpeed());


    }
    @Test
    public void bikeDecelerate_decrementByOneTest() {
        assertFalse(myBike.bikeIsOn());
        myBike.toggle();
        assertTrue(myBike.bikeIsOn());

        assertEquals(1, myBike.getGear());
        assertEquals(0, myBike.getSpeed());
        myBike.setSpeed(15);
        assertEquals(15, myBike.getSpeed());
        assertEquals(1, myBike.getGear());
        myBike.decelerate();
        assertEquals(14, myBike.getSpeed());


    }

    @Test
    public void bikeDecelerate_decrementByTwoTest() {
        assertFalse(myBike.bikeIsOn());
        myBike.toggle();
        assertTrue(myBike.bikeIsOn());

        assertEquals(1, myBike.getGear());
        assertEquals(0, myBike.getSpeed());
        myBike.setSpeed(25);
        assertEquals(25, myBike.getSpeed());
        assertEquals(2, myBike.getGear());
        myBike.decelerate();
        assertEquals(23, myBike.getSpeed());


    }

    @Test
    public void bikeDecelerate_DecrementByThreeTest() {
        assertFalse(myBike.bikeIsOn());
        myBike.toggle();
        assertTrue(myBike.bikeIsOn());

        assertEquals(1, myBike.getGear());
        assertEquals(0, myBike.getSpeed());
        myBike.setSpeed(35);
        assertEquals(35, myBike.getSpeed());
        assertEquals(3, myBike.getGear());
        myBike.decelerate();
        assertEquals(32, myBike.getSpeed());


    }
    @Test
    public void bikeDecelerate_decrementByFourTest() {
        assertFalse(myBike.bikeIsOn());
        myBike.toggle();
        assertTrue(myBike.bikeIsOn());

        assertEquals(1, myBike.getGear());
        assertEquals(0, myBike.getSpeed());
        myBike.setSpeed(40);
        assertEquals(40, myBike.getSpeed());
        assertEquals(4, myBike.getGear());
        myBike.decelerate();
        assertEquals(36, myBike.getSpeed());


    }

}
