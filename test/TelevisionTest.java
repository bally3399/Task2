import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    private Television tv;

    @BeforeEach
    public void Television() {
        tv = new Television();
    }

    @Test
    public void isOn_tvIsOnTest() {
        assertFalse(tv.televisionIsOn());
        tv.toggle();
        assertTrue(tv.televisionIsOn());
    }

    @Test
    public void isOff_tvIsOffTest() {
        tv.toggle();
        assertTrue(tv.televisionIsOn());
        tv.toggle();
        assertFalse(tv.televisionIsOn());
    }

    @Test
    public void isVolumeIncrease_tvVolumeIncreaseTest() {
        assertFalse(tv.televisionIsOn());
        tv.toggle();
        assertTrue(tv.televisionIsOn());
        assertEquals(0, tv.getVolume());

        tv.volumeUp();
        assertEquals(1, tv.getVolume());

    }

    @Test
    public void whileTvIsOff_tvVolumeCannotBeIncreasedTest() {
        assertFalse(tv.televisionIsOn());
        tv.toggle();
        assertTrue(tv.televisionIsOn());
        assertEquals(0, tv.getVolume());

        tv.toggle();
        assertFalse(tv.televisionIsOn());

        tv.volumeUp();
        assertEquals(0, tv.getVolume());

    }

    @Test
    public void isVolumeDecrease_tvVolumeDecreaseTest() {
        assertFalse(tv.televisionIsOn());
        tv.toggle();
        assertTrue(tv.televisionIsOn());
        assertEquals(0, tv.getVolume());

        tv.volumeUp();
        tv.volumeUp();
        assertEquals(2, tv.getVolume());
        tv.volumeDown();
        assertEquals(1, tv.getVolume());

    }
    @Test
    public void whileTvIsOff_tvVolumeCannotBeDecreasedTest() {
        assertFalse(tv.televisionIsOn());
        tv.toggle();
        assertTrue(tv.televisionIsOn());
        assertEquals(0, tv.getVolume());

        tv.volumeUp();
        tv.volumeUp();
        assertEquals(2, tv.getVolume());
        tv.toggle();
        assertFalse(tv.televisionIsOn());
        tv.volumeDown();
        assertEquals(0, tv.getVolume());

    }

    @Test
    public void changeChannel_tvChannelChangeTest(){
        assertFalse(tv.televisionIsOn());
        tv.toggle();
        assertTrue(tv.televisionIsOn());
        assertEquals(0, tv.getChannel());
        tv.channel();
        assertEquals(1, tv.getChannel());

    }

    @Test
    public void whileOff_tvChannelCannotBeChangedTest(){
        assertFalse(tv.televisionIsOn());
        tv.toggle();
        assertTrue(tv.televisionIsOn());
        assertEquals(0, tv.getChannel());
        tv.toggle();
        assertFalse(tv.televisionIsOn());
        tv.channel();
        assertEquals(0, tv.getChannel());


    }

}
