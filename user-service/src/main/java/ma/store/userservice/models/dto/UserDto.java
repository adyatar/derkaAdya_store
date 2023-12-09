package ma.store.userservice.models.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDto {
    private Long id_user;
    private String name_user;
    private  String email;
    private  String password;
    private  String img_name;
    private String role;
}
