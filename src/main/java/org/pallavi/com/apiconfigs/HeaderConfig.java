package org.pallavi.com.apiconfigs;

import java.util.HashMap;

public class HeaderConfig {
    public static HashMap<String,String> defaultHeaders(){
        HashMap<String,String > defaultHeaders = new HashMap<>();
        defaultHeaders.put("Content-Type","application/json");
        return defaultHeaders;
    }
}
