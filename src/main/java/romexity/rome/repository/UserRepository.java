package romexity.rome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import romexity.rome.entity.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
