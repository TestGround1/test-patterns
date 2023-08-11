public class Second_Pattern {

  public static void main(String[] args) {
    /*

        + + + + +
        + + + +
        + + +
        + + 
        +


         */
    int y = 5;

    while (y > 0) {
      int x = 0;
      while (x++ < y) {
        System.out.print("+ ");
      }
      y--;
      System.out.println();
    }
    /*method-2 */

    // int k = 0;
    // while (k++ < 15) {
    //   System.out.print("+ ");
    //   switch (k) {
    //     case 5:
    //       System.out.println();
    //       break;
    //     case 9:
    //       System.out.println();
    //       break;
    //     case 12:
    //       System.out.println();
    //       break;
    //     case 14:
    //       System.out.println();
    //       break;
    //   }
    // }
    // System.out.println();
  }
}
