package creational.builder.cars.components;

import java.util.Objects;

/**
 * Just another feature of a car.
 */
public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GPSNavigator navigator = (GPSNavigator) o;
        return Objects.equals(route, navigator.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(route);
    }

    @Override
    public String toString() {
        return "GPSNavigator{" + "route='" + route + '\'' + '}';
    }
}
