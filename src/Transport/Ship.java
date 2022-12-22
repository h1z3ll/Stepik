package Transport;

public abstract class Ship {
  String name;
  int speed;
  int maxPassengers;
  int weight;

  public void setName(String name) {
    this.name = name;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setMaxPassengers(int maxPassengers) {
    this.maxPassengers = maxPassengers;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public int getSpeed() {
    return speed;
  }

  public int getMaxPassengers() {
    return maxPassengers;
  }

  public int getWeight() {
    return weight;
  }
}

