package org.pallavi.com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class ReadConfigFile {
    public static HashMap<String,String> dataMap = new HashMap<>();
    public static Properties prop = new Properties();
    public static FileInputStream ip ;

    public ReadConfigFile() throws FileNotFoundException {
    }

    public static HashMap<String,String> getEnvData() throws FileNotFoundException {
        String env = System.getProperty("env");
        ip = new FileInputStream(System.getProperty("user.dir") +"/Config/config.properties");
        try {
            ip = new FileInputStream(System.getProperty("user.dir") +"/Config/config.properties");
            prop.load(ip);
            dataMap.put("baseUrl",prop.getProperty("baseUrl"));
        } catch (IOException e) {
            System.out.printf("File Issue");;
        }
        return dataMap;
    }

    public static HashMap<String,String> getConfigReader(){
        if(dataMap.isEmpty()){
            try {
                dataMap = getEnvData();
            } catch (FileNotFoundException e) {
                System.out.println("Exception in reader ");
            }
        }
        return dataMap;

    }
}
