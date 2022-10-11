import java.util.ArrayList;

/***
 * La clase CellPhone representa el celular, con nombre, apellidos y cedula del dueño, el numero, la marca y el precio del celular, junto con los contactos
 */
public class CellPhone {
    //ATTRIBUTES
    /***
     * Atributo publico ownerName que representa el nombre del dueño
     */
    public String ownerName;
    /***
     * Atributo publico ownerLastName1 que representa el primer apellido del dueño
     */
    public String ownerLastName1;
    /***
     * Atributo publico ownerLastName2 que representa el segundo apellido del dueño
     */
    public String ownerLastName2;
    /***
     * Atributo publico cellPhoneBrand que reprensenta la marca del celular
     */
    public String cellPhoneBrand;
    /***
     * Atributo privado cellPhoneNumber que reprensenta el numero del celular
     */
    private int cellPhoneNumber;
    /***
     * Atributo privado cellPhonePrice que reprensenta el precio del celular
     */
    private double cellPhonePrice;
    /***
     * Atributo protegido ownerID que repesenta la cedula del dueño del celular
     */
    protected double ownerID;
    /***
     * Atributo protegido contacts que repesenta los contactos del celular
     */
    protected ArrayList<String> contacts;

    //CONSTRUCTOR

    /***
     * El contructor CellPhone, crea una instancia de la clase CellPhone
     * @param ownerName como nombre del dueño
     * @param ownerLastName1 como primer apellido del dueño
     * @param ownerLastName2 como segundo apellido del dueño
     * @param cellPhoneBrand como marca del celular
     * @param cellPhoneNumber como número del celular
     * @param cellPhonePrice como precio del celular
     * @param ownerID como cédula del dueño
     * @param contacts como la lista de contactos de celular
     */
    public CellPhone(String ownerName, String ownerLastName1, String ownerLastName2, String cellPhoneBrand, int cellPhoneNumber, double cellPhonePrice, double ownerID, ArrayList<String> contacts) {
        this.ownerName = ownerName;
        this.ownerLastName1 = ownerLastName1;
        this.ownerLastName2 = ownerLastName2;
        this.cellPhoneBrand = cellPhoneBrand;
        this.cellPhoneNumber = cellPhoneNumber;
        this.cellPhonePrice = cellPhonePrice;
        this.ownerID = ownerID;
        this.contacts = contacts;
    }

    //METHODS
    /***
     * El metodo getOwnerName obtiene el nombre del dueño del celular
     * @return el String ownerName como nombre del dueño del celular
     */
    public String getOwnerName() {
        return ownerName;
    }

    /***
     * El metodo setOwnerName establece el nombre del dueño del celular
     * @param ownerName como el nombre del dueño del celular
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /***
     * El metodo getOwnerLastName1 obtiene el primer apellido del dueño del celular
     * @return el String ownerLastName1 como el primer apellido del dueño del celular
     */
    public String getOwnerLastName1() {
        return ownerLastName1;
    }

    /***
     * El metodo setOwnerLastName1
     * @param ownerLastName1 establece el primer apellido del dueño del celular
     */
    public void setOwnerLastName1(String ownerLastName1) {
        this.ownerLastName1 = ownerLastName1;
    }

    /***
     * El metodo getOwnerLastName2 obtiene el segundo apellido del dueño del celular
     * @return el String ownerLastName2 como el segundo apellido del dueño del celular
     */
    public String getOwnerLastName2() {
        return ownerLastName2;
    }

    /***
     * El metodo setOwnerLastName2 establece el segundo apellido del dueño del celular
     * @param ownerLastName2 como el segundo apellido del dueño del celular
     */
    public void setOwnerLastName2(String ownerLastName2) {
        this.ownerLastName2 = ownerLastName2;
    }

    /***
     * El metodo getCellPhoneBrand obtiene la marca del ceular
     * @return el String cellPhoneBrand como la marca del ceular
     */
    public String getCellPhoneBrand() {
        return cellPhoneBrand;
    }

    /***
     * El metodo etCellPhoneBrand establece la marca del ceular
     * @param cellPhoneBrand como la marca del ceular
     */
    public void setCellPhoneBrand(String cellPhoneBrand) {
        this.cellPhoneBrand = cellPhoneBrand;
    }

    /***
     * El metodo getCellPhoneNumber obtiene el numero del ceular
     * @return el int cellPhoneNumber como el numero del ceular
     */
    public int getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /***
     * El metodo setCellPhoneNumber establece el numero del ceular
     * @param cellPhoneNumber como el numero del ceular
     */
    public void setCellPhoneNumber(int cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    /***
     * El metodo getCellPhonePricer obtiene el precio del ceular
     * @return el double cellPhonePrice como el precio del ceular
     */
    public double getCellPhonePrice() {
        return cellPhonePrice;
    }

    /***
     * El metodo setCellPhonePrice establece el precio del ceular
     * @param cellPhonePrice como el precio del ceular
     */
    public void setCellPhonePrice(double cellPhonePrice) {
        this.cellPhonePrice = cellPhonePrice;
    }

    /***
     * El metodo getOwnerID obtiene la cedula del dueño del celular
     * @return el double ownerID como la cedula del dueño del celular
     */
    public double getOwnerID() {
        return ownerID;
    }

    /***
     * El metodo setOwnerID establece la cedula del dueño del celular
     * @param ownerID como la cedula del dueño del celular
     */
    public void setOwnerID(double ownerID) {
        this.ownerID = ownerID;
    }

    /***
     * El metodo getContacts obtiene la lista de los contactos del celular
     * @return el ArrayList<String> contacts como a lista de los contactos del celular
     */
    public ArrayList<String> getContacts() {
        return contacts;
    }

    /***
     * El metodo setContacts establece la lista de los contactos del celular
     * @param contacts como la lista de los contactos del celular
     */
    public void setContacts(ArrayList<String> contacts) {
        this.contacts = contacts;
    }
}
