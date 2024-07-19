
package com.tienda.service;

import java.util.List;
import com.tienda.domain.Producto;

public interface ProductoService {
    
    //Se obtiene un listado de productos en un List  
    public List<Producto> getProductos(boolean activos);
    
    //Se obtiene una producto por medio de su id
    public Producto getProducto(Producto producto);
    
    //metodo guardar
    public void save(Producto producto);
    
    //metodo eliminar
    public void delete(Producto producto);
}
