package ma.store.orderservice.repositories;


import ma.store.orderservice.models.entities.Ordere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Ordere,Long> {

}
