package com.ndviet.keyword;

import com.ndviet.libary.configuration.ConfigurationFactory;
import com.ndviet.libary.spring.SpringHelpers;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;

@RobotKeywords
public class Configuration extends AnnotationLibrary {
    public Configuration() {
        super(Arrays.asList("com/ndviet/keyword/Configuration.class"));
        SpringHelpers.getInstance().getBean("ConfigurationFactory");
    }

    @RobotKeyword
    public String getValue(String key) throws Exception {
        return ConfigurationFactory.getInstance().getValue(key);
    }

}
