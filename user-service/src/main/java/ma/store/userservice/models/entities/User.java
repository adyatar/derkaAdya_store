package ma.store.userservice.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
@Builder
@Table(name = "db_user_dev")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;
    private String name_user;
    private  String email;
    private  String password;
    private  String img_name;
    private String role;

}