
package ico.fesa.tennis;

/**
 *
 * @author Marco Antonio
 */
public class Juego {

    public static void main(String[] args) {
        Player p1 = new Player("Marco", 0, false,false);
        Player p2 = new Player("Chuy", 0, false,false);
        Tennis juego = new Tennis(p1, p2);
        
        juego.marcador();
             p1.marcar_punto();
             juego.marcador();
                 p2.marcar_punto();
                    juego.marcador();

    }
}
