package Prin;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Hector
 */
public class administrarMago {

    private ArrayList<Mago> listaMagos = new ArrayList();
    private File archivo = null;

    public administrarMago(String path) {
        archivo = new File(path);
    }

    public administrarMago() {
    }

    public ArrayList<Mago> getListaMagos() {
        return listaMagos;
    }

    public void setListaMagos(ArrayList<Mago> listaMagos) {
        this.listaMagos = listaMagos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setMago(Mago m) {
        listaMagos.add(m);
    }

    @Override
    public String toString() {
        return "administrarMago{" + "listaMagos=" + listaMagos + ", archivo=" + archivo + '}';
    }

    public void cargarArchivo() {
        try {
            listaMagos = new ArrayList();
            Mago temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Mago) objeto.readObject()) != null) {
                        listaMagos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Mago t : listaMagos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
