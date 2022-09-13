public class Car implements IDamage {
    private String color;
    private CarTypes carType;
    private int price;

    public Car(String color, CarTypes carType, int price) {
        this.color = color;
        this.carType = carType;
        this.price = price;
    }

    public String getName(){
        return carType.getMotor();
    }

    public int getValue(){
        return this.price;
    }

    public void addDamage(int damage) {
        this.price -= damage;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
