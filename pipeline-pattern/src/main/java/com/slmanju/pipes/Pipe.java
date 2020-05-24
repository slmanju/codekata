package com.slmanju.pipes;

/**
 * Plug two filters together by inputting current filters value into next filter.
 *
 * @param <I> current input type.
 * @param <O> current output type.
 * @param <P> piped output type.
 *
 * @author Manjula Jayawardana, manjulajayawardana@gmail.com
 */
class Pipe<I, O, P> implements Filter<I, P> {

  private Filter<I, O> current;
  private Filter<O, P> next;

  Pipe(Filter<I, O> current, Filter<O, P> next) {
    this.current = current;
    this.next = next;
  }

  /**
   * Execute current filter by the input.
   * Execute the next filter by current filter's output.
   *
   * @param input input value for the current filter.
   * @return next filter's output.
   */
  public P execute(I input) {
    return next.execute(current.execute(input));
  }

}
