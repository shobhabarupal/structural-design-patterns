package structuralDesignPattern.Bridge;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T> {


    private LinkedList<T> list;  //This is the composition link between abstraction and implementation.

    public Queue(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }
}
