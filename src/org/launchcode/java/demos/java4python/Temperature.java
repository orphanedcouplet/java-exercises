package org.launchcode.java.demos.java4python;

/**
 * Created by LaunchCode
 */
public class Temperature {

    private double fahrenheit;
    public static final double ABSOLUTE_ZERO_FAHRENHEIT = -459.67;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        // Validate that temp isn't lower than the coldest possible temp ("absolute zero")
        if (aFahrenheit < ABSOLUTE_ZERO_FAHRENHEIT) {
            throw new IllegalArgumentException("Value is below absolute zero");
        }

        this.fahrenheit = aFahrenheit;
    }

    public double getCelsius() {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public void setCelsius(double celsius) {
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        setFahrenheit(fahrenheit);
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();
    }

}
