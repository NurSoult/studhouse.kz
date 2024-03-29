package sdu.diploma.studhouse.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "advertisements")
@Getter
@Setter
public class Advertisements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "location")
    private String location;

    @Column(name = "image_paths")
    private String imagePaths;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Landlords author;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "description")
    private String description;

    @Column(name = "type of house")
    private Integer typeOfHouse;

    @Column(name = "number of rooms")
    private Integer numberOfRooms;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "square")
    private Integer square;



}
