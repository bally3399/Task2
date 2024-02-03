package airConditioner;

import fireDrill.AirConditioner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner ac;
    @BeforeEach
    public void initializer(){
        ac = new AirConditioner();
    }

    @Test
    public void isOn_acIsOn(){
        assertFalse(ac.airConditionerIsOn());
        ac.toggle();
        assertTrue(ac.airConditionerIsOn());
    }

    @Test
    public void testThatAirConditionerIsOff(){
        ac.toggle();
        assertTrue(ac.airConditionerIsOn());
        ac.toggle();
        assertFalse(ac.airConditionerIsOn());

    }
    @Test
   public void acTemperatureIncreaseTest(){
        ac.toggle();
        assertTrue(ac.airConditionerIsOn());
        int result = ac.getAcTemperature();
        assertEquals(16, result);
        ac.increaseTemperature();
        assertEquals(17, ac.getAcTemperature());
    }

    @Test
    public void acTemperatureDecreaseTest(){
        ac.toggle();
        assertTrue(ac.airConditionerIsOn());
        int result = ac.getAcTemperature();
        assertEquals(16, result);
        ac.decreaseTemperature();
        assertEquals(16, ac.getAcTemperature());
    }

    @Test
    public void increaseAcTemperature_acIncreases() {
        ac.toggle();
        assertTrue(ac.airConditionerIsOn());
        assertEquals(16, ac.getAcTemperature());
        ac.increaseTemperature();
        for (int index = 0; index < 16; index++) {
            ac.increaseTemperature();
        }
        assertEquals(30, ac.getAcTemperature());
    }

    @Test
    public void decreaseAcTemperature_acTemperatureDecreases(){
        ac.toggle();
        assertTrue(ac.airConditionerIsOn());
        int result = ac.getAcTemperature();
        assertEquals(16, result);
        ac.decreaseTemperature();
        assertEquals(16, ac.getAcTemperature());
    }
}
