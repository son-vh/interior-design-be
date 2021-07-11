package com.example.interiordesignbe.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "image")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    @Column(name = "url")
    private String url;

    @Column(name = "name")
    private String name;


    @Column(name = "company")
    private String company;


    @Column(name = "description")
    private String description;


}
