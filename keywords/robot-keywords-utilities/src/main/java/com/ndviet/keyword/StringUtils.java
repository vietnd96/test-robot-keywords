package com.ndviet.keyword;

import com.ndviet.library.string.StringHelpers;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.List;

@RobotKeywords
public class StringUtils extends AnnotationLibrary {
    public StringUtils() {
        super(Arrays.asList("com/ndviet/keyword/StringUtils.class"));
    }

    @RobotKeyword
    @ArgumentNames({"input", "regex", "replace"})
    public static String replaceStringUsingRegex(String input, String regex, String replace) {
        return StringHelpers.replaceStringUsingRegex(input, regex, replace);
    }

    @RobotKeyword
    @ArgumentNames({"input", "regex", "replace"})
    public static List<String> replaceListStringUsingRegex(List<String> listInput, String regex, String replace) {
        return StringHelpers.replaceListStringUsingRegex(listInput, regex, replace);
    }

    @RobotKeyword
    @ArgumentNames({"input", "regex"})
    public static String getStringMatchesRegex(String input, String regex) {
        return StringHelpers.getStringMatchesRegex(input, regex);
    }

    @RobotKeyword
    @ArgumentNames({"input", "regex"})
    public static List<String> getListStringMatchesRegex(String input, String regex) {
        return StringHelpers.getListStringMatchesRegex(input, regex);
    }

    @RobotKeyword
    @ArgumentNames({"input", "regex"})
    public static List<String> getListStringMatchesListRegex(String input, List<String> listRegex) {
        return StringHelpers.getListStringMatchesListRegex(input, listRegex);
    }

}
