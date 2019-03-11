import java.io.*;
public class Driver{
  public static void main(String[] args) throws FileNotFoundException{
      Maze f = new Maze("data1.dat");
      f.setAnimate(true);
      f.solve();
      System.out.println(f);
    //}catch(FileNotFoundException e){
    //  System.out.println("Invalid filename:" + filename);
    }
}
