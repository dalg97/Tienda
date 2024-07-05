
package com.tienda.service;

import java.util.List;
import com.tienda.domain.Categoria;

public interface CategoriaService {
    
    //Se obtiene un listado de categorias en un List  
    public List<Categoria> getCategorias(boolean activos);
    
    //Se obtiene una categoria por medio de su id
    public Categoria getCategoria(Categoria categoria);
    
    //metodo guardar
    public void save(Categoria categoria);
    
    //metodo eliminar
    public void delete(Categoria categoria);
}
