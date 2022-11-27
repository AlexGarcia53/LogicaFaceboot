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
    public void editarPerfilUsuario(Usuario usuario);
    public Usuario consultarUsuario(Usuario usuario);
    public Usuario consultarUsuarioPorAToken(Usuario Usuario);
    public Publicacion registrarPublicacion(Publicacion publicacion);
    public void eliminarPublicacion(Publicacion publicacion);
    public Publicacion consultarPublicacionHashtag(Hashtag hashtag);
    public void registrarHashtag(Hashtag hashtag);
    public Hashtag consultarHashtag(int idHashtag);
    public void registrarComentario(Comentario comentario);
    public void eliminarComentario(Comentario comentario);
    public List<Comentario> consultarComentarios(int idPublicacion);
    public List<Publicacion> consultarPublicaciones();
    public void enviarNotificacion(Mensaje mensaje);
}
