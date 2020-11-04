package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float num = ((getValue() - 32)*5)/9;
        return new Celsius(num);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        String text = "" + getValue() + " F";
        return text;
    }
}