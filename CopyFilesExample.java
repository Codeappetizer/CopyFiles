package CopyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFilesExample {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
File source=new File("/Users/jaligamasrinivas/Documents/Introjava/JavaProgramming/src/CopyFiles/abc.txt");
File desti=new File("/Users/jaligamasrinivas/Documents/Introjava/JavaProgramming/src/printing/result1/abc.txt");
copyFileUsingFileStreams(source,desti);

	}
	 
	private static void copyFileUsingFileStreams(File source, File dest)
			throws IOException {
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(source);
			output = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int bytesRead;
			while ((bytesRead = input.read(buf)) > 0) {
				output.write(buf, 0, bytesRead);
			}
		} finally {
			if(input != null && output != null){
			input.close();
			output.close();
			}
		}
	}

}
