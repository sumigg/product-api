package se.example.api.core.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import reactor.core.publisher.Mono;

public interface ProductService {

    @GetMapping(value = "/product/{productId}", produces = "application/json")
    /**
     * Sample usage: "curl $HOST:$PORT/product/{productId}".
     *
     * @param productId Id of the product
     * @return the product info, if found, else null
     */
    Mono<Product> getProduct(@PathVariable("productId") int productId);

    @PostMapping(value = "/product", produces = "application/json", consumes = "application/json")
    Mono<Product> createProduct(@RequestBody Product body);

    @DeleteMapping(value = "/product/{productId}")
    /**
     * Sample usage: "curl -X DELETE $HOST:$PORT/product/{productId}".
     *
     * @param productId Id of the product to delete
     */ 
    Mono<Void> deleteProduct(@PathVariable("productId") int productId);


}
