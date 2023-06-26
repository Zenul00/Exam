/* */
package PPT.exam;

public class Q2_firstUniqueCharacterString {

    static int firstUniqueCharacter(String s){

        int [] frequency = new int[26];
        char [] chars = s.toCharArray();

        for(char c : chars){
            frequency[c-'a']++ ;
        }

        for(int i = 0; i < chars.length; i++){
            if(frequency[chars[i] - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String s = "aabb";
        System.out.println(firstUniqueCharacter(s));
        
    }
}
