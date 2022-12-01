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
import excepciones.ErrorEditarComentarioException;
import excepciones.ErrorEditarUsuarioException;
import excepciones.ErrorEliminarComentarioException;
import excepciones.ErrorEliminarPublicacionException;
import excepciones.ErrorEnviarMensajeException;
import excepciones.ErrorGuardarComentarioException;
import excepciones.ErrorGuardarHashtagException;
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
    public Usuario editarPerfilUsuario(Usuario usuario) {
        try{
            return persistencia.editarPerfilUsuario(usuario);
        } catch (ErrorGuardarUsuarioException e){
            throw new ErrorEditarUsuarioException(e.getMessage());
        }
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
    public Publicacion eliminarPublicacion(Publicacion publicacion) {
        try{
            return persistencia.eliminarPublicacion(publicacion);
        } catch(ErrorEliminarPublicacionException e){
            throw new ErrorEliminarPublicacionException(e.getMessage());
        }
    }

    @Override
    public Publicacion consultarPublicacionHashtag(Hashtag hashtag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Hashtag registrarHashtag(Hashtag hashtag) {
        try{
            return persistencia.registrarHashtag(hashtag);
        } catch(ErrorGuardarHashtagException e){
            throw new ErrorGuardarHashtagException(e.getMessage());
        }
    }

    @Override
    public Hashtag consultarHashtag(int idHashtag) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Comentario registrarComentario(Comentario comentario) {
        try{
            return persistencia.registrarComentario(comentario);
        } catch(ErrorGuardarComentarioException e){
            throw new ErrorGuardarComentarioException(e.getMessage());
        }
    }
    
    @Override
    public Comentario editarComentario(Comentario comentario) {
        try{
            return persistencia.editarComentario(comentario);
        }catch (ErrorEditarComentarioException e){
            throw new ErrorEditarComentarioException(e.getMessage());
        }
    }

    @Override
    public Comentario eliminarComentario(Comentario comentario) {
        try{
            return persistencia.eliminarComentario(comentario);
        } catch (ErrorEliminarComentarioException e){
            throw new ErrorEliminarComentarioException(e.getMessage());
        }
    }

    @Override
    public List<Comentario> consultarComentarios(int idPublicacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Mensaje enviarNotificacion(Mensaje mensaje) {
        try{
            return persistencia.enviarMensaje(mensaje);
        } catch(ErrorEnviarMensajeException e){
            throw new ErrorEnviarMensajeException(e.getMessage());
        }
    }

    @Override
    public List<Publicacion> consultarPublicaciones() {
        try{
            return persistencia.consultarPublicaciones();
        } catch(ErrorBusquedaPublicacionesException e){
            throw new ErrorBusquedaPublicacionesException(e.getMessage());
        }
    }

    @Override
    public Publicacion editarPublicacion(Publicacion publicacion) {
        try{
            return persistencia.editarPublicacion(publicacion);
        }catch(ErrorGuardarPublicacionException e){
            throw new ErrorGuardarPublicacionException(e.getMessage());
        }
    }

    @Override
    public Usuario consultarUsuarioNombre(Usuario usuario) {
        try{
            return persistencia.consultarUsuarioNombre(usuario);
        } catch(ErrorBusquedaUsuarioException e){
            throw new ErrorBusquedaUsuarioException(e.getMessage());
        }
    }


    
}
