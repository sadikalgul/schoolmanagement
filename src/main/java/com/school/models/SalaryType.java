package com.school.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class SalaryType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String salaryCode;

    /*
    @OneToOne
    private Instructor salaryInstructor;
     */

    public SalaryType(String salaryCode) {
        this.salaryCode = salaryCode;
    }
}
