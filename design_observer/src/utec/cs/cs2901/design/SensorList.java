package utec.cs.cs2901.design;

import java.util.*;

public class SensorList {
  private int temperature;

  private List<Observer> sensors = new ArrayList<>();

  public void addSensor(Observer observer) {
    sensors.add(observer);
  }

  public void removeSensor(Observer observer) {
    sensors.remove(observer);
  }

  public void setTemperature(int temp) {
    temperature = temp;
    for (Observer observer : this.sensors) {
      observer.update(temperature);
    }
  }
}
