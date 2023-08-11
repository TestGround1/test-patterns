public class Sqaure_Pattern {

  public static void main(String[] args) {
    /*
         + + + + +
         + + + + +
         + + + + +
         + + + + +
         + + + + +

    */

    /*method-1 */

    int y = 0;
    while (y < 5) {
      int x = 0;
      while (x < 5) {
        System.out.print("+ ");
        x++;
      }
      System.out.println();
      y++;
    }
    /*method-2 */

    // int a = 0;
    // while(a<5){
    //     System.out.print("+ ".repeat(5));
    //     System.out.println();
    //     a++;
    // }

    /*method-3 */

    // int k = 0;
    // while(k++ <25){
    //     System.out.print("+ ");
    //     if(k%5 == 0)System.out.println();
    // }
  }
}
