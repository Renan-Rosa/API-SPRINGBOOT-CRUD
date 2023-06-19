package com.example.crud.models;

import com.example.crud.dtos.RequestProduct;
import jakarta.persistence.*;
import lombok.*;

// Mapeamento da classe produto e seus atributos para a tabela do banco de dados.
@Table(name="product")
@Entity(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price;

    public Product(RequestProduct requestProduct){
        this.name = requestProduct.name();
        this.price = requestProduct.price();
    }
}
