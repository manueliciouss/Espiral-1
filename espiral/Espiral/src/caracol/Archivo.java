
package caracol;

import java.io.*;

public class Archivo {

    public void leer(String Archivo) {

        int k = 0;
        String[] vector = null;

        try {
            FileReader r = new FileReader(Archivo);
            BufferedReader buffer = new BufferedReader(r);

            String temp = "";
            boolean f = true;

            do  {
                k++;
                temp = buffer.readLine();
                if(temp==null) break;
                String x;
                x = temp;
                vector = x.split(" ");

                Mover e = new Mover(vector);
                e.reloj();
            }while((temp != null));

        } catch (Exception e) {
            System.out.println("fin " + e);
        }
    }
}
