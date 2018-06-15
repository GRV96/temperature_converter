package converters;

/**
 * Provides a method to convert degrees Celsius to degrees Fahrenheit.
 * @author GRV96
 *
 */
public class CFConverter implements TemperatureConverter {

	@Override
	public double convert(double inputTemp) {
		
		return 9 * inputTemp / 5 + 32;
	}
}
