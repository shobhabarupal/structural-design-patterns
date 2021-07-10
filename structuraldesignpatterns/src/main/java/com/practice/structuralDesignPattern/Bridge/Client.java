package structuralDesignPattern.Bridge;

public class Client {

	public static void main(String[] args) {
		FifoCollection<String> fifoCollection = new Queue(new ArrayLinkedList());

		fifoCollection.offer("gaveesh");
		fifoCollection.offer("gupta");

		System.out.println(fifoCollection.poll());
		System.out.println(fifoCollection.poll());
		System.out.println(fifoCollection.poll());

		
	}

}
