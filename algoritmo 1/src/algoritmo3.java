public class algoritmo3 {
    public static void main(String[] args) {
        int j=4;
        int res=holis(res);
        System.out.println(res);
    }
    public static int holis(int n){
        int valor;
        if (n==1){
            valor=1;
        }else {
            valor=holis(n-1)+n;
        }
        return valor;
    }
}
