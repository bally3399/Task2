public class Television {
    private boolean tvIsOn;
    private int volume;
    private int channel;

    public boolean televisionIsOn() {
        return tvIsOn;
    }

    public void toggle() {
        tvIsOn = !tvIsOn;
        if (!tvIsOn) {
            volume = 0;
        }
    }

    public int getVolume() {
        return volume;
    }


    public void volumeUp() {
        if (tvIsOn && volume < 100) {
            volume++;
        }
    }

    public void volumeDown() {
        if (tvIsOn && volume < 100) {
            volume--;
        }
    }

    public int getChannel() {
        return channel;

    }

    public void channel() {
        if(tvIsOn && channel < 150){
            channel++;
        }
    }
}
