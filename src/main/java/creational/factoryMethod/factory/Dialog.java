package creational.factoryMethod.factory;

import creational.factoryMethod.buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.onClick();
    }

    public abstract Button createButton();
}
