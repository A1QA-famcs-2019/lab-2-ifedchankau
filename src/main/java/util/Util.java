package util;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;


public class Util {

    private static String readConfigField(String configPath, String field) {
        try {
            Object obj = new JSONParser().parse(new FileReader(configPath));
            JSONObject jo = (JSONObject) obj;
            return (String) jo.get(field);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }


    public static String readLogin(String configPath) {
        return readConfigField(configPath, "login");
    }


    public static String readPassword(String configPath) {
        return readConfigField(configPath, "password");
    }
}

