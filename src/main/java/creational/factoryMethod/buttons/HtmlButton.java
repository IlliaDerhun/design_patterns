package creational.factoryMethod.buttons;

/**
 * HTML button implementation
 */
public class HtmlButton implements Button {
    public void render() {
        System.out.println("Render HTML button");
    }

    public void onClick() {
        System.out.print("You clicked on HTML button");
    }
}
