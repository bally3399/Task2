package fireDrill;

public class AirConditioner {
    private boolean acIsOn;
    private int temp = 16;

    public boolean airConditionerIsOn() {
        return acIsOn;
    }


    public void toggle() {
        acIsOn = !acIsOn;
    }

    public void increaseTemperature() {
        if(airConditionerIsOn() && temp >= 16 && temp < 30)
            temp++;
    }

    public int getAcTemperature() {
        return temp;
    }

    public void decreaseTemperature() {
        if(airConditionerIsOn() && temp > 16 && temp <= 30)
            temp--;
    }
}

