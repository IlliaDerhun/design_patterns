package creational.abstractFactory;

import creational.abstractFactory.app.Application;
import creational.abstractFactory.factories.MacOSFactory;
import creational.abstractFactory.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication(String os) {
        if ("windows".equalsIgnoreCase(os)) {
            return new Application(new WindowsFactory());
        } else {
            return new Application(new MacOSFactory());
        }
    }

    public static void main(String[] args) {
        Application appConfigurations = configureApplication("windows");
        appConfigurations.paint();
    }
}
