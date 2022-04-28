package main.player.discipline;

public abstract class Discipline {

  private int baseStr;
  private int baseDex;
  private int baseInt;

  public abstract int getSpecial();

  public int getStr() {
    return this.baseStr;
  }

  public int getDex() {
    return this.baseDex;
  }

  public int getInt() {
    return this.baseInt;
  }
  
}
