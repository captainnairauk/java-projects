public class BottleSong {
  public static void main(String args[]) {
    int bottlesNum = 10;
    String verse = " green bottles hanging on the wall,";

    while (bottlesNum > 1) {
      System.out.println(bottlesNum + verse);
      System.out.println(bottlesNum + verse);
      System.out.println("And if one green bottle should accidentally fall,");
      bottlesNum = bottlesNum - 1;
      System.out.print("There will be ");
      System.out.println(bottlesNum + " green bottles hanging on the wall.");
      System.out.println(" ");
    }

    if (bottlesNum == 1) {
      System.out.println(bottlesNum + verse);
      System.out.println(bottlesNum + verse);
      System.out.println("And if this green bottle should accidentally fall,");
      System.out.println("There will be no green bottles hanging on the wall.");
    }
  }
}
