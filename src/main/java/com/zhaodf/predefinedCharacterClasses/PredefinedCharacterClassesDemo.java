package com.zhaodf.predefinedCharacterClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类：PredefinedCharacterClassesDemo
 *
 * @author zhaodf
 * @date 2020/6/20
 */
public class PredefinedCharacterClassesDemo {
    public static void main(String[] args) {
        //1、匹配空格
        String regex = "\\W";
        String input = "0aA_\n#$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("I found the text '" + matcher.group() +"' starting at " +
                    "index " + matcher.start()+ " and ending at index "+matcher.end());
        }
    }
}
