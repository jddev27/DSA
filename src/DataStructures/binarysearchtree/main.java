package DataStructures.binarysearchtree;

public class main {
    public static void main(String[] args) {
        BinarySearchTree mytree = new BinarySearchTree();
        mytree.insert(47);
        mytree.insert(21);
        mytree.insert(76);
        mytree.insert(18);
        mytree.insert(52);
        mytree.insert(82);

        mytree.insert(27);

        System.out.println(mytree.root.left.right.value);

        System.out.println(mytree.contains(27));
        System.out.println(mytree.contains(17));

    }
}
