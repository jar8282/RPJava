package main.player.discipline;

public class mage extends discipline {
  //class initial modifiers
  private int Str = 0;
  private int Dex = 1;
  private int Int = 2;
  
  @Override
  public String getFlavorText() {
    return "You use firebolt!";
  }

  @Override
  public int getSpecial() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String getSpecialFlavorText() {
    return "Special Attack!!";
  }

  @Override
  public int getStr() {
    return this.Str;
  }

  @Override
  public int getDex() {
    return this.Dex;
  }

  @Override
  public int getInt() {
    return this.Int;
  }

  @Override
  public String getName() {
    return "mage";
  }
  
}
