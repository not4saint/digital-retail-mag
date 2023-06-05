package com.project.artem.digitalretailstore.models.entities;

import com.project.artem.digitalretailstore.models.BaseProduct;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;

@Data
@Table
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Display extends BaseProduct {
    @Column(name = "display_size")
    @DecimalMin(value = "15.6", message = "The diagonal of the screen should be more than 15.6 inches")
    private double displaySize;
}
