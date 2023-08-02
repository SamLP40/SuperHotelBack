package fr.fms.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.io.Serializable;
import java.lang.Long;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    @OneToMany(fetch=FetchType.EAGER)
    private Collection<Hotel> hotel;
}
