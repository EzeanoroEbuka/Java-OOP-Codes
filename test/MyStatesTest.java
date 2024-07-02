import org.junit.Test;
import tdd.GeoPoliticalZone;
import tdd.MyStates;

import static org.junit.jupiter.api.Assertions.*;

public class MyStatesTest {

    private MyStates states = new MyStates();
    @Test
    public void testThatTheCorrectZoneOfAGivenStateIsReturned(){
        assertSame(GeoPoliticalZone.SOUTHWEST, states.checkStateInZone("Ekiti"));
    }

    @Test
    public void testThatAllStatesOfAGivenZoneIsReturned(){
        String[] listOfStates = {"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"};
        //GeoPoliticalZone zone = GeoPoliticalZone.SOUTHWEST;
        String[] politicalZone = states.getAllStatesInZones("SOUTHWEST");
        assertArrayEquals(listOfStates, politicalZone);
    }

    @Test
    public void testThatGetAllZoneReturneStatesInZone(){
        String[] listOfStates = {"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"};
        String[] politicalZone = states.getAllStatesInZones("SOUTHWEST");
        assertArrayEquals(listOfStates, politicalZone);
    }

    @Test
    public void testThatTheStatesInGivenZoneAtAnyCaseIsReturned(){
        String[] listOfStates = {"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"};
        String[] politicalZone = states.getAllStatesInZones("sOUTHwESt");
        assertArrayEquals(listOfStates, politicalZone);
    }
}
