package creational.builder.cars;

import creational.builder.cars.components.Engine;
import creational.builder.cars.components.GPSNavigator;
import creational.builder.cars.components.Transmission;
import creational.builder.cars.components.TripComputer;

import java.util.Objects;

/**
 * Car is a product class.
 */
public class Car {

    private final Type type;

    private final int seats;

    private final Engine engine;

    private final Transmission transmission;

    private final TripComputer tripComputer;

    private final GPSNavigator gpsNavigator;

    private double fuel = 0;

    public Car(Type type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
               GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return seats == car.seats &&
               Double.compare(car.fuel, fuel) == 0 &&
               type == car.type &&
               Objects.equals(engine, car.engine) &&
               Objects.equals(transmission, car.transmission) &&
               Objects.equals(tripComputer, car.tripComputer) &&
               Objects.equals(gpsNavigator, car.gpsNavigator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, seats, engine, transmission, tripComputer, gpsNavigator, fuel);
    }

    @Override
    public String toString() {
        return "Car{" + "type=" + type + ", seats=" + seats + ", engine=" + engine + ", transmission=" + transmission
               + ", tripComputer=" + tripComputer + ", gpsNavigator=" + gpsNavigator + ", fuel=" + fuel + '}';
    }
}
