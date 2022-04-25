package main.player;
import main.item.Item;
import main.player.discipline.Discipline;

public class Player {
  private String name;
  private int health;
  private Discipline discipline;
  private Item[] bag;
  private int xp;
  private int xpThresh;   //Threshold for leveling up
  private int Str;    //Strength of the character
  private int Dex;    //Dexterity of the character
  private int Int;    //Intelligence of the Player


  public Player(String name, Discipline discipline){
    this.name = name;
    this.xp = 0;
    this.bag = new Item[4];

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

  //DAMAGE:

  public int attack(){
    return Str;
  }

  public int specialAttack(){
    return discipline.getSpecial();
  }

  public void takeDamage(int damage){
    health -= damage;
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
    //need to add leveling up feature
  }
  
  //BAG/ITEMS:

  public Item getItem(int location){
    //adjust later so i can get item based on item name
    if(location < bag.length){
      Item item = bag[location];
      bag[location] = null;
      return item;
    }

    else{
      return null;    //item location outside of bag size
    }
  }

  public boolean addItem(Item item) {
    for(int i = 0; i < bag.length; i++){
      if(bag[i] == null){
        bag[i] = item;
        return true;
      }
    }
    return false;
  }

}
