import java.util.HashMap;

public class Dealership implements IBuy {
    private HashMap<String, Integer> stock;
    private int till;

    public Dealership(int till) {
        this.till = till;
        this.stock = new HashMap<String, Integer>();
    }

    public int getCars(Car car){
        System.out.println(stock.get(car.getName()));
        return stock.get(car.getName());
    }

    public void sellCar(Car car){
        if (stock.containsKey(car.getName())) {
            this.stock.put(car.getName(), stock.get(car.getName())  - 1);
        }
    }

    @Override
    public void buyCar(Car car) {
        if (till > car.getValue()) {
            this.till -= car.getValue();
            if (stock.containsKey(car.getName())) {
            this.stock.put(car.getName(), stock.get(car.getName()) + 1);
            } else {
                this.stock.put(car.getName(), 1);
            }
        }
    }

    public void repair(int cost, Car car){
        car.setPrice(car.getValue() + cost);
    }


}
