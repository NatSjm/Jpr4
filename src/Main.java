import geometrics.Circle;
import geometrics.GeometricFigure;
import geometrics.Square;
import geometrics.Triangle;
import participants.*;

public class Main {
    public static void main(String[] args) {
//        figures
        GeometricFigure[] figures = new GeometricFigure[3];

        figures[0] = new Circle(5.0);
        figures[1] = new Triangle(4.0, 3.0);
        figures[2] = new Square(6.0);

        double totalArea = calculateTotalArea(figures);
        System.out.println("Сумарна площа всіх фігур: " + totalArea);

//        participants
        Participant[] participants = {
                new Human(100, 2, "John"),
                new Cat(200, 3, "Tom"),
                new Robot(150, 1, "Sam")
        };

        Obstacle[] obstacles = {
                new RunningTrack(100),
                new Wall(2),
                new RunningTrack(150),
                new Wall(3)
        };

        for (Participant participant : participants) {
            boolean isDisqualified = false;
            for (Obstacle obstacle : obstacles) {
                if (!participant.overcome(obstacle)) {
                    isDisqualified = true;
                    break;
                }
            }
            if (!isDisqualified) {
                System.out.println(participant.getName() + " has successfully completed the course.");
            }
        }
    }

    public static double calculateTotalArea(GeometricFigure[] figures) {
        double totalArea = 0;
        for (GeometricFigure figure : figures) {
            totalArea += figure.getArea();
        }
        return totalArea;
    }

}