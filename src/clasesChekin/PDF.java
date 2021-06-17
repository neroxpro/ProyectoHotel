package clasesChekin;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PDF {
    private String aux [] = new String [14];

    public PDF(String a[]) throws DocumentException {
        this.aux = a;
        Document documento = new Document();
        try {
            Image logo = Image.getInstance("/Imagenes/logo punta coco.png");
            PdfWriter.getInstance(documento, new FileOutputStream("Recibo.pdf"));
            documento.open();
            logo.scalePercent(20, 20);
            logo.setAlignment(Element.ALIGN_CENTER);
            documento.add(logo);
            
            Paragraph parrafo,espacio;
            espacio = new Paragraph(" ");
            documento.add(espacio);
            documento.add(espacio);
            for(int i=0 ; i<aux.length ; i++){
                float[] part;
                parrafo = new Paragraph(aux[i]);
                parrafo.setAlignment(Element.ALIGN_CENTER);
                documento.add(espacio);
                documento.add(parrafo);
            }
            
            documento.add(espacio);
            documento.add(espacio);
            
            Image firma = Image.getInstance("/Imagenes/FIRMA.png");
            firma.scalePercent(20, 20);
            firma.setAlignment(Element.ALIGN_CENTER);
            documento.add(firma);
            
            Paragraph nom;
            nom = new Paragraph("Victor Fernando Ramirez Padilla");
            nom.setAlignment(Element.ALIGN_CENTER);
            documento.add(nom);
            
            documento.close();
            
        } catch (IOException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
