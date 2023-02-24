package Taller_exceptions_2;

import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Carpeta {
    private String ruta;

    public Carpeta(String ruta) {
        this.ruta = ruta;
    }

    public void contar(){
    
        try{
            if (new java.io.File(ruta).exists()) {
                ZipFile zipFile = new ZipFile(ruta);
                System.out.println("La carpeta contiene " + zipFile.size() + " archivos");
                
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry entry = entries.nextElement();
                    System.out.println(entry.getName());
                }
                zipFile.close();
            }else{
                System.out.println("El archivo ZIP no existe.");
            }
        }catch(IOException e) {
            System.out.println("No se pudo leer el archivo ZIP.");
            System.out.println("Error: "+ e.getMessage());
        }
        
    }
    
}
