package caracol;

public class Mover {

    private static final byte GIROS = 7;
    private static final byte REPETICIONES = 4;
    private String[] vector;

    public Mover(String[] vector) {
        this.vector = vector;
    }

    public void reloj() {
        for (int i = 0; i < vector.length; i++) {
            //System.out.println(vector[i]);
        }
        int replay = REPETICIONES;
        boolean x = false;
        boolean y = false;
        int time = 0;
        int res = 1;
        int scan = 0;
        int num = -1;
        
        for (int j = 0; j < GIROS; j++) {
            
            if (j % 2 == 0) x = true; else x = false;
            if(scan < 2){ 
                y = false;
            } else{ 
                y = true;
                //scan = 0;
            }
           scan++;
            //System.out.println("scan " + scan);
            

            for (int i = 0; i < replay; i++) {
                //System.out.println(j + time + " " + replay + " i=" + i + " j=" + j);
                time++;
                if(x)
                    res = 1;
                else{
                    res = 4;
                }
                if (y) res = res * -1;
                if (scan >= 5) res = res * -1; 
                if (scan >= 7) res = res * -1; 
                //System.out.println(" " + res);
                //System.out.println(vector[num]);
                //System.out.println(num + " + " + res);
                num = num + res;
                //System.out.println(num);
                System.out.println(vector[num]);
                
            }
            //System.out.println(y);
            if (x){ 
                replay--;
            }
        }
        
    }
}
