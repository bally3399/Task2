public class Bike {
    private boolean myBikeIsOn;
    private int gear;
    public int speed;
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean bikeIsOn() {
        return myBikeIsOn;
    }

    public void toggle() {
        myBikeIsOn = !myBikeIsOn;
    }


       public int getGear() {
           if (myBikeIsOn && speed >= 0 && speed < 20){
               gear = 1;
           }
           else if (speed >= 20 && speed <= 30){
               gear = 2;
           }
           else if (speed > 30 && speed < 40){
               gear = 3;
           }
           else if (speed >= 40){
               gear = 4;
           }
           return gear;
       }


    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        getGear();
        if (myBikeIsOn && gear == 1) {
            speed++;
        }
        else if (myBikeIsOn && gear == 2) {
            speed += 2;
        }
        else if (myBikeIsOn && gear == 3) {
            speed += 3;
        }
        else if (myBikeIsOn && gear == 4) {
            speed += 4;
        }

    }


    public void decelerate() {
        getGear();
        if (myBikeIsOn && gear == 1) {
            speed--;
        }
        else if (myBikeIsOn && gear == 2) {
            speed -= 2;
        }
        else if (myBikeIsOn && gear == 3) {
            speed -= 3;
        }
        else if (myBikeIsOn && gear == 4) {
            speed -= 4;
        }


    }
}
