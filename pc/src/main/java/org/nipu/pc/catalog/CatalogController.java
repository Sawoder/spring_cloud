package org.nipu.pc.catalog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {
    private static final Logger LOG = LoggerFactory.getLogger(CatalogController.class);

    @GetMapping("/catalog")
    public String getCatalog() {
        LOG.info("getCatalog method");
        return "get catalog";
    }
}
