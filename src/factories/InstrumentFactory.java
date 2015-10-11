package factories;

import instruments.BassGuitar;
import instruments.DrumKit;
import instruments.Instrument;
import instruments.Piano;

public class InstrumentFactory
{
	public Instrument getInstrument(String instrumentType)
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

		} else if (instrumentType.equalsIgnoreCase("DRUMKIT"))
		{
			return new DrumKit();
		}

		return null;
	}
}