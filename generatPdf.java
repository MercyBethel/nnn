package com.example.demo3;



import com.itextpdf.text.Document;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.scene.control.TableColumn;


import java.io.FileOutputStream;

public class generatPdf {
    String column ;

    generatPdf(String column) {
        this.column=column;
    }




    public void exportpdf() {
        Document doc = new Document();
        try {
            String f = "C:\\Users\\Win 10\\Desktop\\all\\pdf file.pdf";
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(f));


            doc.open();
            doc.add(new Paragraph(column));
            doc.close();

            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}