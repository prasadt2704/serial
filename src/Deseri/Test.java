package Deseri;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String c;
				
		do {
			System.out.println("Select From the below options:\n"
					+ "1. Serialize \n"
					+ "2. Deserialize\n");
		
		Scanner sc=new Scanner(System.in);
		switch(sc.nextInt()) {
		case 1:
				try{
				StudentInfo[] s1=new StudentInfo[5];
				for(int i=0;i<2;i++)
				{
					s1[i]=new StudentInfo();
					s1[i].accept();
				}		
				FileOutputStream fos=new FileOutputStream("record.ser");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(s1);
				oos.close();
				fos.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
		case 2: 
			StudentInfo s1[]=null;
			try{
				FileInputStream fis=new FileInputStream("record.ser");
				ObjectInputStream ois=new ObjectInputStream(fis);
				s1=(StudentInfo[])ois.readObject();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
	
				for(int i=0;i<2;i++)
				{		
					s1[i].display();
				}
				break;
		
		}
		System.out.println("Do you wish to continue ?? (Y/N)");
		c=sc.next();
		}while(c.equals("Y"));
	}


}
