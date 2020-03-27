package ExercAnimal;

public class ExercAnimal {
  int QuantP;
  String especie;
  double Peso;
  
  
   public ExercAnimal(int QuantP,String especie,double peso) {
	   this.QuantP = QuantP;
	   this.especie = especie;
	   this.Peso = peso;
   }
   
   public int getQuantP() {
	   return QuantP;
   }
   
   public void setQuantP(int QuantP) {
	   this.QuantP = QuantP;
   }
   
   public String getespecie() {
	   return especie;
   }
   
   public void setespecie(String especie) {
	   this.especie = especie;
   }
   
   public double getPeso() {
	   return Peso;
   }
   
   public void setPeso(double Peso) {
	  this.Peso = Peso; 
   }
   
   
   public void imprimirDados() {
	   System.out.println("Quantidade de patas: "+ this.getQuantP());
	   System.out.println("Especie: "+ this.getespecie());
	   System.out.println("Peso: "+ this.getPeso() +" Kg");
   }
}
