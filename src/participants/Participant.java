package participants;

public abstract class Participant {
    private int maxLength;
    private int maxHeight;
    private String name;

    public Participant(int maxLength, int maxHeight, String name) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.name = name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public String getName() {
        return name;
    }

    public boolean overcome(Obstacle obstacle) {
        boolean result = obstacle.overcome(this);
        if (result) {
            System.out.println(getName() + " has overcome the " + obstacle.getDescription());
        } else {
            System.out.println(getName() + " did not overcome the " + obstacle.getDescription());
        }
        return result;
    }

    public void jump(int height) {
        System.out.println("jumping over a " + height + " meter wall");
    }

    public void run(int length) {
        System.out.println("running on a " + length + " meter track");
    }
}