package homework_4;

public class Node {
        int value;
        homework_4.Node leftChild;
        homework_4.Node rightChild;
        Color color;

        public Node(int value) {
            this.value = value;
            this.color = Color.RED;
        }
}
