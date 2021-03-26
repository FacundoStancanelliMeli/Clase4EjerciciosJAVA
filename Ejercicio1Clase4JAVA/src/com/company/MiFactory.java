package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.PropertyResourceBundle;

public class MiFactory {
    private static final String PROPERTIESSORT = "MiFactory.properties";
    private static Class<?> concreteClass;

    public static Object getInstance(String objName){
        FileInputStream propInp = null;
        Object obj = null;

        try {
            FileReader reader=new FileReader(PROPERTIESSORT);
            Properties p=new Properties();
            p.load(reader);

            obj = Class.forName(p.getProperty("sorter")).newInstance();


        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


        return obj;
    }


}
