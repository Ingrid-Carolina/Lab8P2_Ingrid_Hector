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
public class administrarClerigo {

    private ArrayList<Clerigo> listaClerigos = new ArrayList();
    private File archivo = new File("");

    public administrarClerigo(String path) {
        archivo = new File(path);
    }

    public administrarClerigo() {
    }

    public ArrayList<Clerigo> getListaClerigos() {
        return listaClerigos;
    }

    public void setListaClerigos(ArrayList<Clerigo> listaClerigos) {
        this.listaClerigos = listaClerigos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setClerigo(Clerigo c) {
        listaClerigos.add(c);
    }

    @Override
    public String toString() {
        return "administrarClerigo{" + "listaClerigos=" + listaClerigos + ", archivo=" + archivo + '}';
    }

    public void cargarArchivo() {
        try {
            listaClerigos = new ArrayList();
            Clerigo temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Clerigo) objeto.readObject()) != null) {
                        listaClerigos.add(temp);
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
            for (Clerigo t : listaClerigos) {
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
