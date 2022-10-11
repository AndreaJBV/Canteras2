import java.util.Date;

/***
 * Clase Person la cual representa a una persona con su nombre, apellidos, fecha de cumpleaños y estatura
 */
public class Person {
    //ATTRIBUTES
    /***
     * Atributo publico name que representa el nombre de la clase Person
     */
    public String name;
    /***
     * Atributo publico lastName1 que representa el primer apellido de la clase Person
     */
    public String lastName1;
    /***
     * Atributo publico lastName2 que representa el segundo apellido de la clase Person
     */
    public String lastName2;
    /***
     * Atributo publico dateBirth que representa la fecha de cupleaños de la clase Person
     */
    public Date dateBirth;
    /***
     * Atributo publico height que representa la estatura de la clase Person
     */
    public float height;

    //CONSTRUCTOR
    /***
     * El constructor Person, crea una instancia de la clase Person
     * @param name es el nombre
     * @param lastName1 es el primer apellido
     * @param lastName2 es el segundo apellido
     * @param dateBirth es la fecha de cumpleaños
     * @param height es la estatura
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    //METHODS
    /***
     * El metodo getName obtiene el atributo name
     * @return un String name
     */
    public String getName() {
        return name;
    }

    /***
     * El metodo setName establece el nombre
     * @param name hace referencia al nombre
     */
    public void setName(String name) {
        this.name = name;
    }
}
