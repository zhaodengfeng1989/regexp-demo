package com.zhaodf.stringliterals.range;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类：RangeDemo
 *
 * @author zhaodf
 * @date 2020/6/20
 */
public class RangeDemo {
    public static void main(String[] args) {
        try {
            String regex = "[a-z0-9A-Z]";
            String input = "012Az";
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
