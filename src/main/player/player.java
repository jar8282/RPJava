package main.player;
import main.item.item;
import main.player.discipline.discipline;

public class player {
  private String name;
  private int health;
  private discipline discipline;
  private item[] bag;
  private int gold;
  private int xp;
  private int xpThresh;   //Threshold for leveling up
  private int Str;    //Strength of the character
  private int Dex;    //Dexterity of the character
  private int Int;    //Intelligence of the character
  private int sp;   //number of special points
  private int spMax;    //special point max

  public player(String name, discipline discipline){
    this.name = name;
    this.xp = 0;
    this.xpThresh = 100;
    this.gold = 0;
    this.bag = new item[4];
    this.discipline = discipline;
    this.spMax = 10;
    this.sp = spMax;

    //discipline setters:
    this.Str = discipline.getStr();
    this.Dex = discipline.getDex();
    this.Int = discipline.getInt();

  }

  //GETTERS:

  public String getName(){
    return this.name;
  }

  public int getStr(){
    return this.Str;
  }

  public int getDex(){
    return this.Dex;
  }

  public int getInt(){
    return this.Int;
  }

  public int getSP(){
    return this.sp;
  }

  //DAMAGE:

  public int attack(){
    return this.Str;
  }

  public String getFlavor(){
    return this.discipline.getFlavorText();
  }

  public int specialAttack(){
    if(this.sp >= 1){
      sp--;
      return this.discipline.getSpecial();
    }
    //not enough SP (sp)
    //return error message/mvp thing from class??
    return 0;
  }

  public String getSpecialFlavor(){
    return this.discipline.getSpecialFlavorText();
  }

  public void regenSP(int sp){
    this.sp += sp;
    if(this.sp > this.spMax){
      this.sp = this.spMax;
    }
  }

  public void heal(int hp){
    this.health += hp;
  }

  public void takeDamage(int damage){
    this.health -= damage;
  }

  public boolean isDead(){
    return this.health <= 0;
  }

  //EXPERIENCE:

  public void addXP(int points){
    this.xp += points;
    if(this.xp >= this.xpThresh){
      this.levelUp();
    }
  }

  private void levelUp(){
    this.xpThresh *= 2;
    this.xp = 0;

    this.spMax += 2;
    //need to add leveling up feature
  }
  
  //BAG/ITEMS:

  public item getItem(int location){
    //adjust later so i can get item based on item name
    if(location < bag.length){
      item item = bag[location];
      bag[location] = null;
      return item;
    }

    else{
      return null;    //item location outside of bag size
    }
  }

  public boolean addItem(item item) {
    for(int i = 0; i < bag.length; i++){
      if(bag[i] == null){
        bag[i] = item;
        return true;
      }
    }
    return false;
  }

  public void addGold(int amount){
    this.gold += amount;
  }

  public boolean spendGold(int amount){
    if(amount > this.gold){
      return false;
    }
    else{
      this.gold -= amount;
      return true;
    }
    
  }
  
}
