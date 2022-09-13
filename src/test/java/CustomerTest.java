import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    Dealership dealership;
    Car car;


    @Before
    public void setUp(){
        customer = new Customer(100_000_000);
        dealership = new Dealership(1000000000);
        car = new Car("Black", CarTypes.HOVER_CAR, 1000);
    }

    @Test
    public void canBuyACar(){
        customer.buyCar(car);
        assertEquals(1, customer.getCars());
        assertEquals(99999000, customer.getMoney());
    }

    @Test
    public void dealershipCanBuyCar(){
        dealership.buyCar(car);
        dealership.buyCar(car);
        assertEquals(2, dealership.getCars(car));
    }

    @Test
    public void dealerCanSellCar(){
        dealership.buyCar(car);
        customer.buyCar(car);
        dealership.sellCar(car);
        assertEquals(0, dealership.getCars(car));
    }

    @Test
    public void canDamageCar(){
        car.addDamage(250);
        assertEquals(750, car.getValue());
    }

    @Test
    public void canRepairVehicle(){
        dealership.repair(1000, car);
        assertEquals(2000, car.getValue());
    }




}
