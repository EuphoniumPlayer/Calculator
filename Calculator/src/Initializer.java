/* The point of ths class is to establish
 * a clear system. This class is mainly
 * to allow the Menu class to become a 
 * child class of Universal. It also gives
 * the code a clear beginning. 
 */

import Tools.Menu;

public class Initializer {
    private static final Menu menu = new Menu();
    public static void main(String[] args) {
        menu.start();
    }
}
