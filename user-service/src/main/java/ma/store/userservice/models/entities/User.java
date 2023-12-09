package ma.store.userservice.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
@Builder
<<<<<<< HEAD
@Table(name = "db_user_dev")
=======
@Table(name = "db_user")
>>>>>>> 891cb9c36a703f1a6a900c3889b7a1357a392dcf
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