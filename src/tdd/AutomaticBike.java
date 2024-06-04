package tdd;

public class AutomaticBike {
    private boolean bikeOnAndOffSwitch;
    private int speed = 0;
    private int gear;

    public boolean bikeIsOn(String OnOrOff) {
        bikeOnAndOffSwitch = true;
        return bikeOnAndOffSwitch;
    }

    public boolean bikeIsOff(String onOrOff) {
        bikeOnAndOffSwitch = false;
        return bikeOnAndOffSwitch;
    }

    public int checkTheCurrentSpeed() {
        return speed;
    }

    public int checkGear() {

        if(speed < 21){gear = 1;}

        if(speed  >= 21 && speed <= 30){gear = 2;}

        if(speed >= 31 && speed <= 40){gear = 3;}

        if(speed >= 41){gear = 4;}

        return gear;
    }

    public void accelerate() {

        speed += checkGear();
    }

    public void deaccelerate() {
        speed -= checkGear();
    }
}
