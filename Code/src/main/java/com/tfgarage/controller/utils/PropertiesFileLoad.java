package com.tfgarage.controller.utils;

import jakarta.servlet.ServletContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesFileLoad {
    public static Properties getProperties(ServletContext context, String filePath) {
        InputStream input = context.getResourceAsStream(filePath);
        Properties properties = null;
        try {
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            Logger.getLogger("PropertiesFileLoad").log(Level.SEVERE,null,e);
        }
        return properties;
    }
}
