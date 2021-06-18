
public abstract class Calculadora {
	
     private double resultado;
     
     public void somar (double n, double n2) {
    	 this.resultado = n + n2;
    	 System.out.println("Resultado soma: " + this.resultado);
     }
     
     public void subtrair (double n, double n2) {
    	 this.resultado = n - n2;
    	 System.out.println("Resultado subtra��o: " + this.resultado);
     }
     
     public void multiplicar (double n, double n2) {
    	 this.resultado = n * n2;
    	 System.out.println("Resultado multiplica��o: " + this.resultado);
     }
     
     public void dividir(double n, double n2) {
    	 if (n2 == 0) {
    		 System.out.println("Imposs�vel dividir por 0");
    	 } else {
    		 this.resultado = n / n2;
        	 System.out.println("Resultado divis�o: " + this.resultado);
    	 }
     }
     
     public double getResultado() {
    	 return this.resultado;
     }
     
     public void setResultado(double resultado) {
    	 this.resultado = resultado;
     }
}
