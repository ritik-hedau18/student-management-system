package com.example.demo.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Course {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String code;
    private int credits;
// minor tweak: performance check updates
// minor tweak: performance check updates
// minor tweak: performance check updates
}
// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 8242

// minor tweak: update verification rules and configs at 4324

// minor tweak: update verification rules and configs at 5206
