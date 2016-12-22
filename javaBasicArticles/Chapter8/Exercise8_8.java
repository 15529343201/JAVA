package chapter8;

public class Exercise8_8 
{
	public static void main(String[] args)
	{
		Fan fan1 = new Fan();
	    fan1.setSpeed(Fan.FAST);
	    fan1.setRadius(10);
	    fan1.setColor("yellow");
	    fan1.setOn(true);
	    System.out.println(fan1.toString());

	    Fan fan2 = new Fan();
	    fan2.setSpeed(Fan.MEDIUM);
	    fan2.setRadius(5);
	    fan2.setColor("blue");
	    fan2.setOn(false);
	    System.out.println(fan2.toString());
	}
}

class Fan
{
	public static int SLOW = 1;
	public static int MEDIUM = 2;
	public static int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	public int getSpeed() {
		return speed;
	}
	public Fan()
	{
		
	}
	public String toString()
	{
	    return "speed " + speed + "\n"
	      + "color " + color + "\n"
	      + "radius " + radius + "\n"
	      + ((on) ? "fan is on" : " fan is off");
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
/*
运行结果:
speed 3
color yellow
radius 10.0
fan is on
speed 2
color blue
radius 5.0
fan is off
*/