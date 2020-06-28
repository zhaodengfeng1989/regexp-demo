package com.zhaodf.stringliterals.unions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类：UnionsDemo
 *
 * @author zhaodf
 * @date 2020/6/20
 */
public class UnionsDemo {
    public static void main(String[] args) {
        try {
            String regex = "[0-4[6-8]]";
            String input = "6";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                System.out.println("I found the text '" + matcher.group() +"' starting at " +
                        "index " + matcher.start()+ " and ending at index "+matcher.end());
            }
            System.out.println(matcher.matches());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
