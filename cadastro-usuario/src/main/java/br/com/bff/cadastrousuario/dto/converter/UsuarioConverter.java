//package br.com.bff.cadastrousuario.dto.converter;
//
//import br.com.bff.cadastrousuario.dto.requests.UsuarioRequestDTO;
//import br.com.bff.cadastrousuario.dto.response.EnderecoResponseDTO;
//import br.com.bff.cadastrousuario.dto.response.UsuarioResponseDTO;
//import br.com.bff.cadastrousuario.entities.EnderecoEntity;
//import br.com.bff.cadastrousuario.entities.UsuarioEntity;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class UsuarioConverter {
//
//    public UsuarioEntity paraUsuarioEntity(UsuarioRequestDTO usuarioDTO) {
//        return UsuarioEntity.builder()
//                .nome(usuarioDTO.getNome())
//                .documento(usuarioDTO.getDocumento())
//                .email(usuarioDTO.getEmail())
//                .endereco(paraEnderecoEntity(usuarioDTO.getEndereco()))
//                .build();
//
//    }
//
//
//    private EnderecoEntity paraEnderecoEntity(EnderecoEntity enderecoDTO) {
//        return EnderecoEntity.builder()
//                .rua(enderecoDTO.getRua())
//                .bairro(enderecoDTO.getBairro())
//                .cep(enderecoDTO.getCep())
//                .numero(enderecoDTO.getNumero())
//                .complemento(enderecoDTO.getComplemento())
//                .build();
//    }
//}
