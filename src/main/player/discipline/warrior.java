package main.player.discipline;

public class warrior extends discipline{
  //class initial modifiers
  private int Str = 2;
  private int Dex = 1;
  private int Int = 0;

  @Override
  public int getSpecial() {
    // TODO Auto-generated method stub
    return 0;
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
    return "warrior";
  }
  
}
