package creational.builder.builders;

import creational.builder.cars.Type;
import creational.builder.cars.components.Engine;
import creational.builder.cars.components.GPSNavigator;
import creational.builder.cars.components.Transmission;
import creational.builder.cars.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
