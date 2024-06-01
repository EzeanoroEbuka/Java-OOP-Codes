package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {
    @Test
    public void checkThatAirConditionCanCome_on() {
        AirCondition blizzerAirConditioner = new AirCondition();
        assertEquals(true, blizzerAirConditioner.isOn("on"));
    }

    @Test
    public void checkThatAirConditionTurnsOff () {
        AirCondition blizzerAirConditioner = new AirCondition();
        blizzerAirConditioner.isOn("on");
        assertEquals(false, blizzerAirConditioner.isOff("off"));
    }

    @Test
    public void checkAirConditionDefaultTemperature() {
        AirCondition blizzerAirConditioner = new AirCondition();
        blizzerAirConditioner.isOn("on");
        assertEquals(16, blizzerAirConditioner.checkTemperature());
    }

    @Test
    public void checkThatAirConditionIncreasesTemperature() {
        AirCondition blizzerAirConditioner = new AirCondition();
        blizzerAirConditioner.isOn("on");
        blizzerAirConditioner.increaseTemperature(4);
        assertEquals(20,  blizzerAirConditioner.checkTemperature());
    }
    @Test
    public void checkThatAirConditionCanDecreaseInTemperature() {
        AirCondition blizzerAirConditioner = new AirCondition();
        blizzerAirConditioner.isOn("on");
        blizzerAirConditioner.increaseTemperature(4);
        blizzerAirConditioner.decreaseTemperature(2);
        assertEquals(18, blizzerAirConditioner.checkTemperature());

    }

    @Test
    public void checkThatAirConditionTemperatureCannotIncreaseBeyound_default_30_degrees() {
        AirCondition blizzerAirConditioner = new AirCondition();
        blizzerAirConditioner.isOn("on");
        blizzerAirConditioner.increaseTemperature(14);
        assertEquals(30, blizzerAirConditioner.checkTemperature());

    }
    @Test
    public void checkThatAirConditionTemperatureCannotDecreaseBelow_default_16_degrees() {
        AirCondition blizzerAirConditioner = new AirCondition();
        blizzerAirConditioner.isOn("on");
        blizzerAirConditioner.decreaseTemperature(10);
        assertEquals(16, blizzerAirConditioner.checkTemperature());

    }
}
