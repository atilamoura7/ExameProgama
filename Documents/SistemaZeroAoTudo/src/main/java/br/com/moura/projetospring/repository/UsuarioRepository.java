package br.com.moura.projetospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.moura.projetospring.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>
{

}
