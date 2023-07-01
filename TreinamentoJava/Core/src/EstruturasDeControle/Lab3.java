package EstruturasDeControle;
import java.util.Calendar;

//Anos de Copa do Mundo

public class Lab3 {
    public static void main(String[] args) {
        final int ANO_VIGENTE = Calendar.getInstance().get(Calendar.YEAR);
        for(int ano = 1930; ano <= ANO_VIGENTE; ano+=4) {
            if(ano == 1942 || ano == 1946 ) {
                continue;
            }
            System.out.printf("Copa do mundo de %d!\n", ano);
        }
    }
}