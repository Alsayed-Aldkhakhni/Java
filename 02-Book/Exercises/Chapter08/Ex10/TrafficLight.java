// **************************************************
// File name: questions.txt
// Subject  : An Enumeration mimic the Traffic light.
// Date     : Feb 19, 2025
// Author   : Alsayed A. Khaleel
// **************************************************

public enum TrafficLight                 // enum declaration.
{
	RED(120), GREEN(300), YELLOW(15);	 // the labels of the enum.
	
	private double duration;             // waiting for the next light in second.
	
	private TrafficLight(double duration)// the constructor to allow passing the duration.
	{	
		this.duration = duration;        // assign the value.
	}
	
	public double getDuration()          // accessor of duration variable.	
	{
		return duration;
	}
}

