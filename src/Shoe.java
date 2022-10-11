import java.util.Date;

/***
 * La clase Shoe representa a un zapato, con el tipo de zapato, si es o no derecho o izquierdo, la marca, el tamaño, la cantidad de zapatos, la fecha de fabricacion y el ID
 */
public class Shoe {
    //ATTRIBUTES
    /***
     * El atributo publico shoeType representa el tipo de zapato
     */
    public String shoeType;

    /***
     * El atributo publico shoeLeft representa si es o no el zapato izquierdo
     */
    public boolean shoeLeft;

    /***
     * El atributo publico shoeRight representa si es o no el zapato derecho
     */
    public boolean shoeRight;

    /***
     * El atributo publico shoeBrand representa la marca del zapato
     */
    public String shoeBrand;

    /***
     * El atributo privado shoeSize representa el tamaño del zapato
     */
    private int shoeSize;

    /***
     * El atributo privado shoeAmount representa la cantidad de zapatos
     */
    private int shoeAmount;

    /***
     * El atributo protegido dateManufacturingt representa la fecha de fabricación del zapato
     */
    protected Date dateManufacturing;

    /***
     * El atributo protegido shoeID representa el ID del zapato
     */
    protected double shoeID;

    //CONSTRUCTOR
    /***
     * El contructor Shoe, crea una instancia de la clase Shoe
     * @param shoeType como el tipo de zapato
     * @param shoeLeft como si es o no el zapato izquierdo
     * @param shoeRight como si es o no el zapato derecho
     * @param shoeBrand como la marca del zapato
     * @param shoeSize como el tamaño del zapato
     * @param shoeAmount como la cantidad de zapatos
     * @param dateManufacturing como la fecha de fabricación del zapato
     * @param shoeID como el ID del zapato
     */
    public Shoe(String shoeType, boolean shoeLeft, boolean shoeRight, String shoeBrand, int shoeSize, int shoeAmount, Date dateManufacturing, double shoeID) {
        this.shoeType = shoeType;
        this.shoeLeft = shoeLeft;
        this.shoeRight = shoeRight;
        this.shoeBrand = shoeBrand;
        this.shoeSize = shoeSize;
        this.shoeAmount = shoeAmount;
        this.dateManufacturing = dateManufacturing;
        this.shoeID = shoeID;
    }

    //METHODS

    /***
     * El metodo getShoeType obtiene el tipo de zapato
     * @return el String shoeType como el tipo de zapato
     */
    public String getShoeType() {
        return shoeType;
    }

    /***
     * El metodo setShoeType establece el tipo de zapato
     * @param shoeType como el tipo de zapato
     */
    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }

    /***
     * El metodo getShoeLeft obtiene si el zapato es o no izquierdo
     * @return el boolean shoeLeft como si el zapato es o no izquierdo
     */
    public boolean getShoeLeft() {
        return shoeLeft;
    }

    /***
     * El metodo setShoeLeft establece si el zapato es o no izquierdo
     * @param shoeLeft como si el zapato es o no izquierdo
     */
    public void setShoeLeft(boolean shoeLeft) {
        this.shoeLeft = shoeLeft;
    }

    /***
     * El metodo getShoeRight obtiene si el zapato es o no derecho
     * @return el boolean shoeRight como si el zapato es o no derecho
     */
    public boolean getShoeRight() {
        return shoeRight;
    }

    /***
     * El metodo setShoeRight establece si el zapato es o no derecho
     * @param shoeRight como si el zapato es o no derecho
     */
    public void setShoeRight(boolean shoeRight) {
        this.shoeRight = shoeRight;
    }

    /***
     * El metodo getShoeBrand obtiene la marca del zapato
     * @return el String shoeBrand como la marca del zapato
     */
    public String getShoeBrand() {
        return shoeBrand;
    }

    /***
     * El metodo setShoeBrand establece la marca del zapato
     * @param shoeBrand como la marca del zapato
     */
    public void setShoeBrand(String shoeBrand) {
        this.shoeBrand = shoeBrand;
    }

    /***
     * El metodo getShoeSize obtiene el tamaño del zapato
     * @return el int shoeSize como el tamaño del zapato
     */
    public int getShoeSize() {
        return shoeSize;
    }

    /***
     * El metodo setShoeSize establece el tamaño del zapato
     * @param shoeSize como el tamaño del zapato
     */
    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    /***
     * El metodo getShoeAmount obtiene la cantidad de zapatos
     * @return el int shoeAmount como la cantidad de zapatos
     */
    public int getShoeAmount() {
        return shoeAmount;
    }

    /***
     * El metodo setShoeAmount establece la cantidad de zapatos
     * @param shoeAmount como la cantidad de zapatos
     */
    public void setShoeAmount(int shoeAmount) {
        this.shoeAmount = shoeAmount;
    }

    /***
     * El metodo getDateManufacturing obtiene la fecha de fabricación del zapato
     * @return el Date dateManufacturing como la fecha de fabricación del zapato
     */
    public Date getDateManufacturing() {
        return dateManufacturing;
    }

    /***
     * El metodo setDateManufacturing establece la fecha de fabricación del zapato
     * @param dateManufacturing como la fecha de fabricación del zapato
     */
    public void setDateManufacturing(Date dateManufacturing) {
        this.dateManufacturing = dateManufacturing;
    }

    /***
     * El metodo getShoeID obtiene el ID del zapato
     * @return el double shoeID como el ID del zapato
     */
    public double getShoeID() {
        return shoeID;
    }

    /***
     * El metodo setShoeID establece el ID del zapato
     * @param shoeID como el ID del zapato
     */
    public void setShoeID(double shoeID) {
        this.shoeID = shoeID;
    }
}
