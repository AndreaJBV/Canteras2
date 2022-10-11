/***
 * La clase Cat, representa un gato con su raza, edad, ademas con el nombre, apellido, cedula y numero de celular del dueño.
 */
public class Cat {
    //ATTRIBUTES
    /***
     * El atributo publico catBreed representa la raza del gato
     */
    public String catBreed;

    /***
     * El atributo publico catAge representa la edad del gato
     */
    public int catAge;

    /***
     * El atributo privado ownerCatName representa el nombre del dueño del gato
     */
    private String ownerCatName;

    /***
     * El atributo privado ownerCatLastName representa el apellido del dueño del gato
     */
    private String ownerCatLastName;

    /***
     * El atributo protegido ownerCatID representa la cedula del dueño del gato
     */
    protected double ownerCatID;

    /***
     * El atributo protegido ownerCatCellPhoneNumber representa el numero del celular del dueño del gato
     */
    protected double ownerCatCellPhoneNumber;

    //CONSTRUCTOR
    /***
     * El constructor Cat, crea una instancia de la clase Cat
     * @param catBreed como raza del gato
     * @param catAge como edad del gato
     * @param ownerCatName como nombre del dueño del gato
     * @param ownerCatLastName como apellido del dueño del gato
     * @param ownerCatID como cedula del dueño del gato
     * @param ownerCatCellPhoneNumber como numero del celular del dueño del gato
     */
    public Cat(String catBreed, int catAge, String ownerCatName, String ownerCatLastName, double ownerCatID, double ownerCatCellPhoneNumber) {
        this.catBreed = catBreed;
        this.catAge = catAge;
        this.ownerCatName = ownerCatName;
        this.ownerCatLastName = ownerCatLastName;
        this.ownerCatID = ownerCatID;
        this.ownerCatCellPhoneNumber = ownerCatCellPhoneNumber;
    }

    //METHODS

    /***
     * El metodo getCatBreed obtiene la raza del gato
     * @return el String catBreed como la la raza del gato
     */
    public String getCatBreed() {
        return catBreed;
    }

    /***
     * EL metodo setCatBreed establece la raza del gato
     * @param catBreed como la raza del gato
     */
    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    /***
     * El metodo getCatAge obtiene la edad del gato
     * @return el int catAge como la edad del gato
     */
    public int getCatAge() {
        return catAge;
    }

    /***
     * El metodo setCatAge establece la edad del gato
     * @param catAge como la edad del gato
     */
    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    /***
     * EL metodo getOwnerCatName obtiene el nombre del dueño del gato
     * @return String ownerCatName como el nombre del dueño del gato
     */
    public String getOwnerCatName() {
        return ownerCatName;
    }

    /***
     * EL metodo setOwnerCatName establece el nombre del dueño del gato
     * @param ownerCatName como el nombre del dueño del gato
     */
    public void setOwnerCatName(String ownerCatName) {
        this.ownerCatName = ownerCatName;
    }

    /***
     * El metodo getOwnerCatLastName obtiene el apellido del dueño del gato
     * @return  el String ownerCatLastNam como el apellido del dueño del gato
     */
    public String getOwnerCatLastName() {
        return ownerCatLastName;
    }

    /***
     * EL metodo setOwnerCatLastName establece el apellido del dueño del gato
     * @param ownerCatLastName como el apellido del dueño del gato
     */
    public void setOwnerCatLastName(String ownerCatLastName) {
        this.ownerCatLastName = ownerCatLastName;
    }

    /***
     * El metodo getOwnerCatID obtiene la cedula del dueño del gato
     * @return el double ownerCatID como la cedula del dueño del gato
     */
    public double getOwnerCatID() {
        return ownerCatID;
    }

    /***
     * El metodo setOwnerCatID establece la cedula del dueño del gato
     * @param ownerCatID como la cedula del dueño del gato
     */
    public void setOwnerCatID(double ownerCatID) {
        this.ownerCatID = ownerCatID;
    }

    /***
     * EL metodo getOwnerCatCellPhoneNumber obtiene el numero del celular del dueño del gato
     * @return el double ownerCatCellPhoneNumber como el numero del celular del dueño del gato
     */
    public double getOwnerCatCellPhoneNumber() {
        return ownerCatCellPhoneNumber;
    }

    /***
     * El metodo setOwnerCatCellPhoneNumber establece el numero del celular del dueño del gato
     * @param ownerCatCellPhoneNumber como el numero del celular de dueño del gato
     */
    public void setOwnerCatCellPhoneNumber(double ownerCatCellPhoneNumber) {
        this.ownerCatCellPhoneNumber = ownerCatCellPhoneNumber;
    }
}
