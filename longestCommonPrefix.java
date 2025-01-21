public class longestCommonPrefix {
    public String lcp(String[] s) {
        String res = "";
        String word = s[0];
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            for (int j = 1; j < s.length; j++) {
                if (s[j].charAt(i) != ch || i >= s[j].length()) {
                    return res;
                }
            }
            res += ch;
        }
        return res;
    }

    public static void main(String args[]) {
        String[] str = { "flower", "flow", "flight" };
        longestCommonPrefix l = new longestCommonPrefix();
        String res = l.lcp(str);
        System.out.println(res);
    }
}
