package fun.is.quarkus.randomThoughts.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "random_thoughts")
public class RandomThought extends PanacheEntityBase {
    
    @Id()
    private UUID thoughtId;

    @Column(name = "random_thought")
    private String randomThought;
}
