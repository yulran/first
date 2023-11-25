public class AreAnagrams {
    public static void Anagram(String[]args) {
String str1 = "listen";
        String str2 = "silent";
if (areAnagrams(str1,str2)){  ///?
    System.out.println(str1+"i"+ str2+" ");

    }

    public static boolean areAnagrams(String str1,String str2){
        if (str1.length()!=str2.length()){
            return false;
        }
            char[] chars1=str1.toCharArray();
        char[] chars2=str2.toCharArray();

        Arrays.sort(chars1);//?
        Arrays.sort(chars2);

            return Arrays.equals(chars1,chars2);
        }
        }
    }
}
