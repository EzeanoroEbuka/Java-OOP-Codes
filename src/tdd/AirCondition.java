package tdd;

public class AirCondition {
    private boolean OnAndOffButton;
    private int temperature = 16;

    public boolean isOn(String turnOn) {
        OnAndOffButton = true;
        return OnAndOffButton;
    }

    public boolean isOff(String turnOff){
     OnAndOffButton = false;
     return  OnAndOffButton;
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
        if (temperature < 16) {temperature = 16;}
    }
}
