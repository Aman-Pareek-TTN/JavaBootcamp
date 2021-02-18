import java.io.*; 
import java.util.*; 
  


class StringUniqueChars { 

    public static Character[] findUniqueChars(String str){

        Map<Character,Integer> map=new HashMap<>();
        int count=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                int val=map.get(ch);
                val++;
                map.put(ch,val); 
            }
            else
            {
                map.put(ch,1);
            }
        }

        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i))==1)
            {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) 
    { 

        String str="amanpareek";

        int count=findUniqueChars(str);

        System.out.print("Count of unique chars= " + count);
    } 
}
