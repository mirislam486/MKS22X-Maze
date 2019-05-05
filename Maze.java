import java.util.*;
import java.io.*;
public class Maze{

    private char[][] maze;
    private boolean animate;
    private int[][] move = {{0, 0},{0, 1}, {0, 1}, {1, 1}};

      public Maze(String Filename) throws FileNotFoundException{
        animate = false;
           try {

             ArrayList<String> temp = new ArrayList<String>();
             File f = new File(Filename);
     	       Scanner scan = new Scanner(f);

              while (scan.hasNextLine()) {
     		       temp.add(scan.nextLine());
              }
              mazeArray(temp);

	            } catch(FileNotFoundException e) {
		              System.out.println("Could not find :" + Filename);
		                System.exit(0);
                  }

      }



      private void mazeArray(ArrayList<String> arr){
          maze = new char[arr.size()][(arr.get(0)).length()];

          for( int i = 0; i < arr.size(); i++){
            for( int z = 0; z < (arr.get(i)).length(); z++)
              maze[i][z] = (arr.get(i)).charAt(z);
          }
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



      public int solve(int x, int y){
        if(maze[x][y] == 'E'){
          return 1;
        }else{
          if(placer(x, y)){
            for(int i = 0; i < move.length; i++){
              solve(x + move[i][0], y + move[i][0]);
            }
            move[x][y] = '.';
          }
          return -1;
        }
      }

      public boolean placer(int x, int y){
        if(maze[x][y] == '@' || maze[x][y] == '#' || maze[x][y] == '.'){
          return false;
        }else{
          maze[x][y] = '@';
          return true;
        }
      }



    //  private int solve(int row, int col){
    //    if(animate){
    //      clearTerminal();
    //      System.out.println(this);
    //      wait(20);
    //    }
    //    return -1;
    //  }





}
