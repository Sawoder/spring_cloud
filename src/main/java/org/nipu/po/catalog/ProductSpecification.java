package org.nipu.po.catalog;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * TODO: This is autogenerated Java-Doc.
 *
 * @author Nikita_Puzankov
 */
@Document
@Data
public class ProductSpecification {
    @Id
    private String id;
    private String name;
    private Long price;
}
