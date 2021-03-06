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
public class Tuple2<A, B> {

    public final A d1;
    public final B d2;
}
