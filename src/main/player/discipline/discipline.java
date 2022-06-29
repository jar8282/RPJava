package main.player.discipline;

public abstract class discipline {

  //Class regular attack flavor text
  public abstract String getFlavorText();

  //Class special attack
  public abstract int getSpecial();

  //Class special attack flavor text
  public abstract String getSpecialFlavorText();


  //init for player base stats//

  public abstract int getStr();

  public abstract int getDex();

  public abstract int getInt();


  public abstract String getName();
  
}
