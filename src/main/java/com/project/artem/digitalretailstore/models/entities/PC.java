package com.project.artem.digitalretailstore.models.entities;

import com.project.artem.digitalretailstore.models.BaseProduct;
import com.project.artem.digitalretailstore.models.enums.FormFactor;
import jakarta.persistence.*;
import lombok.*;

@Data
@Table
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PC extends BaseProduct {
    @Column(name = "form_factor")
    @Enumerated(EnumType.STRING)
    private FormFactor formFactor;
}
