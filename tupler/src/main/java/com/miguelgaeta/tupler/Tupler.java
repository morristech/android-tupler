package com.miguelgaeta.tupler;

import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;

/**
 * Created by Miguel Gaeta on 10/20/15.
 */
@SuppressWarnings({"unused", "DefaultFileTemplate", "SpellCheckingInspection"})
public class Tupler {

    public static <A> Tuple1<A> create(A a) {
        return new Tuple1<>(a);
    }

    public static <A, B> Tuple2<A, B> create(A a, B b) {
        return new Tuple2<>(a, b);
    }

    public static <A, B, C> Tuple3<A, B, C> create(A a, B b, C c) {
        return new Tuple3<>(a, b, c);
    }

    public static <A, B, C, D> Tuple4<A, B, C, D> create(A a, B b, C c, D d) {
        return new Tuple4<>(a, b, c, d);
    }

    public static <A, B, C, D, E> Tuple5<A, B, C, D, E> create(A a, B b, C c, D d, E e) {
        return new Tuple5<>(a, b, c, d, e);
    }

    public static <A, B, C, D, E, F> Tuple6<A, B, C, D, E, F> create(A a, B b, C c, D d, E e, F f) {
        return new Tuple6<>(a, b, c, d, e, f);
    }

    public static <A, B, C, D, E, F, G> Tuple7<A, B, C, D, E, F, G> create(A a, B b, C c, D d, E e, F f, G g) {
        return new Tuple7<>(a, b, c, d, e, f, g);
    }

    public static <A, B, C, D, E, F, G, H> Tuple8<A, B, C, D, E, F, G, H> create(A a, B b, C c, D d, E e, F f, G g, H h) {
        return new Tuple8<>(a, b, c, d, e, f, g, h);
    }

    public static <A, B, C, D, E, F, G, H, I> Tuple9<A, B, C, D, E, F, G, H, I> create(A a, B b, C c, D d, E e, F f, G g, H h, I i) {
        return new Tuple9<>(a, b, c, d, e, f, g, h, i);
    }

    public static <A> Observable<Tuple1<A>> combineLatest(Observable<A> a) {

        return a.map(new Func1<A, Tuple1<A>>() {

            @Override
            public Tuple1<A> call(A a) {

                return Tupler.create(a);
            }
        });
    }

    public static <A, B> Observable<Tuple2<A, B>> combineLatest(Observable<A> a, Observable<B> b) {

        return Observable.combineLatest(a, b, new Func2<A, B, Tuple2<A, B>>() {

            @Override
            public Tuple2<A, B> call(A a, B b) {

                return Tupler.create(a, b);
            }
        });
    }

    public static <A, B, C> Observable<Tuple3<A, B, C>> combineLatest(Observable<A> a, Observable<B> b, Observable<C> c) {

        return Observable.combineLatest(a, b, c, new Func3<A, B, C, Tuple3<A, B, C>>() {

            @Override
            public Tuple3<A, B, C> call(A a, B b, C c) {

                return new Tuple3<>(a, b, c);
            }
        });
    }

    public static <A, B, C, D> Observable<Tuple4<A, B, C, D>> combineLatest(Observable<A> a, Observable<B> b, Observable<C> c, Observable<D> d) {

        return Observable.combineLatest(a, b, c, d, new Func4<A, B, C, D, Tuple4<A, B, C, D>>() {

            @Override
            public Tuple4<A, B, C, D> call(A a, B b, C c, D d) {

                return new Tuple4<>(a, b, c, d);
            }
        });
    }

    public static <A, B, C, D, E> Observable<Tuple5<A, B, C, D, E>> combineLatest(Observable<A> a, Observable<B> b, Observable<C> c, Observable<D> d, Observable<E> e) {

        return Observable.combineLatest(a, b, c, d, e, new Func5<A, B, C, D, E, Tuple5<A, B, C, D, E>>() {

            @Override
            public Tuple5<A, B, C, D, E> call(A a, B b, C c, D d, E e) {

                return new Tuple5<>(a, b, c, d, e);
            }
        });
    }

    public static <A, B, C, D, E, F> Observable<Tuple6<A, B, C, D, E, F>> combineLatest(Observable<A> a, Observable<B> b, Observable<C> c, Observable<D> d, Observable<E> e, Observable<F> f) {

        return Observable.combineLatest(a, b, c, d, e, f, new Func6<A, B, C, D, E, F, Tuple6<A, B, C, D, E, F>>() {

            @Override
            public Tuple6<A, B, C, D, E, F> call(A a, B b, C c, D d, E e, F f) {

                return new Tuple6<>(a, b, c, d, e, f);
            }
        });
    }

    public static <A, B, C, D, E, F, G> Observable<Tuple7<A, B, C, D, E, F, G>> combineLatest(Observable<A> a, Observable<B> b, Observable<C> c, Observable<D> d, Observable<E> e, Observable<F> f, Observable<G> g) {

        return Observable.combineLatest(a, b, c, d, e, f, g, new Func7<A, B, C, D, E, F, G, Tuple7<A, B, C, D, E, F, G>>() {

            @Override
            public Tuple7<A, B, C, D, E, F, G> call(A a, B b, C c, D d, E e, F f, G g) {

                return new Tuple7<>(a, b, c, d, e, f, g);
            }
        });
    }

    public static <A, B, C, D, E, F, G, H> Observable<Tuple8<A, B, C, D, E, F, G, H>> combineLatest(Observable<A> a, Observable<B> b, Observable<C> c, Observable<D> d, Observable<E> e, Observable<F> f, Observable<G> g, Observable<H> h) {

        return Observable.combineLatest(a, b, c, d, e, f, g, h, new Func8<A, B, C, D, E, F, G, H, Tuple8<A, B, C, D, E, F, G, H>>() {

            @Override
            public Tuple8<A, B, C, D, E, F, G, H> call(A a, B b, C c, D d, E e, F f, G g, H h) {

                return new Tuple8<>(a, b, c, d, e, f, g, h);
            }
        });
    }

    public static <A, B, C, D, E, F, G, H, I> Observable<Tuple9<A, B, C, D, E, F, G, H, I>> combineLatest(Observable<A> a, Observable<B> b, Observable<C> c, Observable<D> d, Observable<E> e, Observable<F> f, Observable<G> g, Observable<H> h, Observable<I> i) {

        return Observable.combineLatest(a, b, c, d, e, f, g, h, i, new Func9<A, B, C, D, E, F, G, H, I, Tuple9<A, B, C, D, E, F, G, H, I>>() {

            @Override
            public Tuple9<A, B, C, D, E, F, G, H, I> call(A a, B b, C c, D d, E e, F f, G g, H h, I i) {

                return new Tuple9<>(a, b, c, d, e, f, g, h, i);
            }
        });
    }
}
