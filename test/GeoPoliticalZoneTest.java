import chapterEight.GeoPoliticalZone;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class GeoPoliticalZoneTest {
    @Test
    public void testLengthOfGeoPoliticalZone(){
    assertEquals(6, GeoPoliticalZone.values().length);

    }
    @Test
    public void findStateTest(){
        GeoPoliticalZone1 geoPoliticalZone1 = new GeoPoliticalZone1();
        assertEquals(GeoPoliticalZone.NORTHEAST,geoPoliticalZone1.displayStates("Adamawa"));
    }
    @Test
    public void enterState_getZoneTest(){
        GeoPoliticalZone1 geoPoliticalZone1 = new GeoPoliticalZone1();
        assertEquals(GeoPoliticalZone.NORTHCENTRAL,geoPoliticalZone1.displayStates("Plateau"));
    }

    @Test
    public void enterInvalidState_getZoneTest(){
        GeoPoliticalZone1 geoPoliticalZone1 = new GeoPoliticalZone1();
        assertNotEquals(GeoPoliticalZone.SOUTHEAST,geoPoliticalZone1.displayStates("Kogi"));
    }
}
