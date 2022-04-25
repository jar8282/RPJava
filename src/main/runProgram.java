package main;
import main.player.Player;
import main.room.Room;

/**
 * runProgram
 */
public class runProgram {
  private static Player player;
  private static int roomNum;
  private static int level;

  private static Player initPlayer(){
    return new Player(null, null);
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
    player = initPlayer();

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