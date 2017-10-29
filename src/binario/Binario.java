package binario;
import java.util.Scanner;
import java.util.*;
public class Binario {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;
        int x;
        ArrayList a=new ArrayList();       
        
        System.out.print("Ingrese numero natural: ");num=leer.nextInt();
        
        while(num>=2){
            x=num%2;
            a.add(x);
            num=num/2;
        }
        if(num<2){
        a.add(num);
        }
        System.out.print("El numero binario es: ");
        
        for(int i=a.size()-1;i>=0;i--){
            System.out.print(a.get(i));}
        System.out.println(" ");
    
    }//main
}//class main
