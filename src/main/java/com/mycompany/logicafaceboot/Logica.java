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
import excepciones.ErrorConsultarHashtagException;
import excepciones.ErrorConsultarPublicacionException;
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
 * Clase que representa las operaciones lógicas básicas de la aplicación, para esto hace uso 
 * de el acceso a datos y otras herramientas.
 * @author Equipo Broker.
 */
public class Logica implements ILogica{
    /**
     * Atributo con la interfaz que contiene los métodos necesarios para lograr persistir datos mediante el acceso a datos.
     */
    private IDatosPersistencia persistencia;
    /**
     * Atributo con la interfaz que contiene los métodos necesarios para el registro de transacciones de la aplicación.
     */
    private ITransacciones transacciones;
    /**
     * Método constructor de la clase que inicializa los atributos de esta.
     */
    public Logica(){
        persistencia= FabricaDatosPersistencia.crearFachadaDatos();
        transacciones= FabricaTransacciones.crearFachadaTransacciones();
    }
    /**
     * Método utilizado para el registro de un nuevo usuario.
     * @param usuario Usuario a registrar.
     * @return El usuario ya registrado.
     */
    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        try{
            transacciones.logRegistroUsuario(usuario);
            return persistencia.registrarUsuario(usuario);
        } catch(ErrorGuardarUsuarioException e){
            throw new ErrorGuardarUsuarioException(e.getMessage());
        }
    }
    /**
     * Método utilizado para el registro de un usuario que ha ingresado mediante la plataforma Facebook.
     * @param usuario Usuario a registrar.
     * @return El usuario ya registrado.
     */
   @Override
    public Usuario registrarUsuarioFacebook(Usuario usuario) {
        try{
            transacciones.logRegistroUsuario(usuario);
            return persistencia.registrarUsuarioFacebook(usuario);
        } catch(ErrorGuardarUsuarioException e){
            throw new ErrorGuardarUsuarioException(e.getMessage());
        }
    }
    /**
     * Método utilizado para la edición de un usuario registrado en la aplicación.
     * @param usuario Usuario con los datos actualizados.
     * @return El usuario actualizado.
     */
    @Override
    public Usuario editarPerfilUsuario(Usuario usuario) {
        try{
            return persistencia.editarPerfilUsuario(usuario);
        } catch (ErrorGuardarUsuarioException e){
            throw new ErrorEditarUsuarioException(e.getMessage());
        }
    }
    /**
     * Método utilizado para consultar a un usuario registrado mediante la id.
     * @param usuario Usuario a consultar.
     * @return El resultado de la busqueda.
     */
    @Override
    public Usuario consultarUsuario(Usuario Usuario) {
        try{
            return persistencia.consultarUsuario(Usuario);
        } catch(ErrorBusquedaUsuarioException e){
            throw new ErrorBusquedaUsuarioException(e.getMessage());
        }
    }
    /**
     * Método utilizado para consultar a un usuario mediante el token de sesión proporcionado por el 
     * logueo mediante Facebook.
     * @param Usuario Usuario a consultar.
     * @return El resultado de la busqueda.
     */
    @Override
    public Usuario consultarUsuarioPorAToken(Usuario Usuario) {
        try{
            return persistencia.consultarUsuarioPorAToken(Usuario);
        } catch(ErrorBusquedaUsuarioException e){
            throw new ErrorBusquedaUsuarioException(e.getMessage());
        }
    }
    /**
     * Método utilizado para registrar una nueva publicación.
     * @param publicacion Publicación a registrar.
     * @return La publicación registrada.
     */
    @Override
    public Publicacion registrarPublicacion(Publicacion publicacion) {
        try{
            return persistencia.registrarPublicacion(publicacion);
        } catch(ErrorGuardarPublicacionException e){
            throw new ErrorGuardarPublicacionException(e.getMessage());
        }
    }
    /**
     * Método utilizado para la eliminación de una publicación existente.
     * @param publicacion Publicación a eliminar.
     * @return La publicación eliminada.
     */
    @Override
    public Publicacion eliminarPublicacion(Publicacion publicacion) {
        try{
            return persistencia.eliminarPublicacion(publicacion);
        } catch(ErrorEliminarPublicacionException e){
            throw new ErrorEliminarPublicacionException(e.getMessage());
        }
    }
    /**
     * Método utilizado para registrar un nuevo hashtag. 
     * @param hashtag Hashtag a registrar.
     * @return El hashtag registrado.
     */
    @Override
    public Hashtag registrarHashtag(Hashtag hashtag) {
        try{
            return persistencia.registrarHashtag(hashtag);
        } catch(ErrorGuardarHashtagException e){
            throw new ErrorGuardarHashtagException(e.getMessage());
        }
    }
    /**
     * Método utilizado para registrar un nuevo comentario.
     * @param comentario Comentario a registrar.
     * @return El comentario registrado.
     */
    @Override
    public Comentario registrarComentario(Comentario comentario) {
        try{
            return persistencia.registrarComentario(comentario);
        } catch(ErrorGuardarComentarioException e){
            throw new ErrorGuardarComentarioException(e.getMessage());
        }
    }
    /**
     * Método utilizado para actualizar un comentario existente.
     * @param comentario Comentario con datos actualizados.
     * @return El comentario actualizado.
     */
    @Override
    public Comentario editarComentario(Comentario comentario) {
        try{
            return persistencia.editarComentario(comentario);
        }catch (ErrorEditarComentarioException e){
            throw new ErrorEditarComentarioException(e.getMessage());
        }
    }
    /**
     * Método utilizado para eliminar un comentario existente.
     * @param comentario Comentario a eliminar.
     * @return El comentario eliminado.
     */
    @Override
    public Comentario eliminarComentario(Comentario comentario) {
        try{
            return persistencia.eliminarComentario(comentario);
        } catch (ErrorEliminarComentarioException e){
            throw new ErrorEliminarComentarioException(e.getMessage());
        }
    }
    /**
     * Método utilizado para registrar el envío de una nueva notificación.
     * @param mensaje Mensaje a enviar.
     * @return El mensaje enviado.
     */
    @Override
    public Mensaje enviarNotificacion(Mensaje mensaje) {
        try{
            return persistencia.enviarMensaje(mensaje);
        } catch(ErrorEnviarMensajeException e){
            throw new ErrorEnviarMensajeException(e.getMessage());
        }
    }
    /**
     * Método utilizado para consultar todas las publicaciones registradas.
     * @return El resultado de la busqueda.
     */
    @Override
    public List<Publicacion> consultarPublicaciones() {
        try{
            return persistencia.consultarPublicaciones();
        } catch(ErrorBusquedaPublicacionesException e){
            throw new ErrorBusquedaPublicacionesException(e.getMessage());
        }
    }
    /**
     * Método utilizado para la actualización de una publicación existente.
     * @param publicacion Publicación con datos actualizados.
     * @return La publicación actualizada.
     */
    @Override
    public Publicacion editarPublicacion(Publicacion publicacion) {
        try{
            return persistencia.editarPublicacion(publicacion);
        }catch(ErrorGuardarPublicacionException e){
            throw new ErrorGuardarPublicacionException(e.getMessage());
        }
    }
    /**
     * Método utilizado para consultar a un usuario registrado mediante su nombre, regresa al primer usuario 
     * encontrado en caso de que existan varios, si solo existe uno regresa ese.
     * @param usuario Usuario a consultar.
     * @return El resultado de la busqueda.
     */
    @Override
    public Usuario consultarUsuarioNombre(Usuario usuario) {
        try{
            return persistencia.consultarUsuarioNombre(usuario);
        } catch(ErrorBusquedaUsuarioException e){
            throw new ErrorBusquedaUsuarioException(e.getMessage());
        }
    }
    /**
     * Método utilizado para consultar los hashtags existentes mediante su nombre, devuelve una 
     * lista con las coincidencias.
     * @param hashtag Nombre del hashtag a buscar.
     * @return El resultado de la busqueda.
     */
    @Override
    public List<Hashtag> consultarHashtagNombre(String hashtag) {
        try{
            return persistencia.consultarHashtagNombre(hashtag);
        }catch(ErrorConsultarHashtagException e){
            throw new ErrorConsultarHashtagException(e.getMessage());
        }
    }
    /**
     * Método utilizado para consultar una publicación existente mediante la id.
     * @param publicacion Publicación a consultar.
     * @return El resultado de la busqueda.
     */
    @Override
    public Publicacion consultarPublicacion(Publicacion publicacion) {
        try{
            return persistencia.consultarPublicacion(publicacion);
        } catch(ErrorConsultarPublicacionException e){
            throw new ErrorConsultarPublicacionException(e.getMessage());
        }
    }


    
}
