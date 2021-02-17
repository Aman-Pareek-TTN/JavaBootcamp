import java.io.*; 
import java.util.*; 
  


class StringUniqueChars { 

    public static Character[] findUniqueChars(String str){

        Set<Character> set=new HashSet<>();

        for(int i=0;i<str.length();i++)
        {
            set.add(charAt(i));
        }

        return (Character)set.toArray();

    }

    public static void main(String[] args) 
    { 

        String str="AmanPareek";

        char arr[]=(char)findUniqueChars(str);

        for(char ch:arr)
        {
            System.out.println(ch);
        }
    } 
}