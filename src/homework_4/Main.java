package homework_4;
/*
1. Необходимо превратить собранное на семинаре дерево поиска в полноценное левостороннее красно-черное дерево. И реализовать
в нем метод добавления новых элементов с балансировкой.
2. Красно-черное дерево имеет следующие критерии:
● Каждая нода имеет цвет (красный или черный)
● Корень дерева всегда черный
● Новая нода всегда красная
● Красные ноды могут быть только левым ребенком
● У красной ноды все дети черного цвета
3. Соответственно, чтобы данные условия выполнялись, после добавления элемента в дерево необходимо произвести
балансировку, благодаря которой все критерии выше станут валидными.
4. Для балансировки существует 3 операции – левый малый поворот, правый малый поворот и смена цвета.
 */

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
