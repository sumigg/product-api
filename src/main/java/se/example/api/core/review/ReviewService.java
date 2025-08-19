package se.example.api.core.review;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReviewService {

    /**
     * Sample usage: "curl $HOST:$PORT/review?productId=1".
     *
     * @param productId Id of the product
     * @return the reviews of the product
     */
    @GetMapping(value = "/review", produces = "application/json")
    /**
     * Sample usage: "curl $HOST:$PORT/review?productId=1".
     *
     * @param productId Id of the product
     * @return a Flux of reviews for the specified product
     */
    Flux<Review> getReviews(@RequestParam(value = "productId", required = true) int productId);


    @DeleteMapping(value = "/review")
    /**
     * Sample usage: "curl -X DELETE $HOST:$PORT/review?productId=1".
     *
     * @param productId Id of the product for which reviews should be deleted
     */
    Mono<Void> deleteReviews(@RequestParam(value = "productId", required = true) int productId);

    @PostMapping(value = "/review", consumes = "application/json", produces = "application/json")
    /**
     * Sample usage: "curl -X POST $HOST:$PORT/review -H 'Content-Type: application/json' -d '{"productId":1,"reviewId":1,"author":"a","subject":"s","content":"c"}'.
     *
     * @param body the review to create
     * @return the created review
     */
    Mono<Review> createReview(@RequestBody Review body);

}
