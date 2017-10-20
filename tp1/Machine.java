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
public class Machine {
    private String idMachine;
    private List<Licence> licenceMachine;
    
    public Machine(){
        this.idMachine=null;
        this.licenceMachine=null;
    }
    
    public Machine(String nomMachine, List<Licence> listeLicence){
        this.idMachine=nomMachine;
        this.licenceMachine=listeLicence;
    }
    
    public Machine(Machine m){
        this.idMachine=m.getIdMachine();
        this.licenceMachine=m.getLicenceMachine();
    }

    /**
     * @return the idMachine
     */
    public String getIdMachine() {
        return idMachine;
    }

    /**
     * @param idMachine the idMachine to set
     */
    public void setIdMachine(String idMachine) {
        this.idMachine = idMachine;
    }

    /**
     * @return the licenceMachine
     */
    public List<Licence> getLicenceMachine() {
        return licenceMachine;
    }

    /**
     * @param licenceMachine the licenceMachine to set
     */
    public void setLicenceMachine(List<Licence> licenceMachine) {
        this.licenceMachine = licenceMachine;
    }

    @Override
    public String toString() {
        return "Machine{" + "idMachine=" + idMachine + ", licenceMachine=" + licenceMachine + '}';
    }
    
    
    
}
