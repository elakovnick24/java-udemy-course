package nested_classes.inner_class;

public class Car1 {
    String color;
    int doorCount;
    Engine engine;

    public Car1(String color, int doorCount) {
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
      Car1 car = new Car1("black", 4);
      Car1.Engine engine = car.new Engine(150);
      car.setEngine(engine);
      System.out.println(engine);
      System.out.println(car);

      Car1.Engine engine2 = new Car1("yellow", 4).new Engine(250);
      System.out.println(engine2);
    }
}
