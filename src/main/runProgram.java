package main;
import java.util.Scanner;

import main.player.player;
import main.player.discipline.*;
import main.room.Room;

/**
 * runProgram
 */
public class runProgram {
  private static player player;
  private static int roomNum;
  private static int level;

  private static void initPlayer(){
    String name;
    discipline discipline;
    //get info from user
    System.out.println("---Welcome to RPJAVA---\n");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Brave new hero - what is your name?");
    name = scanner.next();
    System.out.println(name + ", what is your discipline?\n(type 'w' for warrior, 'm' for mage)");
    String disc = scanner.next();
    disc.toLowerCase();

    if(disc.equals("w")){
      discipline = new warrior();
    }
    else {
      discipline = new mage();
    }

    System.out.println(name + " the " + discipline.getName() + " - it is time to start your adventure. . . ");
    
    player = new player(name, discipline);
  
    return;
  }

  
  private static Room generateRoom(int level){
    return null;

  }

  private static Room generateBossRoom(int level){
    return null;
    
  }

  private static boolean runGame(Room room){
    return true;

  }

  public static void main(String[] args) {
    
    boolean continueGame = true;
    roomNum = 0;
    level = 0;
    initPlayer();

    while(continueGame){
      if(roomNum < 10){
        Room room = generateRoom(level);
        continueGame = runGame(room);
        roomNum++;
      }
      else{
        Room bossRoom = generateBossRoom(level);
        continueGame = runGame(bossRoom);
        level++;
        roomNum = 0;
      }
    } 
  }
}