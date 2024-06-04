package tdd;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class TelevisionTest {

    @Test
    public void testThatTvIsComing_on() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
    }

    @Test
    public void testThatTvIsGoing_off() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertFalse(sonyTv.tvIsOff());
    }

    @Test
    public void testToCheckTheTvCurrentChannel() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(1, sonyTv.checkChannel());
    }

    @Test
    public void testThatTvGoesToNextChannel() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(1, sonyTv.checkChannel());
        sonyTv.toNextChannel();
        assertEquals(2, sonyTv.checkChannel());
    }

    @Test
    public void testThatTvGoesToNextChannel_3Times() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(1, sonyTv.checkChannel());
        sonyTv.toNextChannel();
        sonyTv.toNextChannel();
        sonyTv.toNextChannel();
        assertEquals(4, sonyTv.checkChannel());
    }

    @Test
    public void testThatTvGoesToPreviousChannel() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(1, sonyTv.checkChannel());
        sonyTv.toNextChannel();
        sonyTv.toNextChannel();
        sonyTv.toPreviousChannel();
        assertEquals(2, sonyTv.checkChannel());
    }

    @Test
    public void testThatTvGoesToSpecifiedChannel() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(1, sonyTv.checkChannel());
        sonyTv.goToSpecifiedChannel(34);
        assertEquals(34, sonyTv.checkChannel());
    }

    @Test
    public void testThatTvHasOnly_100ChannelsAndCannotExceedChannel_100() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(1, sonyTv.checkChannel());
        sonyTv.goToSpecifiedChannel(101);
        assertEquals(1, sonyTv.checkChannel());

    }

    @Test
    public void testThatTvReturnsYouToTheChannelOfTheLastDigitIfYouExceed_100() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(1, sonyTv.checkChannel());
        sonyTv.goToSpecifiedChannel(109);
        assertEquals(9, sonyTv.checkChannel());
    }

    @Test
    public void testToCheckTheContrastLevelOfTv() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(5, sonyTv.checkContrastLevel());
    }

    @Test
    public void testThatTvCanIncreaseInContrast() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(5, sonyTv.checkContrastLevel());
        sonyTv.increaseContrast();
        assertEquals(6, sonyTv.checkContrastLevel());
    }

    @Test
    public void testThatTvCanDecreaseInContrast() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(5, sonyTv.checkContrastLevel());
        sonyTv.decreaseContrast();
        assertEquals(4, sonyTv.checkContrastLevel());
    }

    @Test
    public void testThatTvCannotDecreaseInContrastBelow_level_1() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(5, sonyTv.checkContrastLevel());
        for(int index = 0; index < 6; index++) {
            sonyTv.decreaseContrast();
        }
        assertEquals(1, sonyTv.checkContrastLevel());
    }

    @Test
    public void testThatTvCannotIncreaseInContrastAbove_level_10() {
        Television sonyTv = new Television();
        assertTrue(sonyTv.tvIsOn());
        assertEquals(5, sonyTv.checkContrastLevel());
        for(int index = 0; index < 7; index++) {
            sonyTv.increaseContrast();
        }
        assertEquals(10, sonyTv.checkContrastLevel());
    }
}