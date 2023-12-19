package com.tu.application.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="inventory")
@Data
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "inventory_id")
    private Long inventoryId;

    @OneToOne
    @JoinColumn(name = "item_id")
    private MenuItem item;

    @NotNull
    @Column(name = "quantity_in_stock")
    private int quantityInStock;

    @NotNull
    @Column(name = "reorder_level")
    private int reorderLevel;

    @NotNull
    @Column(name = "last_update_date")
    private LocalDateTime lastUpdateDate;
}