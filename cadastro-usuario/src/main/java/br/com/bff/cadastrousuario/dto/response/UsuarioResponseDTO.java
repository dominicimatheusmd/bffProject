package br.com.bff.cadastrousuario.dto.response;

import br.com.bff.cadastrousuario.entities.EnderecoEntity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioResponseDTO {

    private long id;

    private String nome;

    private String email;

    private String documento;

    private EnderecoEntity endereco;
}
