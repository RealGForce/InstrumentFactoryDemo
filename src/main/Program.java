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
		
		instruments.add(factory.createInstrument("Piano"));
		instruments.add(factory.createInstrument("BassGuitar"));
		instruments.add(factory.createInstrument("DrumKit"));
		
		for (Instrument instrument : instruments)
		{
			instrument.play();
		}
	}
}