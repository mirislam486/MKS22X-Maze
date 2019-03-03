public class Driver{
  public static void main(String[] args) {
    String filename = "data1.dat";
    try{
      Maze f = new Maze(filename);

      f.setAnimate(true);
      f.solve();
      System.out.println(f);
    }catch(FileNotFoundException e){
      System.out.println("Invalid filename:" + filename);
    }
  }
}
