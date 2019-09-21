package creational.builder.cars;

import creational.builder.cars.components.Engine;
import creational.builder.cars.components.GPSNavigator;
import creational.builder.cars.components.Transmission;
import creational.builder.cars.components.TripComputer;

import java.util.Objects;

/**
 * Car manual is another product. Note that it does not have the same ancestor as a Car. They are not related.
 */
public class Manual {

    private final Type type;

    private final int seats;

    private final Engine engine;

    private final Transmission transmission;

    private final TripComputer tripComputer;

    private final GPSNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
                  GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Manual manual = (Manual) o;
        return seats == manual.seats &&
               type == manual.type &&
               Objects.equals(engine, manual.engine) &&
               Objects.equals(transmission, manual.transmission) &&
               Objects.equals(tripComputer, manual.tripComputer) &&
               Objects.equals(gpsNavigator, manual.gpsNavigator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

    @Override
    public String toString() {
        return "Manual{" + "type=" + type + ", seats=" + seats + ", engine=" + engine + ", transmission=" + transmission
               + ", tripComputer=" + tripComputer + ", gpsNavigator=" + gpsNavigator + '}';
    }
}
