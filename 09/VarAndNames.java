public class VarAndNames {
    public static void main(String[] args) {
		//creates variable capable of holding negative or positive numbers excluding decimals called cars, drivers, passengers, carsNotDriven, carsDriven
        int cars, drivers, passengers, carsNotDriven, carsDriven;
		//creates variable capable of holding negative or positive numbers inluding decimals called spaceInCar, carpoolCapacity, averagePassengersPerCar
        double spaceInCar, carpoolCapacity, averagePassengersPerCar;
		//gives the cars variable a value of 100
        cars = 100;
		//gives the spaceInCar variable a value of 4.0
        spaceInCar = 4;
		//gives the drivers variable a value of 30
        drivers = 30;
		//gives the passengers variable a value of 90
        passengers = 90;
		//sets the value of carsNotDriven to the number of cars subtracted by the number of drivers
        carsNotDriven = cars - drivers;
		//sets the value of carsDriven to the number drivers
        carsDriven = drivers;
		//sets the value of carpoolCapacity to the amount of carsDriven multiplied by the spaceInCar
        carpoolCapacity = carsDriven * spaceInCar;
		//sets the averagePassengersPerCar to passengers divided by the amount of carsDriven
        averagePassengersPerCar = passengers / carsDriven;


        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
    }
}
//1. there is no difference between using 4.0 and 4
/