package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropEx {

	public static void main(String[] args) throws Exception {
		File file = new File("prop.properties");
		if(!file.exists())
			file.createNewFile();
		// writing properties file
		Properties prop = new Properties();
		prop.setProperty("Name", "Teja");
		prop.setProperty("Degree", "B-tech");
		prop.setProperty("Age", "21");
//		prop.setProperty("Company", "Dmantz");
		prop.put("Experience", "1");  
//		FileOutputStream fos = new FileOutputStream(file); // or using file writer or buffered writer
		FileWriter fos = new FileWriter(file);
		
		
		prop.store(fos, "new prop");  // stores key and value of file above
		 
		
		// Reading the properties file
//		FileInputStream fis = new FileInputStream(file); 
		FileReader fis = new FileReader(file);
		prop.load(fis);
		
		// update
		prop.setProperty("Name", "Afsheen");
		prop.setProperty("Company", "Dmantz"); // doesn't show in prop file  
//		prop.remove("Name");
		
		// to get only keys
//		Set<String> k = prop.stringPropertyNames(); 
		Set<Object> k = prop.keySet(); // or another way to access
		System.out.println(k);
		
		// for values 
		Collection<Object> v = prop.values();
		System.out.println(v);
		
		// Retrieve 
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Job")); // returns null
		System.out.println(prop.getProperty("Job" , "Trainer")); // returns value if not exists
		
		// for keys and values
		System.out.println(prop); 
		for(Object k1 : prop.keySet()) {
			System.out.println(k1 + ">>"  +prop.getProperty((String)k1));
		}
		  
		// for keys and values using entry
		Set<Entry<Object,Object>> data = prop.entrySet();
		for(Entry<Object,Object> kv : data) {
//			System.out.println(kv);
			System.out.println(kv.getKey() + ">>"  +kv.getValue());
		}
		  
		
		// Properties extends Map... so we use map methods
		System.out.println(prop.containsKey("Name"));
		System.out.println(prop.isEmpty());
		prop.clear(); // doesn't remove in  prop file
		System.out.println(prop); 
		
		
		
		

	}

}
