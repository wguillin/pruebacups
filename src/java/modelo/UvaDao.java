/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

public interface UvaDao {
    public void insertar(Uva uva);
    public void actualizar(Uva uva);
    public void borrar(Uva uva);
    public Uva BuscarPorId(Integer id);
    public List<Uva> BuscarTodos();
}
