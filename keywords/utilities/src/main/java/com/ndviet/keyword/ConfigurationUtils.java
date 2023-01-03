package com.ndviet.keyword;

import com.ndviet.library.configuration.Configuration;
import com.ndviet.library.configuration.ConfigurationFactory;
import com.ndviet.library.configuration.JsonConfiguration;
import com.ndviet.library.configuration.YamlConfiguration;
import com.ndviet.library.spring.SpringHelpers;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.List;

@RobotKeywords
public class ConfigurationUtils extends AnnotationLibrary {
    public ConfigurationUtils() {
        super(Arrays.asList("com/ndviet/keyword/ConfigurationUtils.class"));
        SpringHelpers.getInstance().getBean("ConfigurationFactory");
    }

    @RobotKeyword
    public String getValue(String key) throws Exception {
        return ConfigurationFactory.getInstance().getValue(key);
    }

    @RobotKeyword
    public List<String> getListValues(String key) throws Exception {
        return ConfigurationFactory.getInstance().getListValues(key);
    }

    @RobotKeyword
    public Configuration readYamlConfiguration(String filePath) throws Exception {
        Configuration configuration = new YamlConfiguration();
        configuration.readConfigurationFrom(filePath);
        return configuration;
    }

    @RobotKeyword
    public Configuration readJsonConfiguration(String filePath) throws Exception {
        Configuration configuration = new JsonConfiguration();
        configuration.readConfigurationFrom(filePath);
        return configuration;
    }

}
