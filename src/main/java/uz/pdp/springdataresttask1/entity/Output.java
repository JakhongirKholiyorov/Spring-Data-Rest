package uz.pdp.springdataresttask1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Output {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    private String factureNumber;

    private String code;

    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private Client  client;

    @ManyToOne
    private Currency currency;
}
