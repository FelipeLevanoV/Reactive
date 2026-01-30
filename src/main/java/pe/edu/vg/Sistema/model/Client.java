package pe.edu.vg.Sistema.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.*;

import java.time.LocalDateTime;


@Table("customer")
@Data
public class Client {

    @Id
    @Column("customer_id")
    private Long customerId;

    @Column("first_name")
    private String firstName;

    @Column("last_name")
    private String lastName;

    @Column("dni")
    private String dni;

    @Column("phone")
    private String phone;

    @Column("email")
    private String email;

    @Column("status")
    private String status = "A"; 

    @Column("created_at")
    private LocalDateTime createdAt;

    //Constructor para valores por defecto
    public Client() {
        this.status = "A";
    }
}
