
public class WithoutDecoratorTest {
    public static void main(String[] args){
        wpCar basic = new wpCar();
        basic.printCarInfo();
        System.out.println("--------------------");
        wpSportsCar sportsCar = new wpSportsCar();
        sportsCar.printCarInfo();
        System.out.println("--------------------");
        wpLuxuryCar luxuryCar = new wpLuxuryCar();
        luxuryCar.printCarInfo();
        System.out.println("--------------------");
        wpSportsAndLuxuryCar sportsAndLuxuryCar = new wpSportsAndLuxuryCar();
        sportsAndLuxuryCar.printCarInfo();

    }
}
