package week1;

public class car {
	public void applyBreak()
	{
	System.out.println("apply break");
	}
	public void applyGear()
	{
	System.out.println("apply gear");
	}
	public void switchOnAc()
	{
	System.out.println("switch on AC");
	}
	public void applyAcclerate()
	{
	System.out.println("apply Acclerate");
	}
public static void main(String[] args) 
{
	car action=new car();
	action.applyBreak();
     action.applyGear();
	action.switchOnAc();
	action.applyAcclerate();


	}

}
