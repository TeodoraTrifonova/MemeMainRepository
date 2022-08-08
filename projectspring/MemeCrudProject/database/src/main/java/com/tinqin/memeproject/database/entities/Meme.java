package com.tinqin.memeproject.database.entities;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="Meme")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Meme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMeme;
    private String nameMeme;
    private String memeTemplate;
    private String memeText;
    private String memeUsername;
    @ManyToOne
    @JoinColumn(name = "idAuthor" )
    private Author author;
    private Double rating;

}
