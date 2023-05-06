public class BottleSong {
  public static void main(String[] args) {
    int x = 10;
    String verse = " green bottles hanging on the wall,";

    while(x > 1) {
      System.out.println(x + verse);
      System.out.println(x + verse);
      System.out.println("And if one green bottle should accidentally fall,");
      x = x- 1;
      System.out.print("There will be ");
      System.out.println(x + " green bottles hanging on the wall." );
      System.out.println(" ");
    }

    if (x ==1){
      System.out.println(x + verse);
      System.out.println(x + verse);
      System.out.println("And if this green bottle should accidentally fall,");
      System.out.println("There will be no green bottles hanging on the wall.");
    }
  }
}
