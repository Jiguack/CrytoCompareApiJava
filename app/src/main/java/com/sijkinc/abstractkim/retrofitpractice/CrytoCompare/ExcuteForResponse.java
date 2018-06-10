package com.sijkinc.abstractkim.retrofitpractice.CrytoCompare;

@FunctionalInterface
public interface ExcuteForResponse<T> {
    /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     */
    void apply(T t);

}
