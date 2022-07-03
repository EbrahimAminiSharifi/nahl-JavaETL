/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moghaleb
 */
public class setting {

    public static String getSetting(String Name) throws FileNotFoundException, IOException {
        FileInputStream fileInput;
        Properties properties = new Properties();

        File file = new File("setting.properties");
        fileInput = new FileInputStream(file);
        properties.load(fileInput);
        fileInput.close();

        return properties.getProperty(Name);
    }

}
