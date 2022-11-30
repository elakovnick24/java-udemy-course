package nested_classes.inner_class;

import nested_classes.static_nested_class.Car;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        //this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car [color=" + color + ", doorCount=" + doorCount + ", engine=" + engine + "]";
    }

    public class Engine {
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
      Car car = new Car("black", 4);
      Car.Engine engine = car.new Engine(150);
      car.setEngine(engine);
      System.out.println(engine);
      System.out.println(car);

      Car.Engine engine2 = new Car("yellow", 4).new Engine(250);
      System.out.println(engine2);
    }
}
