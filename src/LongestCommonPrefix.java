/**
 * @author Gray
 * @data 2023/3/15 16:38
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        if (strs.length == 0){
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++){
            int j = 0;
            for (; j < ans.length()&&j < strs[i].length();j++){
                if (ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0,j);
            if (ans.equals(""))
                return ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = LongestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(result);
    }

}
