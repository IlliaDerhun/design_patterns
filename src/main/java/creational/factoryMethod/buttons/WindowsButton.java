package creational.factoryMethod.buttons;

/**
 * Windows button implementation
 */
public class WindowsButton implements Button {
    public void render() {
        System.out.println("Render Windows button");
    }

    public void onClick() {
        System.out.println("You clicked on Windows Button");
    }
}
