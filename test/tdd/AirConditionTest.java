package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {
    @Test
    public void checkThatAirConditionCanCome_on() {
        AirCondition blizzardAirConditioner = new AirCondition();
        assertTrue(blizzardAirConditioner.isOn("on"));
    }

    @Test
    public void checkThatAirConditionTurnsOff () {
        AirCondition blizzardAirConditioner = new AirCondition();
        blizzardAirConditioner.isOn("on");
        assertFalse(blizzardAirConditioner.isOff("off"));
    }

    @Test
    public void checkAirConditionDefaultTemperature() {
        AirCondition blizzardAirConditioner = new AirCondition();
        blizzardAirConditioner.isOn("on");
        assertEquals(16, blizzardAirConditioner.checkTemperature());
    }

    @Test
    public void checkThatAirConditionIncreasesTemperature() {
        AirCondition blizzardAirConditioner = new AirCondition();
        blizzardAirConditioner.isOn("on");
        blizzardAirConditioner.increaseTemperature(4);
        assertEquals(20,  blizzardAirConditioner.checkTemperature());
    }
    @Test
    public void checkThatAirConditionCanDecreaseInTemperature() {
        AirCondition blizzardAirConditioner = new AirCondition();
        blizzardAirConditioner.isOn("on");
        blizzardAirConditioner.increaseTemperature(4);
        blizzardAirConditioner.decreaseTemperature(2);
        assertEquals(18, blizzardAirConditioner.checkTemperature());

    }

    @Test
    public void checkThatAirConditionTemperatureCannotIncreaseBeyond_default_30_degrees() {
        AirCondition blizzardAirConditioner = new AirCondition();
        blizzardAirConditioner.isOn("on");
        blizzardAirConditioner.increaseTemperature(14);
        assertEquals(30, blizzardAirConditioner.checkTemperature());

    }
    @Test
    public void checkThatAirConditionTemperatureCannotDecreaseBelow_default_16_degrees() {
        AirCondition blizzardAirConditioner = new AirCondition();
        blizzardAirConditioner.isOn("on");
        blizzardAirConditioner.decreaseTemperature(10);
        assertEquals(16, blizzardAirConditioner.checkTemperature());

    }
}
