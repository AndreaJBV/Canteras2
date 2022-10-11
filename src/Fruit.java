import java.util.ArrayList;

/***
 * La calse Fruit hace la representación de una fruta, con el nombre, preso promedio y color
 */
public class Fruit {
    //ATTRIBUTES
    /***
     * Atributo publico name que representa el nombre de la clase Fruit
     */
    public String name;
    /***
     * Atributo privado averageWeight que representa el peso promedio de la clase Fruit
     */
    private float averageWeight;
    /***
     * Atributo publico ArrayList<String que representa la lista de colores de la clase Fruit
     */
    public ArrayList<String> colors;

    //CONSTRUCTOR
    /***
     * El constructor Fruit, crea una instancia de la clase Fruit
     * @param name como el nombre
     * @param averageWeight como el peso promedio
     * @param colors como una lista de colores
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    //METHODS

    /***
     * El metodo setName establece el nombre
     * @param name como el nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /***
     * El metodo setColors establece la lista de colores
     * @param colors como la lista de colores
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /***
     * El metodo getColors obtiene la lista de colores
     * @return colors como la lista de colores
     */
    public ArrayList<String> getColors() {
        return colors;
    }
}
