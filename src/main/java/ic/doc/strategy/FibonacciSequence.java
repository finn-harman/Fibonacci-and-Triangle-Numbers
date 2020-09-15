package ic.doc.strategy;

public class FibonacciSequence implements Sequence {

  @Override
  public int nextPositiveTerm(int i) {
    if (i < 2) {
      return 1;
    }
    return nextPositiveTerm(i - 1) + nextPositiveTerm(i - 2);
  }
}
