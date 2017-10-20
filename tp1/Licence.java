/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author lemoine
 */
public class Licence {
    private int idLicence;
    private Logiciel logiciel;
    
    private Licence(){
        this.idLicence=0;
        this.logiciel=null;
    }
    
    private Licence(int idLicence, Logiciel log){
        this.idLicence=idLicence;
        this.logiciel=log;
    }
    
    private Licence(Licence lic){
        this.idLicence=lic.getIdLicence();
        this.logiciel=lic.getLogiciel();
    }

    /**
     * @return the idLicence
     */
    public int getIdLicence() {
        return idLicence;
    }

    /**
     * @param idLicence the idLicence to set
     */
    public void setIdLicence(int idLicence) {
        this.idLicence = idLicence;
    }

    /**
     * @return the logiciel
     */
    public Logiciel getLogiciel() {
        return logiciel;
    }

    /**
     * @param logiciel the logiciel to set
     */
    public void setLogiciel(Logiciel logiciel) {
        this.logiciel = logiciel;
    }

    @Override
    public String toString() {
        return "Licence{" + "idLicence=" + idLicence + ", logiciel=" + logiciel + '}';
    }
    
    
    
    
}
