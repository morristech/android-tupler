package com.miguelgaeta.tupler;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Miguel Gaeta on 5/20/15.
 */
@SuppressWarnings({"UnusedDeclaration", "DefaultFileTemplate"})
@AllArgsConstructor(access = AccessLevel.PACKAGE) @ToString @EqualsAndHashCode
public class Tuple8<A, B, C, D, E, F, G, H> {

    public A d1;
    public B d2;
    public C d3;
    public D d4;
    public E d5;
    public F d6;
    public G d7;
    public H d8;
}