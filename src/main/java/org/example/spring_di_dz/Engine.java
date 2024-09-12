package org.example.spring_di_dz;

import lombok.Data;
import org.springframework.context.annotation.Scope;

@Data
@Scope("prototype")
public class Engine {
    private String type;
}
