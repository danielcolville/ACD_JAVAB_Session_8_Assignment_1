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
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	static void copyFile(File src,File dest) throws IOException {
		System.out.println("Copying contents of "+src.getPath()+" to "+dest.getPath());
		Scanner sc=new Scanner(src);
		if(!dest.exists()) {
			dest.createNewFile();
		}

		BufferedWriter br=new BufferedWriter(new FileWriter(dest,false));
		while(sc.hasNextLine()) {
			String n=sc.nextLine()+"\n";
			br.write(n);
			br.newLine();
		}
		br.flush();
	}
}
