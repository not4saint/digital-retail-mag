package com.project.artem.digitalretailstore.models.entities;

import com.project.artem.digitalretailstore.models.BaseProduct;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import lombok.*;

@Data
@Table
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class HardDrive extends BaseProduct {
    @DecimalMin(value = "0.5")
    private int capacity;
}
