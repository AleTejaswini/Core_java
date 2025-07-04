package properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;


public class PropBuffered {

	public static void main(String[] args) throws Exception {
		File f = new File("Buffer.properties");
		if(!f.exists()) {
			f.createNewFile();
		}
		Properties p = new Properties();
		p.setProperty("url", "http/user");
		p.setProperty("username", "Teja");
		p.setProperty("password", "123");
		p.setProperty("db", "pdfdownnload");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		p.store(bw, "New");
		
		
         // reading the file
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		p.load(br);
		
	   // for key
		Set<Object> k =  p.keySet();
		System.out.println(k);
		
		// for value
		Collection<Object> v = p.values();
		System.out.println(v);
		
		// for both key and values
		Set<Entry<Object, Object>>  d = p.entrySet();
		for(Entry<Object,Object> e : d) {
			System.out.println(e);
			}
		
		// for both k and v
		for(Object k1 : p.keySet()) {
			System.out.println(k1 + ">>" + p.getProperty((String)k1));
		}
		
		
		
		
		
		
		
		

	}

}
