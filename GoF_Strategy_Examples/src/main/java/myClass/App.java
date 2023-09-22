package myClass;

/**
 *
 * @author thiagoabaguiar
 */

public class App {
    
    public static void main(String[] args) {
        
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo meuRobo = new Robo();
        
        meuRobo.setComportamento(normal);
        meuRobo.mover();        
        meuRobo.setComportamento(defensivo);
        meuRobo.mover();
        meuRobo.setComportamento(agressivo);
        meuRobo.mover();
        
    }
    
}
