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
public class administrarBarbaro {

    private ArrayList<Barbaro> listaBarbaros = new ArrayList();
    private File archivo = new File("");
    

    public administrarBarbaro(String path) {
        archivo = new File(path);
    }

    public administrarBarbaro() {
    }

    public ArrayList<Barbaro> getListaBarbaros() {
        return listaBarbaros;
    }

    public void setListaBarbaros(ArrayList<Barbaro> listaBarbaros) {
        this.listaBarbaros = listaBarbaros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setBarbaro(Barbaro b) {
        listaBarbaros.add(b);
    }

    @Override
    public String toString() {
        return "administrarBarbaro{" + "listaBarbaros=" + listaBarbaros + ", archivo=" + archivo + '}';
    }

    public void cargarArchivo() {
        try {
            listaBarbaros = new ArrayList();
            Barbaro temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Barbaro) objeto.readObject()) != null) {
                        listaBarbaros.add(temp);
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
            for (Barbaro t : listaBarbaros) {
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
