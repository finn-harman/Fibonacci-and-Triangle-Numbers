package ic.doc.templatemethod;

public class FibonacciSequence extends Sequence {

  @Override
  protected int nextPositiveTerm(int i) {
    if (i < 2) {
      return 1;
    }
    return nextPositiveTerm(i - 1) + nextPositiveTerm(i - 2);
  }
}
