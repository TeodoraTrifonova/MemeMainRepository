package tinqin.project.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tinqin.project.data.entity.Meme;

@Repository
public interface MemeRepository extends JpaRepository<Meme,Long> {
        Meme getMemeByMemeName(String memeName);
}

