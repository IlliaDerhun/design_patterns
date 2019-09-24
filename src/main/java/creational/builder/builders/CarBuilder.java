package creational.builder.builders;

import creational.builder.cars.Car;
import creational.builder.cars.Type;
import creational.builder.cars.components.Engine;
import creational.builder.cars.components.GPSNavigator;
import creational.builder.cars.components.Transmission;
import creational.builder.cars.components.TripComputer;

import java.util.Objects;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {

    private Type type;

    private int seats;

    private Engine engine;

    private Transmission transmission;

    private TripComputer tripComputer;

    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public void setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarBuilder builder = (CarBuilder) o;
        return seats == builder.seats &&
                type == builder.type &&
                Objects.equals(engine, builder.engine) &&
                Objects.equals(transmission, builder.transmission) &&
                Objects.equals(tripComputer, builder.tripComputer) &&
                Objects.equals(gpsNavigator, builder.gpsNavigator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

    @Override
    public String toString() {
        return "CarBuilder{" + "type=" + type + ", seats=" + seats + ", engine=" + engine + ", transmission="
               + transmission + ", tripComputer=" + tripComputer + ", gpsNavigator=" + gpsNavigator + '}';
    }
}
