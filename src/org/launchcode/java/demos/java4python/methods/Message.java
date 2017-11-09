package org.launchcode.java.demos.java4python.methods;

/**
 * Created by LaunchCode
 */
public class Message {

    // translate returns translated message in given language
    public static String translate(String lang) {

        if (lang.equals("sp")) {
            return "Hola Mundo";
        } else if (lang.equals("fr")) {
            return "Bonjour le monde";
        } else if (lang.equals("ger")) {
            return "Hallo Welt";
        } else if (lang.equals("esp")) {
            return "Saluton Mondo";
        } else if (lang.equals("bos")) {
            return "Zdravo Svijet";
        } else if (lang.equals("cz")) {
            return "Ahoj Svete";
        } else {
            return "Hello World";
        }
    }
}
