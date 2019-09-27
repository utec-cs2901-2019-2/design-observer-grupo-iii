package utec.cs.cs2901.design;

public class ClimateUI implements Observer{

	public void update(int temperature){
		System.out.println(temperature);
	}
}
