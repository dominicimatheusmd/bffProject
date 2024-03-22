package br.com.bff.cadastrousuario.dto.response;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoResponseDTO {

    private long id;

    private String cep;

    private String rua;

    private String bairro;

    private String complemento;

    private long numero;
}
