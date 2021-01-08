package Task2;

public class Helm extends Engine {

    int diametfOfHelm;
    String material;

    public Helm(int numberOfCylinder, int diametfOfHelm,String material) {
        super(numberOfCylinder);
        this.diametfOfHelm = diametfOfHelm;
        this.material=material;

    }
}
