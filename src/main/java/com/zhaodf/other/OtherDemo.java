package com.zhaodf.other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类：OtherDemo
 *
 * @author zhaodf
 * @date 2020/6/21
 */
public class OtherDemo {
    public static void main(String[] args) {
        try {
            String regex = ".+(?!\\.exe)";
            String input = "notexefile1.txt\nexefile1.exe\nexefile2.exe\nexefile3.exe\nnotexefile2.php\nnotexefile3.sh";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                System.out.println("I found the text '" + matcher.group() +"' starting at " +
                        "index " + matcher.start()+ " and ending at index "+matcher.end());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
