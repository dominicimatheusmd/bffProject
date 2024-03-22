package br.com.bff.cadastrousuario.dto.requests;

import br.com.bff.cadastrousuario.entities.EnderecoEntity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioRequestDTO {


    private String nome;

    private String email;

    private String documento;

    private EnderecoEntity endereco;
}
