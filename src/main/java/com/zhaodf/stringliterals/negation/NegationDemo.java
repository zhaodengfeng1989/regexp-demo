package com.zhaodf.stringliterals.negation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类：NegationDemo
 *
 * @author zhaodf
 * @date 2020/6/20
 */
public class NegationDemo {
    public static void main(String[] args) {
        try {
            String regex = "[^bcr]at";
            String input = "hat";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                System.out.println("I found the text '" + matcher.group() +"' starting at " +
                        "index " + matcher.start()+ " and ending at index "+matcher.end());
            }
        } catch (java.lang.Exception exception) {
            exception.printStackTrace();
        }
    }
}
