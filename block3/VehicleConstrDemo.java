 class VehicleConstrDemo {
     public static void main(String[] args) {

         Vehicle car = new Vehicle(2, 4, 130, 30);
         Vehicle bus = new Vehicle(45, 4, 120, 25);

         double interval = 1;
         double distanceCar = car.distance(interval);
         double distanceBus = bus.distance(interval);

         System.out.println("Автомобиль с" + car.passengers + " пассажирами " + "пройдет за 1 час" + distanceCar + " ки.");
         System.out.println("Автобус с" + bus.passengers + " пассажирами " + "пройдет за 1 час" + distanceBus + " ки.");
     }
 }
