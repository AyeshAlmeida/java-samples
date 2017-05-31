
public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void printCarDetails() {
        super.printCarDetails();
        System.out.println("Adding Features of a SportsCar.");
    }
}
