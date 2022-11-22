package untitled.domain;

import untitled.BoundedContext273Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Product_table")
@Data

public class Product  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private String stock;

    @PostPersist
    public void onPostPersist(){
    }

    public static ProductRepository repository(){
        ProductRepository productRepository = BoundedContext273Application.applicationContext.getBean(ProductRepository.class);
        return productRepository;
    }






}
