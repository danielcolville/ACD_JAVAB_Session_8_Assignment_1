package session8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	public static void main(String[] args) {
		File f=new File("oldfile.txt");
		File nf=new File("newfile.txt");
		if(f.exists()) {
			try {
				copyFile(f,nf);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	static void copyFile(File src,File dest) throws IOException {
		Scanner sc=new Scanner(src);
		//System.out.println(sc.nextLine());
		if(!dest.exists()) {
			dest.createNewFile();
		}
		BufferedWriter br=new BufferedWriter(new FileWriter(dest,true));
		while(sc.hasNextLine()) {
			System.out.println("hasnext");
			String n=sc.nextLine();
			System.out.println(n);
			br.write(n);
		}
	}
}
