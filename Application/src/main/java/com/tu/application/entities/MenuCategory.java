package com.tu.application.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="menuCategory")
@Data
public class MenuCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "category_id")
    private Long categoryId;

    @NotNull
    @Column(name = "category_name")
    private String categoryName;
}