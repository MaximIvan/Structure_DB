public class homework_3 {
// Необходимо реализовать метод разворота связного списка
//(двухсвязного или односвязного на выбор).
    public static void main(String[] args) {
    dList list = new dList();
    list.pushBack(1);
    list.pushBack(6);
    list.pushBack(3);
    list.pushBack(2);
    list.print();
    System.out.println("\n~~~~~~~~~~~~~~~");
    list.revert();
    list.print();
}

    public static class dList {
        private Node Head;
        private Node Tail;

        private class Node {
            private int value;
            private Node next;
            private Node prev;
        }

        void pushBack(int value) {
            Node node = new Node();
            node.value = value;

            if (Tail != null) {
                Tail.next = node;
                node.prev = Tail;
            } else {
                Head = node;
            }

            Tail = node;
        }

        void print() {
            Node current = Head;
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
        }

        public void revert() {
            Node node = Head;
            Node temp = Head;
            Head = Tail;
            Tail = temp;
            while (node != null) {
                temp = node.next;
                node.next = node.prev;
                node.prev = temp;
                node = node.prev;
            }
        }
    }
}


