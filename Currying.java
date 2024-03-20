package com.abinbev.b2b.discountsmgmt.helpers.context;

public class Currying<LEVEL1> {

  public LEVEL1 getValue() {
    return p;
  }

  private final LEVEL1 p;

  private Currying(LEVEL1 param) {
    this.p = param;
  }

  public interface ITest<K, X> {
    X apply(K param);
  }

  public <LEVEL2> Currying2<LEVEL2, LEVEL1> with(LEVEL2 param) {
    return new Currying2<>(param, p);
  }

  public <RESPONSE> Currying<RESPONSE> unwrapped(ITest<LEVEL1, RESPONSE> function) {
    return new Currying<>(function.apply(p));
  }

  public static <R> Currying<R> init(R param) {
    return new Currying<>(param);
  }

  public static class Currying2<LEVEL2, C1> {

    private final LEVEL2 p1;

    private final C1 p2;

    private Currying2(final LEVEL2 p1, final C1 p2) {
      this.p1 = p1;
      this.p2 = p2;
    }

    public interface ITest<K, Y, X> {
      X apply(K param, Y param2);
    }

    public <LEVEL3> Currying3<LEVEL3, LEVEL2, C1> with(LEVEL3 param) {
      return new Currying3<>(param, p1, p2);
    }

    public <RESPONSE> Currying<RESPONSE> unwrapped(ITest<LEVEL2, C1, RESPONSE> function) {
      return new Currying<>(function.apply(p1, p2));
    }
  }

  public static class Currying3<LEVEL3, C2, CC1> {

    private final LEVEL3 p1;

    private final C2 p2;

    private final CC1 p3;

    private Currying3(final LEVEL3 p1, final C2 p2, final CC1 p3) {
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
    }

    public interface ITest<K, Y, L, X> {
      X apply(K param, Y param2, L param3);
    }

    public <LEVEL4> Currying4<LEVEL4, LEVEL3, C2, CC1> with(LEVEL4 param) {
      return new Currying4<>(param, p1, p2, p3);
    }

    public <RESPONSE> Currying<RESPONSE> unwrapped(ITest<LEVEL3, C2, CC1, RESPONSE> function) {
      return new Currying<>(function.apply(p1, p2, p3));
    }
  }

  public static class Currying4<LEVEL4, C3, CC2, CCC1> {

    private final LEVEL4 p1;

    private final C3 p2;

    private final CC2 p3;

    private final CCC1 p4;

    private Currying4(final LEVEL4 p1, final C3 p2, final CC2 p3, final CCC1 p4) {
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
      this.p4 = p4;
    }

    public interface ITest<K, Y, L, I, X> {
      X apply(K param, Y param2, L param3, I param4);
    }

    public <LEVEL5> Currying5<LEVEL5, LEVEL4, C3, CC2, CCC1> with(LEVEL5 param) {
      return new Currying5<>(param, p1, p2, p3, p4);
    }

    public <RESPONSE> Currying<RESPONSE> unwrapped(
        ITest<LEVEL4, C3, CC2, CCC1, RESPONSE> function) {
      return new Currying<>(function.apply(p1, p2, p3, p4));
    }
  }

  public static class Currying5<LEVEL5, C4, CC3, CCC2, CCCC1> {

    private final LEVEL5 p1;

    private final C4 p2;

    private final CC3 p3;

    private final CCC2 p4;

    private final CCCC1 p5;

    public Currying5(final LEVEL5 p1, final C4 p2, final CC3 p3, final CCC2 p4, final CCCC1 p5) {
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
      this.p4 = p4;
      this.p5 = p5;
    }

    public interface ITest<K, Y, L, I, H, X> {
      X apply(K param, Y param2, L param3, I param4, H param5);
    }

    public <RESPONSE> Currying<RESPONSE> unwrapped(
        ITest<LEVEL5, C4, CC3, CCC2, CCCC1, RESPONSE> function) {
      return new Currying<>(function.apply(p1, p2, p3, p4, p5));
    }
  }
}
