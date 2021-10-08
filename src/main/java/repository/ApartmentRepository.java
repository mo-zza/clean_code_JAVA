package repository;

import com.zeeeu.houseutils.entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Long>{
    
}
