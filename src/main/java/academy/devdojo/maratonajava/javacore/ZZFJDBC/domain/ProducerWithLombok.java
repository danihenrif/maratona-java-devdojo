package academy.devdojo.maratonajava.javacore.ZZFJDBC.domain;

import lombok.Builder;
import lombok.Value;

//Essas anotações geram o builder
@Value
/*
* Equivalent to @Getter @FieldDefaults(makeFinal=true,
* level=AccessLevel. PRIVATE) @AllArgsConstructor @ToString @EqualsAndHashCode.
* */
@Builder
public class ProducerWithLombok {
    private Integer id;
    private String name;
}
