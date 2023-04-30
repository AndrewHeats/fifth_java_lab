package ua.lviv.iot.algo.part1.lab5;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReplaceUnderscore {
    public StringBuffer replaceDashes(String text, int lenght) {
        if (text == null) {
            return null;
        }
        Pattern pattern = Pattern.compile("\\b(\\w+)-(\\w+)\\b");
        Matcher matcher = pattern.matcher(text);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group(1) + "_" + matcher.group(2));
        }
        matcher.appendTail(result);
        System.out.println(result);
        return result;


    }



}
