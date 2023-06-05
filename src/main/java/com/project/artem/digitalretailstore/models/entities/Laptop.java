package com.project.artem.digitalretailstore.models.entities;

import com.project.artem.digitalretailstore.models.BaseProduct;
import com.project.artem.digitalretailstore.models.enums.DisplaySize;
import jakarta.persistence.*;
import lombok.*;

@Data
@Table
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Laptop extends BaseProduct {
    @Column(name = "display_size")
    @Enumerated(EnumType.STRING)
    private DisplaySize displaySize;
}
