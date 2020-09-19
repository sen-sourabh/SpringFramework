package MainTest;

import Cars.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
        Car car = (Car) ap.getBean(Car.class);
        car.printData();
    }
}
