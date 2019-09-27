package utec.cs.cs2901.design;

public class Main {
  public static void main(String[] args) {
    SensorList sensors = new SensorList();
    ClimateUI sensor = new ClimateUI();
    ClimateUI sensor2 = new ClimateUI();
    ClimateUI sensor3 = new ClimateUI();

    sensors.addSensor(sensor);
    sensors.addSensor(sensor2);
    sensors.addSensor(sensor3);

    sensors.start();
  }
}
