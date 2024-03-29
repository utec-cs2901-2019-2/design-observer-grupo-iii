package utec.cs.cs2901.design;

import java.util.*;

public class SensorList {
  private int temperature;

  private List<Observer> sensors = new ArrayList<>();

  public void start() {
    while (true) {
      int r = (int) ((Math.random() * ((50 - 1) + 1)) + 1);
      setTemperature(r);
      try {
        Thread.sleep(3 * 1000);
      } catch (Exception e) {
        Thread.currentThread().interrupt();
      }
    }
  }

  public void addSensor(Observer observer) {
    sensors.add(observer);
  }

  public void removeSensor(Observer observer) {
    sensors.remove(observer);
  }

  private void setTemperature(int temp) {
    temperature = temp;
    for (Observer observer : this.sensors) {
      observer.update(temperature);
    }
  }
}
