package pdfcompare;

import java.io.IOException;
import de.redsix.pdfcompare.PdfComparator;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		String file11=System.getProperty("user.dir")+"\\src\\test\\resources\\file1.pdf";
		String file22=System.getProperty("user.dir")+"\\src\\test\\resources\\file2.pdf";
		String resultfile=System.getProperty("user.dir")+"\\src\\test\\resources\\Results\\result";
		new PdfComparator(file11, file22).compare().writeTo(resultfile);
		System.out.println("Comparision Process Completed!");
		
	}
}
