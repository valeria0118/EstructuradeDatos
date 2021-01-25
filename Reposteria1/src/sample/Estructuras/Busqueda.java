package sample.Estructuras;


public class Busqueda {
    public int secuencial(String[][] array,String dato1,String dato2){
        int indice=-1;
        for (int x=0;x<array.length;x++){
            if(array[x][1].equals(dato1) && array[x][2].equals(dato2)){
                indice=x;
                return indice;
            }
        }
    }


    public static int[] burbuja(int[] arreglo)
    {
        int auxiliar;
        int[] arregloOrdenado;
        for(int i = 2; i < arreglo.length; i++)
        {
            for(int j = 0;j < arreglo.length-i;j++)
            {
                if(arreglo[j] > arreglo[j+1])
                {
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }
    public String[][] burbujaArray(String[][] arreglo)
    {
        String auxiliar;
        String auxiliar2;
        String[][] arregloOrdenado;
        for(int i = 2; i < arreglo.length; i++)
        {
            for(int j = 0;j < arreglo.length-i;j++)
            {
                if(Integer.parseInt(arreglo[j][1]) > Integer.parseInt(arreglo[j+1][1])){

                    auxiliar = arreglo[j][0];
                    auxiliar2 = arreglo[j][1];
                    arreglo[j][0] = arreglo[j+1][0];
                    arreglo[j][1] = arreglo[j+1][1];
                    arreglo[j+1][0] = auxiliar;
                    arreglo[j+1][1] = auxiliar2;
                }
            }
        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }
    public static void insercionDirecta(int A[]){
        int m,n;
        int aux;
        for (m=1;m<A.length;m++){
            aux=A[m];
            n=m-1;
            while ((n>=0) && (aux<A[n])){
                A[n+1]=A[n];
                n--;
            }
            A[n+1]=aux;
        }
    }
    public static int buscarBinaria( int [] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio+fin) / 2;
            if ( arreglo[pos] == dato )
                return pos;
            else if ( arreglo[pos] < dato ) {
                inicio = pos+1;
            } else {
                fin = pos-1;
            }
        }
        return -1;
    }
}
