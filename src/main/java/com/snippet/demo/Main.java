package com.snippet.demo;

import reactor.core.publisher.Flux;

public class Main {

  /**
   * The main entry point for running the application.
   * @param args Array of arguments to the main method.
   */
  public static void main(String[] args) {
    Flux<Integer> flux = getFlux();
  }

  /**
   * Returns a {@link Flux} of integers.
   * @return A flux of integers.
   */
  public static Flux<Integer> getFlux() {
    return Flux.just(1, 2, 3, 4);
  }

}
