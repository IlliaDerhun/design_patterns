package creational.abstractFactory.app;

import creational.abstractFactory.buttons.Button;
import creational.abstractFactory.checkboxes.CheckBox;
import creational.abstractFactory.factories.GUIFacotry;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

    private final Button button;

    private final CheckBox checkBox;

    public Application(GUIFacotry guiFacotry) {
        this.button = guiFacotry.createButton();
        this.checkBox = guiFacotry.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
