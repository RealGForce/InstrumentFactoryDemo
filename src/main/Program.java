package main;

import java.util.ArrayList;
import java.util.List;

import factories.InstrumentFactory;
import instruments.Instrument;

public class Program
{
	public static void main(String[] args)
	{
		InstrumentFactory factory = new InstrumentFactory();
		List<Instrument> instruments = new ArrayList<Instrument>();
		
		instruments.add(factory.getInstrument("Piano"));
		instruments.add(factory.getInstrument("BassGuitar"));
		instruments.add(factory.getInstrument("DrumKit"));
		
		for (Instrument instrument : instruments)
		{
			instrument.play();
		}
	}
}