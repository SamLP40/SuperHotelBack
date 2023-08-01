package fr.fms.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateStart;
    private Date dateEnd;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    /*
    @ManyToOne Collection<BookItems> bookItem // éléments de réservation, bonus
     */
    private double amount;
}
