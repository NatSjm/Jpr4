package participants;

public class RunningTrack extends Obstacle {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.getMaxLength() >= length) {
            participant.run(getLength());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "running track of length " + getLength() + " meters";
    }
    }

