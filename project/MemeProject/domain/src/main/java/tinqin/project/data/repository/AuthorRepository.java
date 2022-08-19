package tinqin.project.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tinqin.project.data.entity.Author;
import tinqin.project.data.entity.Meme;

public interface AuthorRepository extends JpaRepository<Author,Long> {
    Author getAuthorByAuthorName(String authorName);

}
