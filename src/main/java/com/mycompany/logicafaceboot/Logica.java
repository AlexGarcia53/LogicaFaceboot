/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logicafaceboot;

import com.mycompany.faceboot_transacciones.FabricaTransacciones;
import datosPersistencia.FabricaDatosPersistencia;
import datosPersistencia.IDatosPersistencia;
import dominio.Comentario;
import dominio.Hashtag;
import dominio.Mensaje;
import dominio.Publicacion;
import dominio.Usuario;
import excepciones.ErrorBusquedaPublicacionesException;
import excepciones.ErrorBusquedaUsuarioException;
import excepciones.ErrorGuardarPublicacionException;
import excepciones.ErrorGuardarUsuarioException;
import interfaces.ILogica;
import interfaces.ITransacciones;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Logica implements ILogica{
    private IDatosPersistencia persistencia;
    private ITransacciones transacciones;
    
    public Logica(){
        persistencia= FabricaDatosPersistencia.crearFachadaDatos();
        transacciones= FabricaTransacciones.crearFachadaTransacciones();
    }
    
    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        try{
            transacciones.logRegistroUsuario(usuario);
            return persistencia.registrarUsuario(usuario);
        } catch(ErrorGuardarUsuarioException e){
            throw new ErrorGuardarUsuarioException(e.getMessage());
        }
    }
    
   @Override
    public Usuario registrarUsuarioFacebook(Usuario usuario) {
        try{
            transacciones.logRegistroUsuario(usuario);
            return persistencia.registrarUsuarioFacebook(usuario);
        } catch(ErrorGuardarUsuarioException e){
            throw new ErrorGuardarUsuarioException(e.getMessage());
        }
    }

    @Override
    public void editarPerfilUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario consultarUsuario(Usuario Usuario) {
        try{
            return persistencia.consultarUsuario(Usuario);
        } catch(ErrorBusquedaUsuarioException e){
            throw new ErrorBusquedaUsuarioException(e.getMessage());
        }
    }
    
    @Override
    public Usuario consultarUsuarioPorAToken(Usuario Usuario) {
        try{
            return persistencia.consultarUsuarioPorAToken(Usuario);
        } catch(ErrorBusquedaUsuarioException e){
            throw new ErrorBusquedaUsuarioException(e.getMessage());
        }
    }
    
    

    @Override
    public Publicacion registrarPublicacion(Publicacion publicacion) {
        try{
            return persistencia.registrarPublicacion(publicacion);
        } catch(ErrorGuardarPublicacionException e){
            throw new ErrorGuardarPublicacionException(e.getMessage());
        }
    }

    @Override
    public void eliminarPublicacion(Publicacion publicacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Publicacion consultarPublicacionHashtag(Hashtag hashtag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void registrarHashtag(Hashtag hashtag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Hashtag consultarHashtag(int idHashtag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void registrarComentario(Comentario comentario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarComentario(Comentario comentario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Comentario> consultarComentarios(int idPublicacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enviarNotificacion(Mensaje mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Publicacion> consultarPublicaciones() {
        try{
            return persistencia.consultarPublicaciones();
        } catch(ErrorBusquedaPublicacionesException e){
            throw new ErrorBusquedaPublicacionesException(e.getMessage());
        }
    }


    
}
