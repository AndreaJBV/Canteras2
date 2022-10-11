/***
 * La clase BankAccount representa una cuenta bancarea, con el numero de la cuenta y si esta o no activada.
 */
public class BankAccount {
    //ATTRIBUTES
    /***
     * Atributo privado accountNumber que representa el numero de la cuenta de la clase BankAccount
     */
    private int accountNumber;
    /***
     * Atributo protegido activated que representa si la cuenta bancarea esta activada o no de la clase BankAccount
     */
    protected boolean activated;

    //CONSTRUCTOR

    /***
     * El constructor BankAccount, crea una instancia de la clase BankAccount
     * @param accountNumber como numero de la cuenta bancata
     * @param activated como activacion o no de la cuenta bancarea
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    //METHODS
    /***
     * El metodo getActivated obtiene un true o false en caso de que la cuenta este o no activada
     * @return boolean activated para representar si esta o no activada la cuenta bancarea
     */
    public boolean getActivated() {
        return activated;
    }

    /***
     * El metodo setActivated establece un boolean activated
     * @param activated como true o false en caso de que sea o no activada la cuenta
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
