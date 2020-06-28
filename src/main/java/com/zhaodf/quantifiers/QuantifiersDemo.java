package com.zhaodf.quantifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类：QuantifiersClass
 *
 * @author zhaodf
 * @date 2020/6/20
 */
public class QuantifiersDemo {
    public static void main(String[] args) {
        try {
            String input1 = "1212";
            String regex1 = "(\\d\\d)\\1";
            Pattern pattern1 = Pattern.compile(regex1);
            Matcher matcher1 = pattern1.matcher(input1);
            while (matcher1.find()) {
                System.out.println("I found the text '" + matcher1.group() +"' starting at " +
                        "index " + matcher1.start()+ " and ending at index "+matcher1.end());
            }
            String input2 = "1234";
            String regex2 = "(\\d\\d)\\1";
            Pattern pattern2 = Pattern.compile(regex2);
            Matcher matcher2 = pattern2.matcher(input2);
            while (matcher1.find()) {
                System.out.println("I found the text '" + matcher2.group() +"' starting at " +
                        "index " + matcher2.start()+ " and ending at index "+matcher2.end());
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
