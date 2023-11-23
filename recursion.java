public class recursion {
  public static void main(String[] args) {
    
    //call your recursion fuction
    //print result
    String str = "Hello, World!";
    String reversed = reverseStr(str);
    System.out.println(reversed);

   }
    
    public static String reverseStr(String str) {
    if (str.isEmpty()) {
      return str;
    } else {
      return reverseString(str.substring(1)) + str.charAt(0);
    }
  }
}

    
