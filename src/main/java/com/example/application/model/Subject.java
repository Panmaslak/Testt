package com.example.application.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idgenerator")
    @SequenceGenerator(name = "idgenerator", initialValue = 1000)
    @Column
    private Long id;

    @Column
    @NotNull
    private String name;

    @Column
    private Integer ECTSPoints;

    @Column
    @NotNull
    private String semester;

/*    @ElementCollection
    private Set<String> semesters;

    public Subject() {
        this.semesters = new HashSet<>(Arrays.asList("1", "2","3", "4", "5", "6", "7"));
    }*/

}
