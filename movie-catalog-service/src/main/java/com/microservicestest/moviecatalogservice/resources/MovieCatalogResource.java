package com.microservicestest.moviecatalogservice.resources;

import com.microservicestest.moviecatalogservice.models.CatalogItems;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItems> getCatalog(@PathVariable("userId") String userId){

        return Collections.singletonList(
            new CatalogItems("Minions", "Movie Name", 4)
        );
    }
}
