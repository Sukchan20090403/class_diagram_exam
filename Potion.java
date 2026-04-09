public class Potion {
  public String field;

  public String method(String type) {
      return type;
  }

  public String method2(String type) {
      return type;
  }
}

class Weapon {
  public String field;

  public String method(String type) {
      return type;
  }

  public String method2(String type) {
      return type;
  }
}

class Monster {
  public String field;

  public String method(String type) {
      return type;
  }

  public String method2(String type) {
      return type;
  }
}

class potion {
  public Potion myPotion = new Potion();
  public Weapon myWeapon;

  public potion() {
  }

  public void getWeapon(Weapon weapon) {
      this.myWeapon = weapon;
  }

  public void use(Monster monster) {
  }
}