
package com.portfolio.portfolio.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
public class AcercaDe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min= 1, max = 600, message = "No cumple con la longitud")
    private String miInfo;
    
    @NotNull
    @Size(min= 1, max = 600, message = "No cumple con la longitud")
    private String stackInfo;

}
