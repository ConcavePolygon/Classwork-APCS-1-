
// CW For October 5
// Goal: Write two array functions.

public class October5 {

  public static int[] returnCopy(int[] ary){
    int[] holder = new int[ary.length];
    for (int i=0; i<ary.length; i++){
      holder[i] = ary[i];
    }

    return holder;
  }

  public static int[] concatArray(int[] ary1, int[] ary2){
    int[] arr = new int[ary1.length + ary2.length];
    for (int i=0; i<ary1.length; i++){
      arr[i] = ary1[i];
    }

    for (int i=0; i<ary2.length; i++){
      arr[ary1.length + i] = ary2[i];
    }

    return arr;
  }

  public static void main(String[] args){
    int[] a = {1,2,3,4,5};
    int[] b = {6, 7, 8, 9, 10};

    // Test returnCopy
    int[] aCopy = returnCopy(a);
    System.out.println("Testing returnCopy: (There should be no error text)");
    for (int i=0; i<a.length; i++){
      if (a[i] != aCopy[i]) System.out.println("ERROR: Values don't match");
    }

    // Test concatArray
    // printing out contents of c should be: 1 2 3 4 5 6 7 8 9 10
    System.out.println("Testing concatArray: ");
    int[] c = concatArray(a, b);
    for (int i=0; i<c.length; i++){
      System.out.print(c[i] + " ");
    }

  }
}
