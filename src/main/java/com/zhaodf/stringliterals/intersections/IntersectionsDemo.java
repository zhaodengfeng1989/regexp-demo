package com.zhaodf.stringliterals.intersections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类：IntersectionsDemo
 *
 * @author zhaodf
 * @date 2020/6/20
 */
public class IntersectionsDemo {
    public static void main(String[] args) {
        try {
            //1、测试\w的匹配：可以匹配数字，字母，下划线组成的单词
            String regex = "[0-7&&[6-8]]";
            String input = "678";
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
