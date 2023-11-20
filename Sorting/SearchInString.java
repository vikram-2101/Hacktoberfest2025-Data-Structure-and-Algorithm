import java.util.*;
public class SearchInString {
   public static void main(String[] args) {
    String name = "vikram";
    char target = 'i';
System.out.println(search(name, target));
   }

   static boolean search(String str,char target) {
   if(str.length() == 0) {
    return false;
   }
for(char c : str.toCharArray()) {
if(c == target) {
    return true;
}
}
return false;
}
}
