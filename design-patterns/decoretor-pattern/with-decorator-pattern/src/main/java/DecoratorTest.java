
public class DecoratorTest {
    public static void main(String[] args){
        SportsCar sportsCar = new SportsCar(new BasicCar());
        sportsCar.printCarDetails();

        System.out.println("--------------------------------");

        Car sportsLuxuryCar =  new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.printCarDetails();


    }
}
