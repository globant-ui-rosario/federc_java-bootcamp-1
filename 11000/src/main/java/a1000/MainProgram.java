package a1000;


import java.io.FileOutputStream;
import java.util.Scanner;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class MainProgram { 

	public static void main(String[] args) {

		System.out.println("Enter your name please");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		
		Document document = new Document();
		
		try{
			PdfWriter.getInstance(document, new FileOutputStream("Example.pdf"));
			document.open();
			document.add(new Paragraph(name));
			document.close();
		} catch (DocumentException ex) {
			
		} catch (java.io.IOException ex){
			
		}
		
		s.close();

	}

}
