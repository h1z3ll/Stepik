package Transport;

public abstract class Airplane {
  String name;
  String company;
  int maxHeight;
  int maxPassengers;
  int whenWasBuilt;
  int fuelPerHour;

  public void setName(String name) {
    this.name = name;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public void setMaxHeight(int maxHeight) {
    this.maxHeight = maxHeight;
  }

  public void setMaxPassengers(int maxPassengers) {
    this.maxPassengers = maxPassengers;
  }

  public void setWhenWasBuilt(int whenWasBuilt) {
    this.whenWasBuilt = whenWasBuilt;
  }

  public void setFuelPerHour(int fuelPerHour) {
    this.fuelPerHour = fuelPerHour;
  }

  public String getName() {
    return name;
  }

  public String getCompany() {
    return company;
  }

  public int getMaxHeight() {
    return maxHeight;
  }

  public int getMaxPassengers() {
    return maxPassengers;
  }

  public int getWhenWasBuilt() {
    return whenWasBuilt;
  }

  public int getFuelPerHour() {
    return fuelPerHour;
  }
}
