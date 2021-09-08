/**
 *
 * @author roudet
 */
package test;


public class Ananas implements Fruit{
    private double prix;
    private String origine;

    public Ananas()
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Cameroun";
    }

    public Ananas(double prix, String origine)
    {
    	if(prix < 0)
    	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
    	else
    	    this.prix = prix;

    	if(origine.equals(""))
                this.origine = "Finlande";  //Espagne par défaut
    	else
                this.origine = origine;
    }

    public double getPrix(){
	   return prix;
    }

    public void setPrix(double prix){
	   this.prix=prix;
    }

    public String getOrigine(){
	   return origine;
    }

    public void setOrigine(String country){
	     this.origine=country;
    }

    @Override
    public String toString(){
        return "Ananas de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 Ananas sont equivalents
        if(o != null && getClass() == o.getClass()){
            Ananas or = (Ananas) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Ananas a des pepins
        return false;
    }


}
