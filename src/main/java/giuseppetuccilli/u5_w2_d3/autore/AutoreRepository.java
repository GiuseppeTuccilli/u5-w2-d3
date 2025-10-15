package giuseppetuccilli.u5_w2_d3.autore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoreRepository extends JpaRepository<Autore, Integer> {
    boolean existsByEmail(String email);
}
