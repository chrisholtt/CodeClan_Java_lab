import java.util.ArrayList;

public class Customer implements IBuy {
    private ArrayList<Car> cars;
    private int money;

    public Customer( int money) {
        this.money = money;
        this.cars = new ArrayList<Car>();
    }

    public int getCars(){
        return this.cars.size();
    }

    public int getMoney(){
        return this.money;
    }


    @Override
    public void buyCar(Car car) {
        if (money > car.getValue()) {
            this.money -= car.getValue();
            this.cars.add(car);
        }
    }
}
