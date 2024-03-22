package br.com.bff.cadastrousuario.service;

import br.com.bff.cadastrousuario.dto.converter.UsuarioConverter;
import br.com.bff.cadastrousuario.dto.requests.UsuarioRequestDTO;
import br.com.bff.cadastrousuario.dto.response.UsuarioResponseDTO;
import br.com.bff.cadastrousuario.entities.EnderecoEntity;
import br.com.bff.cadastrousuario.entities.UsuarioEntity;
import br.com.bff.cadastrousuario.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    private final UsuarioConverter usuarioConverter;

    public UsuarioEntity salvaUsuario(UsuarioEntity usuario){
        return usuarioRepository.saveAndFlush(usuario);
    }

    public UsuarioResponseDTO gravarUsuarios(UsuarioRequestDTO usuarioRequestDTO){
        try{
            UsuarioEntity usuarioEntity = salvaUsuario(usuarioConverter.paraUsuarioEntity(usuarioRequestDTO));
            return usuarioConverter.paraUsuarioResponseDto(usuarioEntity);
        }catch (Exception e){
            throw new RuntimeException("Erro ao gravar usuarios" + e);
        }
    }
}
