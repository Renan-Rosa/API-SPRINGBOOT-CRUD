package com.example.crud.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

/*
 DTO (Data Transfer Object) usado para representar os dados de um produto que são enviados em uma requisição de criação ou atualização.
 Ela possui campos correspondentes aos dados necessários,
 como id, name e price_in_cents, e as anotações fornecidas pelo pacote
 jakarta.validation.constraints são usadas para aplicar validações nos campos
 */
public record RequestProduct( // Atributos da classe produto "id" , "name" e "price"( Id, Nome e preço )
        String id,

        @NotBlank
        String name,
        @NotNull
        Integer price
) { }
