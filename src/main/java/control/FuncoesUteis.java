package control;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.Icon;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jean_
 */
public class FuncoesUteis {    
    public static Date strToDate( String strDt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("yyyy-MM-dd");
        //dtForm.setLenient(false);
        return dtForm.parse(strDt);
    }
    
    public static String dateToStr( Date dt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("yyyy-MM-dd");
        //dtForm.setLenient(false);
        return dtForm.format(dt);
    }
    
    public static byte[] IconToBytes(Icon icon) {
        if (icon == null) {
            return null;
        }
        BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        byte[] bFile = null;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
            try {
                ImageIO.write(img, "png", ios);
                // Set a flag to indicate that the write was successful
            } finally {
                ios.close();
            }
            bFile = baos.toByteArray();
        } catch (IOException ex) {
            bFile = null;
            System.out.println(ex);
        } finally {
            return bFile;
        }

    }
    
    public static String dataAtual(){
        LocalDate data = LocalDate.now();
        return data.toString();
    }
    
    public static byte[] imagemGenerica(){
        JFileChooser jan = new JFileChooser();
        Icon foto = jan.getIcon(new File("pineapple-50.png"));
        return FuncoesUteis.IconToBytes(foto);
    }
}
