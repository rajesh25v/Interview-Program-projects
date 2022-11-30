package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UtilTest {
	
	public static void main(String[] args) {
		Address a1=new Address("Hyderabad","telanganna",515801);
		Person p1=new Person(1001,"Rajesh",25,45000.25,a1);
		
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(new File("D:\\ioStreamsfile\\serialization.txt"));
		    oos=new ObjectOutputStream(fos);
		    oos.writeObject(p1);
		    oos.close();
			fos.close();
		} catch (IOException e) {
		e.printStackTrace();
		
		}finally {
		System.out.println("object converted byte success");	
		}
		
		FileInputStream fis;
		ObjectInput ois;
		Object obj=null;
		try {
			fis=new FileInputStream(new File("D:\\ioStreamsfile\\serialization.txt"));
			ois=new ObjectInputStream(fis);
			obj=ois.readObject();
			
			ois.close();
			fis.close();
		}catch( IOException | ClassNotFoundException f) {
			f.printStackTrace();
		}
		Person p=(Person) obj;
		System.out.println(p.getName()+"   "+p.getId()+"    age:--"+p.getAge());
		System.out.println(p.getSalary());
		System.out.println(p.getAddress().getCity()+"    "+p.getAddress().getState()+"  "+p.getAddress().getPincode());
	}

}
