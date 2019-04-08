package Pdf;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PDFReaderTest {
    public static void main(String[] args){
        try {
            PdfReader pdfReader = new PdfReader("test.pdf");
            int pages = pdfReader.getNumberOfPages();
            for (int i=1; i<=pages; i++) {
                String pageContent = PdfTextExtractor.getTextFromPage(pdfReader, i);
                System.out.println("Content on Page " + i + ": " + pageContent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
