package convcreators;

import converters.FCConverter;
import converters.FKConverter;
import converters.NonConverter;
import converters.TemperatureConverter;

/**
 * This class can instantiate converters that
 * convert temperatures from degrees Fahrenheit.
 * @author GRV96
 *
 */
public class ConvFromFCreator extends ConverterCreator {

	/**
	 * Creates a converter from Fahrenheit to Celsius.
	 * @return an instance of FCConverter
	 */
	@Override
	protected TemperatureConverter createConvToCelsisus() {
		
		return new FCConverter();
	}

	/**
	 * Creates a converter that does not perform a conversion.
	 * @return an instance of NonConverter
	 */
	@Override
	protected TemperatureConverter createConvToFahrenheit() {
		
		return new NonConverter();
	}

	/**
	 * Creates a converter from Fahrenheit to kelvins.
	 * @return an instance of FKConverter
	 */
	@Override
	protected TemperatureConverter createConvToKelvins() {
		
		return new FKConverter();
	}
}
