package tdd;

public class AirCondition {

    private int temperature = 16;

    public boolean isOn(String turnOn) {

        return true;
    }

    public boolean isOff(String turnOff){

     return  false;
     }

    public int checkTemperature() {
        return temperature;

    }

    public void increaseTemperature(int degree) {
        temperature = temperature + degree;
        if (temperature > 30) {temperature = 30;}
    }

    public void decreaseTemperature(int degree) {
        temperature = temperature - degree;
        if (temperature < 16) {temperature = 16 ;}
    }
}
