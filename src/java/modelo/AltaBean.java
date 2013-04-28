/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AltaBean {
    
    Uva uva;
    
    public AltaBean() {
        uva = new Uva();
    }
    public Uva getUva(){
        if (uva == null) {
            uva = new Uva();
        }
        return uva;
    }
    public String guardar(){
        UvaDao uvaDao = new UvaDaoImp();
        uvaDao.insertar(uva);
        uva = null;
        
        
        return "listar";
    }
    
}
