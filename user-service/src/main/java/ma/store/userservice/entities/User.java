package ma.store.userservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
@Builder
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;
    private String name_user;
    private  String email;

    private String role;



}