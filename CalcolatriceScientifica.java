package Scientific_Calculator;

public class CalcolatriceScientifica {

    public static void main(String[] args) {
        
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


