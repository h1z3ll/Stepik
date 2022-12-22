package Transport.NuclearFuel;

import Transport.Ship;

public class NavyShip extends Ship {
  int maxPlanes;
  int fights;

  public int getMaxPlanes() {
    return maxPlanes;
  }

  public void setMaxPlanes(int maxPlanes) {
    this.maxPlanes = maxPlanes;
  }

  public int getFights() {
    return fights;
  }

  public void setFights(int fights) {
    this.fights = fights;
  }
}
