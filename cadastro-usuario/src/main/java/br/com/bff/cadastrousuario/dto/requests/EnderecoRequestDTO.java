package br.com.bff.cadastrousuario.dto.requests;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoRequestDTO {

    private String cep;

    private String rua;

    private String bairro;

    private String complemento;

    private long numero;
}
