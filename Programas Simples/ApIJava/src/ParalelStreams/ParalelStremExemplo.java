package ParalelStreams;
import java.util.List;
import java.util.stream.IntStream;

public class ParalelStremExemplo {

    public static void main(String[]args){

    long inicio = System.currentTimeMillis();
    IntStream.range(1,100000).forEach(num -> fatorials(num)); //Serial
    long fim = System.currentTimeMillis();
    System.out.println("Tempo de execução Serial: "+(fim-inicio));

    inicio = System.currentTimeMillis();
    IntStream.range(1,100000).parallel().forEach(num -> fatorials(num)); //Serial
    fim = System.currentTimeMillis();
    System.out.println("Tempo de execução Parallel: "+(fim-inicio));
    
    }

    public static long fatorials(long num){
        long fat = 1;
        for (int i=2; i <= num; i++){
            fat*=i;
        }
        return fat;
    }
}
