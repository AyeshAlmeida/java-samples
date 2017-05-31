
public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void printCarDetails() {
        super.printCarDetails();
        System.out.println("Adding features of a Luxury Car.");
    }
}
