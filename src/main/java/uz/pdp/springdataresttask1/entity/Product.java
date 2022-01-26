package uz.pdp.springdataresttask1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private boolean active;

    private String code;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Attachment attachment;

    @ManyToOne
    private Measurement measurement;
}
