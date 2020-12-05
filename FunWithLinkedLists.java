import java.util.LinkedList;

public class FunWithLinkedLists {
	public void runProgram() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(19, 20);
		System.out.println(list.peek());
		list.poll();
		list.pop();
		list.remove((Integer) 8);
		list.push(7);
		list.addLast(17);
		System.out.println(list);
		System.out.println(list.size());
	}
}
