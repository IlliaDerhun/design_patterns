package creational.builder.cars.components;

import java.util.Objects;

/**
 * Just another feature of a car.
 */
public class Engine {

    private final double volume;

    private double mileage;

    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Engine engine = (Engine) o;
        return Double.compare(engine.volume, volume) == 0 &&
               Double.compare(engine.mileage, mileage) == 0 &&
               started == engine.started;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, mileage, started);
    }

    @Override
    public String toString() {
        return "Engine{" + "volume=" + volume + ", mileage=" + mileage + ", started=" + started + '}';
    }
}
