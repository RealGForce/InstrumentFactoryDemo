package factories;

import instruments.BassGuitar;
import instruments.Harmonica;
import instruments.Instrument;
import instruments.Piano;

public class InstrumentFactory
{
	public Instrument createInstrument(String instrumentType)
	{
		if (instrumentType == null)
		{
			return null;
		}
		if (instrumentType.equalsIgnoreCase("PIANO"))
		{
			return new Piano();

		} else if (instrumentType.equalsIgnoreCase("BASSGUITAR"))
		{
			return new BassGuitar();

		} else if (instrumentType.equalsIgnoreCase("HARMONICA"))
		{
			return new Harmonica();
		}

		return null;
	}
}