public class VehicleRetMethod {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        Vehicle bus = new Vehicle();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        double time = 0.5;
        double distanceCar = car.distance(time);
        double distanceBus = bus.distance(time);

        System.out.print("автомобиль с" + car.passengers + "пассажираси");
        System.out.println("пройдет за полчаса путь" + distanceCar + " км.");
        System.out.print("автомобиль с" + bus.passengers + "пассажираси");
        System.out.println("пройдет за полчаса путь" + distanceBus + " км.");

    }
}
