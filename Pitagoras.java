package pitagoras;

/**
 *
 * @author Danilo Loschiavo
 * 
 * Projeto destinado para fins educativos referente a tarefa ALPPN_PS_IND_11_Java- Parte 1-b.
 * 
 */
public class Pitagoras {

    public static void main(String[] args) {
        int contador = 0;
        while(contador < 500) {
            for ( int a = 1; a <= 500; a++ ) {
                for ( int b = 1; b <= 500; b++ ) {
                    for ( int c = 1; c <= 500; c++ ){
                        if( (a * a) + (b * b) == (c * c) )
                        {
                            System.out.println("a="+a+"; b="+b+"; c="+c);
                            contador++;
                        }               
                    }
                }
            }
        }
    }
    
}
