package com.slmanju.pipes;

/**
 * Base interface for all filters.
 *
 * @param <I> input type.
 * @param <O> output type.
 *
 * @author Manjula Jayawardana, manjulajayawardana@gmail.com
 */
public interface Filter<I, O> {

  O execute(I input);

}
