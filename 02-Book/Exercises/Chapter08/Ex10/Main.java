// ***********************************************
// File name: Main.java
// Subject  : Test the TrafficLight enum.
// Date     : Feb 19, 2025
// Author   : Alsayed A. Khaleel
// ***********************************************

public class Main // class declaration.
{
	public static void main(String[] args)
	{
		// print the light and its duration.
		for(TrafficLight trafficLight : TrafficLight.values())
			System.out.printf("The %-6s traffic light's time is: %-6.2f seconds.%n",
					          trafficLight,trafficLight.getDuration());
	}
}

