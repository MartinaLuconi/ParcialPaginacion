package com.utn.MiPrimeraAPIRest.Servicios;


import com.utn.MiPrimeraAPIRest.Entidades.Base;
import com.utn.MiPrimeraAPIRest.Repositorios.BaseRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServicioImpl<E extends Base, ID extends Serializable> implements BaseServicio<E, ID> {
protected BaseRepositorio<E,ID> baseRepositorio;

    public BaseServicioImpl(BaseRepositorio<E, ID> baseRepositorio) {
        this.baseRepositorio = baseRepositorio;
    }

    @Override @Transactional

    public List<E> findALL() throws Exception {
        try {
            List<E> entities = baseRepositorio.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //metodo para paginacion
    @Override @Transactional
    public Page<E> findALL(Pageable pageable) throws Exception {
        try {
            Page<E> entities = baseRepositorio.findAll(pageable);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try{
            Optional<E> entityOptional = baseRepositorio.findById(id);
            return entityOptional.get();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = baseRepositorio.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try{
            Optional<E> entityOptional = baseRepositorio.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate = baseRepositorio.save(entity);
            return entityUpdate;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try{
            if(baseRepositorio.existsById(id)){
                baseRepositorio.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
