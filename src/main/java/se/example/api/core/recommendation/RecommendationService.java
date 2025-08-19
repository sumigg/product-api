package se.example.api.core.recommendation;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RecommendationService {

    /**
     * Sample usage: "curl $HOST:$PORT/recommendation?productId=1".
     *
     * @param productId Id of the product
     * @return the recommendations of the product
     */
    @GetMapping(value = "/recommendation", produces = "application/json")
    Flux<Recommendation> getRecommendations(@RequestParam(value = "productId", required = true) int productId);

    @PostMapping(value = "/recommendation", consumes = "application/json", produces = "application/json")
    /**
     * Sample usage: "curl -X POST $HOST:$PORT/recommendation -H 'Content-Type: application/json' -d '{"productId":1,"recommendationId":1,"author":"a","content":"c","rating":5}'".
     *
     * @param body the recommendation to create
     * @return the created recommendation
     */
    Mono<Recommendation> createRecommendation(@RequestBody Recommendation body);

    @DeleteMapping(value = "/recommendation")
    /**
     * Sample usage: "curl -X DELETE $HOST:$PORT/recommendation?productId=1".
     *
     * @param productId Id of the product for which recommendations should be deleted
     */
    Mono<Void> deleteRecommendations(@RequestParam(value = "productId", required = true) int productId);
}
