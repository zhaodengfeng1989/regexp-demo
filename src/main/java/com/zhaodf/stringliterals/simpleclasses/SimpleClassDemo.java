package com.zhaodf.stringliterals.simpleclasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类：StringLiteralsDemo
 *
 * @author zhaodf
 * @date 2020/6/20
 */
public class SimpleClassDemo {
    public static void main(String[] args) {
        try {
            //1、测试\w的匹配：可以匹配数字，字母，下划线组成的单词
            String regex = "[bcr]at";
            String input = "bat";
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
