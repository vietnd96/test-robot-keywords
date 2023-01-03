package com.ndviet.keyword;

import com.ndviet.library.map.MapUtils;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.Map;

@RobotKeywords
public class SortUtils extends AnnotationLibrary {
    public SortUtils() {
        super(Arrays.asList("com/ndviet/keyword/SortUtils.class"));
    }

    @RobotKeyword
    public static Map sortByValues(Map input, boolean reverse) {
        return MapUtils.sortByValues(input, reverse);
    }

    @RobotKeyword
    public static Map sortByKeys(Map input, boolean reverse) {
        return MapUtils.sortByKeys(input, reverse);
    }
}
