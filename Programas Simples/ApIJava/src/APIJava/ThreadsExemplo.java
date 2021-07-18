package APIJava;

public class ThreadsExemplo {

    public static void main (String[]args){
        GeradorPdf iniciarGeradorPdf = new GeradorPdf();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);
        iniciarGeradorPdf.start();
        iniciarBarraDeCarregamento.start();
    }
}

class GeradorPdf extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Iniciar Geração de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gerar Pdf");
    }
}

class BarraDeCarregamento extends Thread {
    private Thread iniciarGeradorPdf;
    public BarraDeCarregamento(Thread iniciarGeradorPdf){
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }

    @Override
    public void run(){
           while (true){
               try {
                   Thread.sleep(500);
                   if(!iniciarGeradorPdf.isAlive()){
                       break;
                   }
                   System.out.println("Loading...");
               } catch (InterruptedException e){
                   e.printStackTrace();
               }
           }
    }
}

class BarraDeCarregamento2 extends Thread {

    @Override
    public void run(){
        super.run();
        try {
            Thread.sleep(3000);
            System.out.println("Rodei BarraDeCarregamento2: " + this.getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

 class BarraDeCarregamento3 extends Thread {

    @Override
    public void run(){
        super.run();

        try {
            Thread.sleep(1000);
            System.out.println("Rodei BarraDeCarregamento3: " + this.getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
