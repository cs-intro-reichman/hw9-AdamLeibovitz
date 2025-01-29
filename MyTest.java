public class MyTest {
    public static void main (String[] args) {
        LinkedList list;
        list = new LinkedList();
		list.addFirst(new MemoryBlock(1,1));
        list.addLast(new MemoryBlock(4,4));
        list.addLast(new MemoryBlock(5,5));
        list.addLast(new MemoryBlock(6,6));
        list.addLast(new MemoryBlock(7,7));
        System.out.println(list.toString());
        Node x = list.getNode(1);
        list.remove(x);
        System.out.println(list.toString());
        //MemorySpace m;
        //m = new MemorySpace(5);
        //System.out.println(m.toString());
    }
}