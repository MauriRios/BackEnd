
package com.portfolio.portfolio.entitys;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.*;


@Getter @Setter
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min= 1, max = 50, message = "No cumple con la longitud")
    private String user;
    
    @NotNull
    @Size(min= 1, max = 50, message = "No cumple con la longitud")
    private String password;
    
}
