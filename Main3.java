import static java.lang.Double.isNaN;

public class Main3 {

    public static void main(String[] args) {
        int[] m = new int[10];
        float[] x = new float[20];
        double[][] p = new double[10][20];
        m[0] = 22;
        for (int q = 1; q < 10; q++) {
            m[q] = m[q - 1] - 2;
        }
        for (int q = 0; q < 20; q++) {
          java.util.Random randomm = new java.util.Random();
          x[q] = (randomm.nextFloat() * (5 - (-14))) - 14;
        }
        for (int i = 0; i < 10; i++){
            System.out.println(" ");
            for (int j = 0; j < 20; j++){
                if (m[i] == 4 || m[i] == 12 || m[i] == 14 || m[i] == 20) {
                    p[i][j] = Math.exp(Math.cos(Math.cos(Math.pow(((x[j] + 1/3d) / 4), 3))));
                }
                else{
                    if (m[i] != 16){
                        p[i][j] = Math.pow(Math.sin(Math.sin(x[j])), 0.5/(Math.log(Math.pow(Math.tan(x[j]), 2))));
                    }
                    else{
                        p[i][j] = ((Math.cbrt(x[j]*2))/1)/3; // в условии реально разделить на один, по приколу...
                    }
                }
               if (isNaN(p[i][j])) {
                    System.out.printf("NaN   ");
                }
                else {
                    System.out.printf("%-6.2f", p[i][j]);
                }
            }
        }
    }
}

