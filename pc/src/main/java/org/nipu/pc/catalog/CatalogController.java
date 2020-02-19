package org.nipu.pc.catalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {
    @GetMapping("/catalog")
    public String getCatalog() {
        return "get catalog";
    }
}
