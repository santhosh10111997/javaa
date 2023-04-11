package org.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Filess {
public static void main(String[] args) throws IOException {
	
	//cerate folder
	File f1=new File("C:\\Users\\pavithra\\eclipse-workspace\\Java\\A");
	boolean b = f1.mkdir();
	System.out.println(b);
	
	//create sub folders
	File f2=new File("C:\\Users\\pavithra\\eclipse-workspace\\Java\\A\\b\\c");
	boolean mkdirs = f2.mkdirs();
	System.out.println(mkdirs);
	
	File f3=new File("C:\\Users\\pavithra\\eclipse-workspace\\Java\\A\\b\\c\\d.txt");
	//create new file
	boolean newFile = f3.createNewFile();
	System.out.println(newFile);
	
	//isfile
	System.out.println(f1.isFile());
	System.out.println(f2.isFile());
	System.out.println(f3.isFile());
	//isDirectory
	System.out.println(f1.isDirectory());
	System.out.println(f3.isDirectory());
	
	System.out.println("...........................");
	System.out.println(f3.canWrite());
	System.out.println(f3.canRead());
	System.out.println(f3.exists());
	System.out.println(f3.isHidden());
	System.out.println("...............................");
	
	//absolutepath
	String path = f3.getAbsolutePath();
	System.out.println(path);
	//write in file
	FileUtils.write(f3, "i love you\n");
	FileUtils.write(f3, "i hate you",true);
	System.out.println(".......ok..........");
	
	System.out.println("......read........");
	
	List<String> r1 = FileUtils.readLines(f3);
	String string = r1.get(0);
	System.out.println(string);
	
	for(String x:r1) {
		System.out.println(x);
	}
	//list
	File f4=new File("E:\\Program Files");
	
	String[] list = f4.list();
	
	for(String x:list) {
		System.out.println(x);
	}
	//list files
	System.out.println(".........file location.......");
	File[] l1 = f4.listFiles();
	
	for(File x:l1) {
		System.out.println(l1);
	}
	
	//copy file
	
	File f5=new File("C:\\Users\\pavithra\\eclipse-workspace\\Java\\A\\b\\c\\e.txt");
	
	FileUtils.copyFile(f3, f5);
	System.out.println("....done....");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
