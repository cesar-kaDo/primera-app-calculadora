package Clases;
import java.util.*;

public class Main {
        static Scanner leer = new Scanner(System.in);
        static int a,b;
        static int op=0;
        
    public static void main(String[] args) throws Exception {
    
        do{
                        System.out.println("Bienvenido \n Ingrese la Opcion que desea");
                        System.out.println("\n Menu \n 1.Sumar \n 2.Restar \n 3. Multiplicar \n 4. Dividir \n 5.Potencia \n 6. Raiz \n 7. Cerrar");
                        op = leer.nextInt();
                        
                        switch (op) {
                                case 1:
                                        System.out.println("Ingrese el Primer numero : ");
                                        a = leer.nextInt();
                                        System.out.println("Ingrese el segundo numero : ");
                                        b = leer.nextInt();
                                        System.out.println("el resultado de la suma es: "+ suma(a,b)+ "Que es la suma entre "+a + " y "+ b);
                                        break;
                                case 2:
                                        System.out.println("Ingrese el Primer numero : ");
                                        a = leer.nextInt();
                                        System.out.println("Ingrese el segundo numero : ");
                                        b = leer.nextInt();
                                        System.out.println("el resultado de la resta es: "+ resta(a,b));
                                        break;
                                case 3:
                                		System.out.println("Ingrese el Primer numero : ");
                                		a = leer.nextInt();
                                		System.out.println("Ingrese el segundo numero : ");
                                		b = leer.nextInt();
                                		System.out.println("el resultado de la multiplicar es: "+ multiplicar(a,b));
                                		break;
                                        
                                case 4:
                                	    System.out.println("Ingrese el Primer numero : ");
                                	    a = leer.nextInt();
                                	    System.out.println("Ingrese el segundo numero : ");
                                	    b = leer.nextInt();
                                	    System.out.println("el resultado de la dividision es: "+ dividir(a,b));
                                	    break;
                                case 5:
                                	    System.out.println("Ingrese el Primer numero : ");
                                	    a = leer.nextInt();
                                	    System.out.println("Ingrese el segundo numero : ");
                                	    b = leer.nextInt();
                                	    System.out.println("el resultado de la potencia es: "+ potencia(a,b));
                                	    break;
                                case 6:
                            	    	System.out.println("Ingrese el numero : ");
                            	    	a = leer.nextInt();
                            	    	System.out.println("el resultado de la raiz es: \n ");
                            	    	System.out.println(Math.sqrt(a));
                            	    	break;
                                case 7:
                                		System.exit(0);
                                		break;
                                		
                            	    	
                        }
                                                
        }while(op!=7);
         
        }
    
    static int suma(int a, int b){
            return a+b;
    }
    static int resta(int a, int b){
            return a-b;
    }
    static int multiplicar(int a, int b){
    		return a*b;
    }
    static int dividir(int a, int b){
    		return a/b;
    }
    static int potencia(int a, int b){
    		int x=1;
    		for (int i= 0; i < b; i++){
    			x=x*a;
    		}
    		return x;
    }
    
}
    		
