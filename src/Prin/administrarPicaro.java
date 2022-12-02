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
public class administrarPicaro {

    private ArrayList<Picaro> listaPicaros = new ArrayList();
    private File archivo = new File("");

    public administrarPicaro(String path) {
        archivo = new File(path);
    }

    public administrarPicaro() {
    }

    public ArrayList<Picaro> getListaPicaros() {
        return listaPicaros;
    }

    public void setListaPicaros(ArrayList<Picaro> listaPicaros) {
        this.listaPicaros = listaPicaros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setPicaro(Picaro p) {
        listaPicaros.add(p);
    }

    @Override
    public String toString() {
        return "administrarPicaro{" + "listaPicaros=" + listaPicaros + ", archivo=" + archivo + '}';
    }

    public void cargarArchivo() {
        try {
            listaPicaros = new ArrayList();
            Picaro temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Picaro) objeto.readObject()) != null) {
                        listaPicaros.add(temp);
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
            for (Picaro t : listaPicaros) {
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
