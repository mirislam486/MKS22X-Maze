import java.util.*;
import java.io.*;
public class Maze{

  private char[][] maze;
  private boolean animate;

  public Maze(String Filename) throws FileNotFoundException{
    animate = false;
    File text = new File(Filename);

  }

  private void wait(int millis){
    try{
      Thread.sleep(millis);
    }
    catch (InterruptedException e){

    }
  }

  public void setAnimate(boolean b){
    animate = b;
  }

  public void clearTerminal(){
    System.out.println("\033[2J\033[1;1H");
  }

  public String toString(){
    return "";
  }

  public int solve(){
    return 0;
  }

  private int solve(int row, int col){
    if(animate){
      clearTerminal();
      System.out.println(this);
      wait(20);
    }
    return -1;
  }





}
