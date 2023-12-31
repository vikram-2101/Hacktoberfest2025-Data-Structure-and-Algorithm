sdimport java.util.*;
import java.util.ArrayList;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "vikram";
        char target = 'a';
        System.out.println(search(name, target));
    }
    static boolean search(String name, char target) {
        if (name.length() ==0) {           // name ki jagah koi bhi variable le sakte hai jaise str
        return  false;
        }
     for(int i = 0; i < name.length(); i++) {
        if(target==name.charAt(i)) {
            return true;
        }
       }
      
           // OR

      for(char ch:name.toCharArray()) {
      if (ch==target) {
        return true;
      }
      }
    return false;

    // Search in Ranges 

    }

}
