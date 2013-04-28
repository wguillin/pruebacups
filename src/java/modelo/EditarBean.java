/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EditarBean {
    
    Uva uva;
    
    public EditarBean() {
    }
    public Uva getUva(){
        return uva;
    }
    public String editar(Integer id){
        UvaDao uvaDao = new UvaDaoImp();
        uva = uvaDao.BuscarPorId(id);
        return "editar";
    }
    public String guardar(){
        UvaDao uvaDao = new UvaDaoImp();
        uvaDao.actualizar(uva);
        return "listar";
    }
}
