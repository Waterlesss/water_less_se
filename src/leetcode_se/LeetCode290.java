package leetcode_se;

public class LeetCode290 {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            char[] data1 = pattern.toCharArray();
            String[] str = s.split(" ");
            if (data1.length == 1 && str.length == 1) {
                return true;
            }
            if (data1.length == str.length) {

                for (int j = 0; j < data1.length - 1; j++) {
                    int i = j;
                    while (i < data1.length - 1) {
                        if (data1[j] == data1[i + 1]) {
                            if (str[j].equals(str[i + 1])) {
                                i++;
                            } else {
                                return false;
                            }
                        } else {
                            if (!str[j].equals(str[i + 1])) {
                                i++;
                            } else {
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
    }
}
