package ic.doc.strategy;

import java.util.Iterator;

public class RunSequence implements Iterable<Integer> {

  private final Sequence sequence;

  public RunSequence(Sequence seq) {
    sequence = seq;
  }

  public int term(int i) {
    if (i < 0) {
      throw new IllegalArgumentException("Not defined for indices < 0");
    }

    return sequence.nextPositiveTerm(i);
  }

  public Iterator<Integer> iterator() {
    return new RunSequence.SequenceIterator();
  }

  private class SequenceIterator implements Iterator<Integer> {

    private int index = 0;

    @Override
    public boolean hasNext() {
      return true;
    }

    @Override
    public Integer next() {
      return term(index++);
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("remove is not implemented");
    }
  }
}
