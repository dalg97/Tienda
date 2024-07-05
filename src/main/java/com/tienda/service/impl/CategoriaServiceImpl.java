
package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao; 
import com.tienda.domain.Categoria; 
import com.tienda.service.CategoriaService; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service //significa que esta clase se encuentra en la capa de servicio
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired
    private CategoriaDao categoriaDao;
    
   @Override
   @Transactional(readOnly=true) //solo sera lectura
   public List<Categoria> getCategorias(boolean activos){
      var lista=categoriaDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista; 
   }
   
   @Override
   @Transactional(readOnly=true) //solo sera lectura
   public Categoria getCategoria(Categoria categoria){
       return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
   }
   
   @Override
   @Transactional
   public void save(Categoria categoria){
       categoriaDao.save(categoria);
   }
   
   @Override
   @Transactional
   public void delete(Categoria categoria){
       categoriaDao.delete(categoria);
   }
}
