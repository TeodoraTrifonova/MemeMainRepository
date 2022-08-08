package com.tinqin.memeproject.database.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Author")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthor;
    private String nameAuthor;
    private Double ratingAuthor;
}
