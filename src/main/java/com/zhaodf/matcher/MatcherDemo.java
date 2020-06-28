package com.zhaodf.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类：MatcherDemo
 *
 * @author zhaodf
 * @date 2020/6/21
 */
public class MatcherDemo {
    public static void main(String[] args) {
        try {
            //1、Matcher类中lookingAt方法使用举例
//            String regex = "\\d+";
//            String input = "22bb23";
//            Pattern pattern = Pattern.compile(regex);
//            Matcher matcher = pattern.matcher(input);
//            System.out.println(matcher.lookingAt());//返回true,因为\d+匹配到了前面的22
//            Matcher m2=pattern.matcher("aa2223");
//            System.out.println(m2.lookingAt());//返回false,因为\d+不能匹配前面的aa

            //2、Matcher类中find方法使用举例
//            String regex = "\\d+";
//            String input = "2223aa2";
//            Pattern pattern = Pattern.compile(regex);
//            Matcher matcher = pattern.matcher(input);
//            while (matcher.find()) {
//                System.out.println("I found the text '" + matcher.group() +"' starting at " +
//                        "index " + matcher.start()+ " and ending at index "+matcher.end());
//            }
//            boolean result1 = matcher.matches();
//            System.out.println("匹配结果" + result1);

            //3、Matcher类中替换方法使用举例
            StringBuffer buffer = new StringBuffer();
            String regex = "正则表达式";
            String input = "正则表达式 Hello World,正则表达式 Hello World";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            System.out.println(matcher.replaceAll("Java"));
            System.out.println(matcher.replaceFirst("Java"));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
