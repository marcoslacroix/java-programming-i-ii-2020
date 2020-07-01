
public class Timer {

    private ClockHand seconds;
    private ClockHand centesimos;

    public Timer() {
        this.centesimos = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.centesimos.advance();

        if (this.centesimos.value() == 0) {
            this.seconds.advance();

        }
    }

    @Override
    public String toString() {
        return seconds + ":" + centesimos;
    }
    }

