package creational.factoryMethod;

import creational.factoryMethod.factory.Dialog;
import creational.factoryMethod.factory.HtmlDialog;
import creational.factoryMethod.factory.WindowsDialog;

/**
 * Client code.
 * Demo class. Everything comes together here.
 */
public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        dialog = createDialog("html");

        dialog.renderWindow();
    }

    private static Dialog createDialog(String buttonType) {
        if ("html".equalsIgnoreCase(buttonType)) {
            return new HtmlDialog();
        } else {
            return new WindowsDialog();
        }
    }
}
