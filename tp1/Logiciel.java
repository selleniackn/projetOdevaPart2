/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.List;

/**
 *
 * @author lemoine
 */
public class Logiciel {
    private int idLogiciel;
    private String nomLogiciel;
    private double version;
    private List<Licence> listLicence;
    
    public Logiciel(){
        this.idLogiciel=0;
        this.nomLogiciel=null;
        this.version=0.0;
        this.listLicence=null;
    }
    
    public Logiciel(int idL, String nomL, double verL, List<Licence> listLic){
        this.idLogiciel=idL;
        this.nomLogiciel=nomL;
        this.version=verL;
        this.listLicence=listLic;
    }
    
    public Logiciel(Logiciel l){
        this.idLogiciel=l.getIdLogiciel();
        this.nomLogiciel=l.getNomLogiciel();
        this.version=l.getVersion();
        this.listLicence=l.getListLicence();
    }

    /**
     * @return the idLogiciel
     */
    public int getIdLogiciel() {
        return idLogiciel;
    }

    /**
     * @return the nomLogiciel
     */
    public String getNomLogiciel() {
        return nomLogiciel;
    }

    /**
     * @return the version
     */
    public double getVersion() {
        return version;
    }
    
     /**
     * @return the listLicence
     */
    public List<Licence> getListLicence() {
        return listLicence;
    }


    /**
     * @param idLogiciel the idLogiciel to set
     */
    public void setIdLogiciel(int idLogiciel) {
        this.idLogiciel = idLogiciel;
    }

    /**
     * @param nomLogiciel the nomLogiciel to set
     */
    public void setNomLogiciel(String nomLogiciel) {
        this.nomLogiciel = nomLogiciel;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(double version) {
        this.version = version;
    }

    /**
     * @param listLicence the listLicence to set
     */
    public void setListLicence(List<Licence> listLicence) {
        this.listLicence = listLicence;
    }

    @Override
    public String toString() {
        return "Logiciel{" + "idLogiciel=" + idLogiciel + ", nomLogiciel=" + nomLogiciel + ", version=" + version + ", listLicence=" + listLicence + '}';
    }
    
    
}
