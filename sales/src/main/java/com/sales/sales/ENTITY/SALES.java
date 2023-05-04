package com.sales.sales.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="SalesTable")
public class SALES {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private String product;

    @ManyToOne
    @JoinColumn(name = "salesperson_id")
    private String salesPerson;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "sale_date")
    private LocalDate saleDate;

    @Column(name = "total_price")
    private double totalPrice;
}
