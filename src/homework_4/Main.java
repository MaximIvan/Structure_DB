package homework_4;

public class Main {
    public static void main(String[] args) {
        RBT tree = new RBT();
        tree.add(14);
        tree.add(3);
        TreePrinter.print(tree.getRoot(), "");

//        if (tree.add(3)) {
//            TreePrinter.print(tree.getRoot(), "");
//        } else {
//            System.out.println("Error: this value already exists in tree");
//        }

        tree.add(2);
        System.out.println("----------");
        TreePrinter.print(tree.getRoot(), "");

        tree.add(5);
        System.out.println("----------");
        TreePrinter.print(tree.getRoot(), "");

        tree.add(4);
        System.out.println("----------");
        TreePrinter.print(tree.getRoot(), "");

        tree.add(10);
        System.out.println("----------");
        TreePrinter.print(tree.getRoot(), "");

        tree.add(9);
        System.out.println("----------");
        TreePrinter.print(tree.getRoot(), "");

        tree.add(7);
        System.out.println("----------");
        TreePrinter.print(tree.getRoot(), "");
    }
}
