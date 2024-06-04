package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void testThatAutomaticBikeCanBeTurned_on() {
        AutomaticBike bike = new AutomaticBike();
        assertTrue(bike.bikeIsOn(),"The bike is On");
    }

    @Test
    public void testThatAutomaticBikeCanBeTurned_off() {
        AutomaticBike bike = new AutomaticBike();
        assertTrue(bike.bikeIsOn(),"The bike is On");
        assertFalse(bike.bikeIsOff(),"The bike is Off");
    }

    @Test
    public void testToKnowTheCurrentSpeedOfAutomaticBike() {
        AutomaticBike bike = new AutomaticBike();
        assertEquals(0 ,bike.checkTheCurrentSpeed());
    }
    @Test
    public void testToKnowTheCurrentGearOfAutomaticBike() {
        AutomaticBike bike = new AutomaticBike();
        assertEquals(1 ,bike.checkGear());
    }

    @Test
    public void testThatAutomaticBikeCanBe_acceleratedOnGear() {
        AutomaticBike bike = new AutomaticBike();
        assertTrue(bike.bikeIsOn(),"The bike is On");
        assertEquals(1 ,bike.checkGear());
        bike.accelerate();
        assertEquals(1,bike.checkTheCurrentSpeed());

    }

    @Test
    public void testThatAutomaticBikeCanBe_acceleratedTwice() {
        AutomaticBike bike = new AutomaticBike();
        assertTrue(bike.bikeIsOn(), "The bike is On");
        assertEquals(1, bike.checkGear());
        bike.accelerate();
        bike.accelerate();
        assertEquals(1 ,bike.checkGear());
        assertEquals(2 ,bike.checkTheCurrentSpeed());
    }

    @Test
    public void testThatAutomaticBikeCanBe_acceleratesToGears_2() {
        AutomaticBike bike = new AutomaticBike();
        assertTrue(bike.bikeIsOn(),"The bike is On");
        assertEquals(1, bike.checkGear());
        for(int count = 0;count < 21;count++){
            bike.accelerate();}
        assertEquals(21,bike.checkTheCurrentSpeed());

    }

    @Test
    public void testThatAutomaticBikeCanBe_acceleratesToAllGears() {
        AutomaticBike bike = new AutomaticBike();
        assertTrue(bike.bikeIsOn(),"The bike is On");
        assertEquals(1, bike.checkGear());
        for(int count = 0;count < 21;count++){
            bike.accelerate();}
        assertEquals(21,bike.checkTheCurrentSpeed());
        bike.accelerate();
        bike.accelerate();
        assertEquals(25,bike.checkTheCurrentSpeed());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(34,bike.checkTheCurrentSpeed());
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(43,bike.checkTheCurrentSpeed());
        bike.accelerate();
        bike.accelerate();
        assertEquals(51,bike.checkTheCurrentSpeed());
    }

    @Test
    public void testThatAutomaticBikeCanBe_deceleratedOnGear_2() {
        AutomaticBike bike = new AutomaticBike();
        assertTrue(bike.bikeIsOn(),"The bike is On");
        bike.accelerate();
        bike.accelerate();
        bike.decelerate();
        assertEquals(1,bike.checkTheCurrentSpeed());

    }
    @Test
    public void testThatAutomaticBikeCanBe_deAcceleratesToGears_2() {
        AutomaticBike bike = new AutomaticBike();
        assertTrue(bike.bikeIsOn(),"The bike is On");
        assertEquals(1, bike.checkGear());
        for(int count = 0;count < 25;count++){
            bike.accelerate();}
        bike.decelerate();
        bike.decelerate();
        assertEquals(25,bike.checkTheCurrentSpeed());
    }
}
