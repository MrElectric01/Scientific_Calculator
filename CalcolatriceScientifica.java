package Scientific_Calculator;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class CalcolatriceScientifica {

    public static void main(String[] args) {
        
    }
    
    public String radiceQuadrata(double a){
        return Double.toString(sqrt(a));   
    }
    
    public String seno(double a){
        return Double.toString(sin(a));
    }
    
    public String coseno(double a){
        return Double.toString(cos(a));
    }
    
    public String quadrato(double a){
        return Double.toString(a*a);
    }
    
    public String differenza(double a, double b){
        return Double.toString(a-b);
    }
    
    public String rapporto(double a, double b){
        if(b==0){
            return(" Impossibile dividere per zero");
        }
        return Double.toString(a/b);
    }

    public String somma(double a, double b){
        return Double.toString(a+b);
    }

    public String prodotto(double a, double b){
        return Double.toString(a*b);

    }
}



