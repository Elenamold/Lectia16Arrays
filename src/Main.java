public class Main {
    public static String[] createArrays(){
        String[] adjectives ; // declares an array of String
        adjectives = new String[7];  // allocates memory for  6 elements
        adjectives[0]="skinny";
        adjectives[1]="fit";
        adjectives[2]="handsome";
        adjectives[3]="bald";
        adjectives[4]="plump";
        adjectives[5]="dazzling";
        adjectives[6]="attractive";
     return  adjectives;
    }
    public static boolean contains(String[] arr, String value) {
        boolean l = false;
        for (String ele:arr ) {
             if (ele.equals(value)) {
                    l = true;
                    System.out.println(ele);
                    break;
            }
        }
        return l;
    }

    public static String[] addAll(String[] arrFrom) {
          int size = arrFrom.length ;
          String[] arrTo;
          arrTo = new String[size];
          for ( int i = 0; i <= arrFrom.length -1 ; i++) arrTo[i] = arrFrom[i];
          return arrTo;
    }
    public static void main(String[] args) {

        String[] arrAdjectives = createArrays();
         contains(arrAdjectives, "handsome");
        String[] arrayCopy;
        arrayCopy = addAll(arrAdjectives );

        // Java SE provides several methods for performing array manipulations
        // (common tasks, such as copying, sorting and searching arrays) in the java.util.Arrays class.
        String[] copyTo = java.util.Arrays.copyOfRange(arrAdjectives, 0, 5);
        for (String adjective : copyTo) {
            System.out.print(adjective + " ");
        }
        System.out.println("!!!!!");
        java.util.Arrays.sort(arrAdjectives,0, arrAdjectives.length);
        System.out.println(arrAdjectives[0]);
        System.out.println(arrAdjectives[1]);
        System.out.println(arrAdjectives[2]);

    }

}