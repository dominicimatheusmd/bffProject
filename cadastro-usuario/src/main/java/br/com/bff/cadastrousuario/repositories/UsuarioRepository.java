package br.com.bff.cadastrousuario.repositories;

import br.com.bff.cadastrousuario.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
