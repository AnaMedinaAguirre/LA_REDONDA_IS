package DAO;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

public class GenerarPDF_Transacciones extends ConectarDB {

    public void GenerarPDFIncidencias() throws FileNotFoundException {
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Transacciones.pdf"));

            //formato de texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Transacciones \n\n");

            documento.open();

            //agregamos los datos
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell("ID transaccion");
            tabla.addCell("Fecha");
            tabla.addCell("Tipo");
            tabla.addCell("Monto");
            tabla.addCell("Empleado");
            tabla.addCell("Descripcion");

            try {
                ps = conexion.prepareStatement(
                        "select idtransaccion,fecha,tipo,monto,empleado,descripcion,indicador from Transacciones where indicador='S';");

                rs = ps.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (SQLException e) {
                System.out.println("ERROR en: " + e);
            } catch (DocumentException ex) {
                java.util.logging.Logger.getLogger(GenerarPDF_Transacciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            documento.close();

            JOptionPane.showMessageDialog(null, "Reporte de Transacciones creado");
        } catch (DocumentException ex) {
            java.util.logging.Logger.getLogger(GenerarPDF_Transacciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
