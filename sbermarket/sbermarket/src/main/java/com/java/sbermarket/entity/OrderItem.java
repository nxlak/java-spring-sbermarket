package com.java.sbermarket.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor
@Builder
public class OrderItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderItemId;

    private Long productId;

    private Integer amount;

}
