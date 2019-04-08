package Pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class PDFWriteTest {
    public static void main(String[] args){
        try {
            Document document = new Document();
            OutputStream outputStream = new FileOutputStream(new File("D:\\TestFile.pdf"));
            PdfWriter.getInstance(document, outputStream);
            document.open();
            document.add(new Paragraph("Salam salam"));
            document.close();
            outputStream.close();
            System.out.println("Pdf created.");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
