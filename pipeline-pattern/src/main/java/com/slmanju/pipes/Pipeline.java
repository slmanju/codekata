package com.slmanju.pipes;

/**
 * @param <I> input type.
 * @param <O> output type.
 *
 * @author Manjula Jayawardana, manjulajayawardana@gmail.com
 */
class Pipeline<I, O> {

  private Filter<I, O> current;

  Pipeline(Filter<I, O> current) {
    this.current = current;
  }

  /**
   * Create new pipeline by piping current and next filters.
   */
  <P> Pipeline<I, P> pipe(Filter<O, P> next) {
    return new Pipeline<>(new Pipe<>(current, next));
  }

  /**
   * Benefiting functional programming, we can remove intermediate {@link Pipe} class.
   */
  <P> Pipeline<I, P> pipe2(Filter<O, P> next) {
    return new Pipeline<>((input -> next.execute(current.execute(input))));
  }

  O process(I input) {
    return current.execute(input);
  }
}
