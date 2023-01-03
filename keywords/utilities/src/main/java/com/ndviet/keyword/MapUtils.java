package com.ndviet.keyword;

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywordOverload;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.Map;

@RobotKeywords
public class MapUtils extends AnnotationLibrary {

    public MapUtils() {
        super(Arrays.asList("com/ndviet/keyword/MapUtils.class"));
    }

    @RobotKeyword
    @ArgumentNames({"map", "reverse="})
    public static String getTheLastKey(Map map, boolean reverse) {
        return com.ndviet.libary.map.MapUtils.getTheLastKey(map, reverse);
    }

    @RobotKeywordOverload
    @ArgumentNames({"map"})
    public static String getTheLastKey(Map map) {
        return com.ndviet.libary.map.MapUtils.getTheLastKey(map, false);
    }
}
