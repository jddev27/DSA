package DataStructures.linkedlist;

public class Main {
    public static void main(String[] args){

        System.out.println("----------------LINKED-LIST  Test----------------");
        LinkedList myLinkList = new LinkedList(5);
        myLinkList.append(3);
        myLinkList.printList();
        myLinkList.getHead();
        myLinkList.getTail();
        myLinkList.getLength();

        System.out.println("----------------LINKED-LIST RemoveLast Test----------------");
        myLinkList.append(10);
        System.out.println(myLinkList.removeLast().value);
        System.out.println(myLinkList.removeLast().value);
        System.out.println(myLinkList.removeLast().value);
        System.out.println(myLinkList.removeLast());

        System.out.println("----------------LINKED-LIST Prepend Test----------------");
        myLinkList.append(10);
        myLinkList.append(15);
        myLinkList.printList();
        myLinkList.prepend(5);
        myLinkList.printList();

        System.out.println("----------------LINKED-LIST RemoveFirst Test----------------");
        myLinkList.printList();
        System.out.println(myLinkList.removeFirst().value);
        System.out.println(myLinkList.removeFirst().value);
        System.out.println(myLinkList.removeFirst().value);
        System.out.println(myLinkList.removeFirst());

        System.out.println("----------------LINKED-LIST get Test----------------");
        myLinkList.append(20);
        myLinkList.append(30);
        myLinkList.append(1);
        System.out.println(myLinkList.get(2).value);
        System.out.println(myLinkList.get(0).value);
        System.out.println(myLinkList.get(1).value);

        System.out.println("----------------LINKED-LIST set Test----------------");
        myLinkList.printList();
        System.out.println(myLinkList.set(2,100));
        myLinkList.printList();

        System.out.println("----------------LINKED-LIST Insert Test----------------");
        myLinkList.printList();
        System.out.println(myLinkList.insert(1,60));
        myLinkList.printList();
        System.out.println(myLinkList.insert(0,1));
        myLinkList.printList();
        System.out.println(myLinkList.insert(7,90));
        myLinkList.printList();

        System.out.println("----------------LINKED-LIST Insert Test----------------");
        myLinkList.printList();
        myLinkList.remove(2);
        System.out.println("----------------after remove ----------------");
        myLinkList.printList();
        myLinkList.remove(0);
        System.out.println("----------------after remove ----------------");
        myLinkList.printList();
        myLinkList.remove(2);
        System.out.println("----------------after remove ----------------");
        myLinkList.printList();

        System.out.println("----------------LINKED-LIST Reverse Test----------------");
        myLinkList.printList();
        myLinkList.append(50);
        myLinkList.append(80);
        myLinkList.append(90);
        System.out.println("----------------after append ----------------");
        myLinkList.printList();
        myLinkList.reverse();
        System.out.println("----------------after reverse ----------------");
        myLinkList.printList();

        System.out.println("----------------Find  Middle ----------------");
        System.out.println("middle node is: " + myLinkList.findMiddle().value);

        System.out.println("----------------Find  is linklist has a loop ----------------");
        System.out.println("middle node is: " + myLinkList.hasALoop());

        System.out.println("----------------get node  k steps from the end ----------------");
        int steps = 2;
        System.out.println("The node k: " + steps  +  " steps: " + "is: "
                + myLinkList.findKthFromEnd(steps).value);

        System.out.println("----------------DOUBLE LINKLIST ----------------");

        DoubleLinkedList mydoubleList = new DoubleLinkedList(1);

        System.out.println("----------------DOUBLE LINKLIST APPEND TEST ----------------");
        mydoubleList.append(2);
        mydoubleList.printList();

        System.out.println("----------------DOUBLE LINKLIST REMOVEATLAST TEST ----------------");
       //Return node 2
        System.out.println(mydoubleList.removeLast().value);
        //Return node 1
        System.out.println(mydoubleList.removeLast().value);
        //Return node null
        System.out.println(mydoubleList.removeLast());

        System.out.println("----------------DOUBLE LINKLIST PREPEND TEST ----------------");
        DoubleLinkedList dll = new DoubleLinkedList(2);
        dll.append(3);
        dll.printList();
        dll.prepend(1);
        dll.printList();

        System.out.println("----------------DOUBLE LINKLIST REMOVE FIRST TEST ----------------");
        dll.printList();
        dll.removeFirst();
        dll.printList();
        dll.removeFirst();
        dll.printList();
        dll.removeFirst();
        dll.printList();
        dll.removeFirst();
        dll.printList();

        System.out.println("----------------DOUBLE LINKLIST GET  TEST ----------------");
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);
        dll.printList();
        System.out.println(dll.get(1).value);
        System.out.println(dll.get(4).value);
        dll.printList();

        System.out.println("----------------DOUBLE LINKLIST SET  TEST ----------------");
        dll.set(2,6);
        dll.printList();

        System.out.println("----------------DOUBLE LINKLIST INSERT  TEST ----------------");
        dll.printList();



        dll.insert(2, 3);
        System.out.println("----------------DOUBLE LINKLIST after insert  TEST ----------------");
        dll.printList();
    }
}
