package nested_classes.static_nested_class;

import java.security.spec.ECPoint;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car [color=" + color + ", doorCount=" + doorCount + ", engine=" + engine + "]";
    }

    public static class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine [horsePower=" + horsePower + "]";
        }

        
    }
    
}

class Test {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        System.out.println(e);
        Car car = new Car("red", 2, e);
        System.out.println(car);
    }
}
