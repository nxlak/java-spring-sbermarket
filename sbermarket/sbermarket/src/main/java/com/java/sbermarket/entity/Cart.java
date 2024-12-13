package com.java.sbermarket.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor
@Builder
public class Cart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CartItem> cartItems;

}
