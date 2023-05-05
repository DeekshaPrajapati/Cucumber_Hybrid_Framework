package com.shopingstore.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	private static Properties envProperties_value = new Properties(); // store env=prepod
	private static Properties envirment_configStrore = new Properties(); // store url depend on env value like
																			
	private static Properties envirment_dataStrore = new Properties();
	private static Properties databaseconfigrationSave = new Properties();
	static {

		try { 
			FileInputStream read_env = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//java//com//shopingstore//configProperties//env.properties");
			envProperties_value.load(read_env); 

			
			FileInputStream read_envirmentValue = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//java//com//shopingstore//configProperties//"
							+ envProperties_value.getProperty("env") + "-config.properties");
			envirment_configStrore.load(read_envirmentValue); 
																
																

			
			
			FileInputStream read_dataProperties = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//java//com//shopingstore//configProperties//"
							+ envProperties_value.getProperty("env") + "-data.properties");
			envirment_dataStrore.load(read_dataProperties);

			// read for database concetion

			FileInputStream read_databaseProperties = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//java//com//shopingstore//configProperties//"
							+ envProperties_value.getProperty("env") + "-database.properties");
			databaseconfigrationSave.load(read_databaseProperties);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	public static String getConfigProperty(String key) {
		return envirment_configStrore.getProperty(key);
	}

	public static String getDataProperty(String key) {
		return envirment_dataStrore.getProperty(key);
	}

	public static String getDataBaseCon(String key) {
		return databaseconfigrationSave.getProperty(key);
	}

}
