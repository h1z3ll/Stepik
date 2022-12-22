package Transport;

public abstract class Buses {
  String number;
  int speed;
  int maxPassengers;
  int weight;

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setMaxPassengers(int maxPassengers) {
    this.maxPassengers = maxPassengers;
  }

  public String getNumber() {
    return number;
  }

  public int getSpeed() {
    return speed;
  }

  public int getMaxPassengers() {
    return maxPassengers;
  }
}
