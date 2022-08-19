package tinqin.project.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Meme")
@Getter
@Setter
public class Meme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memeID;

    @ManyToOne
    @JoinColumn(name = "authorID")
    private Author authorMeme;

    private String memeName;

    private Integer rating;
}
