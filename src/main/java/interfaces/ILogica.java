/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Comentario;
import dominio.Hashtag;
import dominio.Mensaje;
import dominio.Publicacion;
import dominio.Usuario;
import java.util.List;

/**
 * Interfaz que contiene la operaciones lógicas necesarias para las peticiones 
 * que pueden ser hechas al servidor.
 * @author Equipo Broker.
 */
public interface ILogica {
    /**
     * Método utilizado para el registro de un nuevo usuario.
     * @param usuario Usuario a registrar.
     * @return El usuario ya registrado.
     */
    public Usuario registrarUsuario(Usuario usuario);
    /**
     * Método utilizado para el registro de un usuario que ha ingresado mediante la plataforma Facebook.
     * @param usuario Usuario a registrar.
     * @return El usuario ya registrado.
     */
    public Usuario registrarUsuarioFacebook(Usuario usuario);
    /**
     * Método utilizado para la edición de un usuario registrado en la aplicación.
     * @param usuario Usuario con los datos actualizados.
     * @return El usuario actualizado.
     */
    public Usuario editarPerfilUsuario(Usuario usuario);
    /**
     * Método utilizado para consultar a un usuario registrado mediante la id.
     * @param usuario Usuario a consultar.
     * @return El resultado de la busqueda.
     */
    public Usuario consultarUsuario(Usuario usuario);
    /**
     * Método utilizado para consultar a un usuario registrado mediante su nombre, regresa al primer usuario 
     * encontrado en caso de que existan varios, si solo existe uno regresa ese.
     * @param usuario Usuario a consultar.
     * @return El resultado de la busqueda.
     */
    public Usuario consultarUsuarioNombre(Usuario usuario);
    /**
     * Método utilizado para consultar a un usuario mediante el token de sesión proporcionado por el 
     * logueo mediante Facebook.
     * @param Usuario Usuario a consultar.
     * @return El resultado de la busqueda.
     */
    public Usuario consultarUsuarioPorAToken(Usuario Usuario);
    /**
     * Método utilizado para registrar una nueva publicación.
     * @param publicacion Publicación a registrar.
     * @return La publicación registrada.
     */
    public Publicacion registrarPublicacion(Publicacion publicacion);
    /**
     * Método utilizado para la actualización de una publicación existente.
     * @param publicacion Publicación con datos actualizados.
     * @return La publicación actualizada.
     */
    public Publicacion editarPublicacion(Publicacion publicacion);
    /**
     * Método utilizado para la eliminación de una publicación existente.
     * @param publicacion Publicación a eliminar.
     * @return La publicación eliminada.
     */
    public Publicacion eliminarPublicacion(Publicacion publicacion);
    /**
     * Método utilizado para consultar una publicación existente mediante la id.
     * @param publicacion Publicación a consultar.
     * @return El resultado de la busqueda.
     */
    public Publicacion consultarPublicacion(Publicacion publicacion);
    /**
     * Método utilizado para registrar un nuevo hashtag. 
     * @param hashtag Hashtag a registrar.
     * @return El hashtag registrado.
     */
    public Hashtag registrarHashtag(Hashtag hashtag);
    /**
     * Método utilizado para registrar un nuevo comentario.
     * @param comentario Comentario a registrar.
     * @return El comentario registrado.
     */
    public Comentario registrarComentario(Comentario comentario);
    /**
     * Método utilizado para actualizar un comentario existente.
     * @param comentario Comentario con datos actualizados.
     * @return El comentario actualizado.
     */
    public Comentario editarComentario(Comentario comentario);
    /**
     * Método utilizado para eliminar un comentario existente.
     * @param comentario Comentario a eliminar.
     * @return El comentario eliminado.
     */
    public Comentario eliminarComentario(Comentario comentario);
    /**
     * Método utilizado para consultar todas las publicaciones registradas.
     * @return El resultado de la busqueda.
     */
    public List<Publicacion> consultarPublicaciones();
    /**
     * Método utilizado para consultar los hashtags existentes mediante su nombre, devuelve una 
     * lista con las coincidencias.
     * @param hashtag Nombre del hashtag a buscar.
     * @return El resultado de la busqueda.
     */
    public List<Hashtag> consultarHashtagNombre(String hashtag);
    /**
     * Método utilizado para registrar el envío de una nueva notificación.
     * @param mensaje Mensaje a enviar.
     * @return El mensaje enviado.
     */
    public Mensaje enviarNotificacion(Mensaje mensaje);
}
