/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class UvaBean {

    private Uva uva;
    private List<Uva> uvas;
    
    public UvaBean() { 
    }
    public Uva getUva(){
        return uva;
    }
    public void setUva(Uva uva){
        this.uva = uva;
    }
    public List<Uva> getUvas(){
        UvaDao uvaDao = new UvaDaoImp();
        uvas = uvaDao.BuscarTodos();
        return uvas;
    }
    public String borrar(Integer id){
        UvaDao uvaDao = new UvaDaoImp();
        uva = uvaDao.BuscarPorId(id);
        uvaDao.borrar(uva);
        FacesContext context = FacesContext.getCurrentInstance();  
        context.addMessage(null, new FacesMessage("Uva eliminada exitosamente!!!")); 
        return "listar";
    }
}
