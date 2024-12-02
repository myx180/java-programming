public class week9task3{
    int channel = 1; // Default value
    int volumeLevel = 1; // Default value
    boolean on = false;

    public TV() {
        // Constructor
    }

    // turn on tv
    public void turnOn() {
        on = true;
    }

    // turn off tv
    public void turnOff() {
        on = false;
    }

    // set channel
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    // set volume
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    // increase channel
    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    // decrease channel
    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }

    // increase volume
    public void volumeUp() {
        if (on && volumeLevel <= 7) {
            volumeLevel++;
        }
    }

    // decrease volume
    public void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }
}
