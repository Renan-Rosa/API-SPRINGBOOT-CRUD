package com.example.crud.repository;

import com.example.crud.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface de repositório do Spring Data JPA. A interface ProductRepository estende JpaRepository e fornece métodos de acesso ao banco de dados para a entidade Product.
public interface ProductRepository extends JpaRepository<Product, String> {}