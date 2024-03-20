package poop2;

public class POOP2 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
       
        System.out.println("##### if #####");
        int a;
        a = 10;
        int b=5;
        if (a<b) {
            System.out.println("a es menor que b");
        }
        else if (a==b){
            System.out.println("a y b son iguales");
        }
        else{
            System.out.println("b es menor que a");
            System.out.println(b+ " es menor que "+a);
        }
        if(menor(a,b)){
            System.out.println("a es menor que b");
        }
        else{
            System.out.println("b es menor que a");
        }
       
        System.out.println("Switch");
        char vocal = 'a';
        switch (vocal) {
            case 'a':
                System.out.println("vocal a");
                break;
            case 'e':
                System.out.println("vocal e");
                break;
            case 'i':
                System.out.println("vocal i");
                break;
            case 'o':
                System.out.println("vocal o");
                break;
            case 'u':
                System.out.println("vocal u");
                break;
            default:
                System.out.println("No es una vocal");
        }
        
        System.out.println("While");
        int n=0;
        while(n<10){
            System.out.println("Contando hacia arriba: "+n);
            //n=n+1;
            n++;
        }
        System.out.println("Valor de n fuera del while: "+n);
        while(n>0){
            System.out.println("Contando hacia abajo: "+n);
            n--;
        }
        System.out.println("Valor de n fuera del while: "+n);
        System.out.println("");
        
        System.out.println("do while");
        do {            
            System.out.println("Contando hacia abajo");
            n--;
        } while (n>0);
        System.out.println("Valor de n fuera del while: "+n);
       
        System.out.println("For");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba: "+i);
        }
        for (int i = 0; i > 0; i--) {
            System.out.println("Contando hacia abajo: "+i);
        }
       
        System.out.println("For con arreglos");
        int miArreglo[]={1,2,3,4,5};
        int numElementos = miArreglo.length;
        System.out.println("Mi arreglo tiene " +numElementos+ " elementos");
       
        int[] miArreglo2 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("elemento "+i+": " +miArreglo2[i]);
        }
        for (int i = 0; i < 10; i++) {
            miArreglo2[i] = i*10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("elemento "+i+": " +miArreglo2[i]);
        }
       
        int[] miArreglo3 = new int[10];
        for (int i = 0; i < miArreglo3.length; i++) {
            System.out.println("elemento "+i+": " +miArreglo3[i]);
        }
        for (int i = 0; i < miArreglo3.length; i++) {
            miArreglo3[i] = i*10;
        }
        System.out.println("Hackeando la NASA...");
        for (int i = 0; i < miArreglo3.length; i++) {
            System.out.println("elemento "+i+": " +miArreglo3[i]+"%");
        }
        System.out.println("for-each");
        for (int i : miArreglo3) {
            System.out.println("Elemento del arreglo "+i);
        }
        for(int t:miArreglo3){
            System.out.println("Elemento del arreglo for each "+ t);
        }
    }

    private static boolean menor(int a, int b) {
        if (a<b){
            return true;
        }
        else{
            return false;
        }
    }
}
