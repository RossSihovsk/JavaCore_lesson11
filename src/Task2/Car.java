package Task2;

public class Car extends Helm {

    int horsePower;
    int yearofIssue;

    public Car(int numberOfCylinder, int diametfOfHelm, String material,  int horsePower, int yearofIssue) {
        super(numberOfCylinder, diametfOfHelm,material);
        this.horsePower = horsePower;
        this.yearofIssue = yearofIssue;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                ", yearofIssue=" + yearofIssue +
                ", diametfOfHelm=" + diametfOfHelm +
                 + '\'' +
                ", numberOfCylinder=" + numberOfCylinder +
                '}';
    }
}
