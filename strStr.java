public class strStr {
    public int str(String haystack, String needle) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                count++;
                j++;
                System.out.println("match " + count + j);
                if (count == needle.length()) {
                    return i - needle.length() + 1;
                }
            } else {
                j = 0;
                count = 0;
                System.out.println("remove" + count + j);
                if (haystack.charAt(i) == needle.charAt(0)) {
                    count = 1;
                    j = 1;
                }
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        strStr s = new strStr();
        String s1 = "sadbutsad";
        String s2 = "sad";

        int res = s.str(s1, s2);
        System.out.println(res);
    }
}
