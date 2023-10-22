package participants;

public class Wall extends Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.getMaxHeight() >= height) {
            participant.jump(getHeight());
            return true;
        } else {
            return false;
        }
    }

    public String getDescription() {
        return "wall of height " + getHeight() + " meters";
    }
    }

