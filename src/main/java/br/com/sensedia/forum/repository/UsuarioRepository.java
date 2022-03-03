package br.com.sensedia.forum.repository;

import br.com.sensedia.forum.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);
}
