package com.java8.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperation {
public static void main(String[] args) {
	Path path=Paths.get("D:/New folder/Em/Name.txt");
	try{
		Path p=Files.createFile(path);
	}catch(IOException e){
		e.printStackTrace();
	}
	/*Path pathNew =Paths.get("D:/New folder/Em/Name2.txt");
	try{
		Files.move(path,pathNew);
	}catch(IOException e){
		e.printStackTrace();
	}*/
}
}
