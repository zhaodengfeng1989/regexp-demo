package com.zhaodf.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类：PatternDemo
 *
 * @author zhaodf
 * @date 2020/6/21
 */
public class PatternDemo {
    public static void main(String[] args) {
        String regex = "^abc$";
        String input = "abc\n";
        Pattern pattern = Pattern.compile(regex,Pattern.UNIX_LINES);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("I found the text '" + matcher.group() +"' starting at " +
                    "index " + matcher.start()+ " and ending at index "+matcher.end());
        }
        System.out.println(matcher.matches());

    }
}
