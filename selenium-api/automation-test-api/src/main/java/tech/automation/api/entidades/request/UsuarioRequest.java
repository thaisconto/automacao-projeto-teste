package tech.automation.api.entidades.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequest {
    private String nome;
    private String email;
    private String password;
    private String administrador;

    public static UsuarioRequest createDefault() {
        return UsuarioRequest.builder()
                .nome("QA Tester")
                .email("test" + System.currentTimeMillis() + "@email.com")
                .password("123456")
                .administrador("true")
                .build();
    }
}