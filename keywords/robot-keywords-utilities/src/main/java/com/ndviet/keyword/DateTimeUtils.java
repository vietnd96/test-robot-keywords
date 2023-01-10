package com.ndviet.keyword;

import com.ndviet.library.DateTime.DateTimeHelpers;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.Map;

@RobotKeywords
public class DateTimeUtils extends AnnotationLibrary {
    public DateTimeUtils() {
        super(Arrays.asList("com/ndviet/keyword/DateTimeUtils.class"));
    }

    @RobotKeyword
    public static Map getCurrentQuarterYear() {
        return DateTimeHelpers.getCurrentQuarterYear();
    }

    @RobotKeyword
    public static String getCurrentDateInFormat(String format) {
        return DateTimeHelpers.getCurrentDateInFormat(format, 0);
    }
}
