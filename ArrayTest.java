public class ArrayTest {
  public static void main(String[] args){
    int[] anArray = new int[11];
    System.out.print("Part 1: ");
    System.out.print("" + anArray); // Memory address

    System.out.print("\nPart 2: ");
    for (int i=0; i<anArray.length; i++){
      anArray[i] = 100 + (10 * i);
    }
    System.out.print(anArray[0] + " " + anArray[5] + " " + anArray[10]);

    System.out.print("\nPart 3: ");
    for (int i=0; i<anArray.length; i++){
      System.out.print(anArray[i] + " ");
    }

  }
}
