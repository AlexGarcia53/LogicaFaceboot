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
 *
 * @author Admin
 */
public interface ILogica {
    public Usuario registrarUsuario(Usuario usuario);
    public Usuario registrarUsuarioFacebook(Usuario usuario);
    public Usuario editarPerfilUsuario(Usuario usuario);
    public Usuario consultarUsuario(Usuario usuario);
    public Usuario consultarUsuarioPorAToken(Usuario Usuario);
    public Publicacion registrarPublicacion(Publicacion publicacion);
    public Publicacion editarPublicacion(Publicacion publicacion);
    public Publicacion eliminarPublicacion(Publicacion publicacion);
    public Publicacion consultarPublicacionHashtag(Hashtag hashtag);
    public Hashtag registrarHashtag(Hashtag hashtag);
    public Hashtag consultarHashtag(int idHashtag);
    public Comentario registrarComentario(Comentario comentario);
    public Comentario editarComentario(Comentario comentario);
    public Comentario eliminarComentario(Comentario comentario);
    public List<Comentario> consultarComentarios(int idPublicacion);
    public List<Publicacion> consultarPublicaciones();
    public void enviarNotificacion(Mensaje mensaje);
}
