
public class Four {
    public static void main(String[] args) {
        Node[] nodes = new Node[] { new Number(12, 2), new Number(42, 42) };
        for (Node node : nodes) {
            System.out.println(node.value());
        }
    }
}

abstract class Node {
    int pos;

    Node(int pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Node{" + "pos=" + pos + '}';
    }

    abstract int value();
}

final class Number extends Node {
    int value;

    Number(int pos, int value) {
        super(pos);
        this.value = value;
    }

    @Override
    int value() {
        return value;
    }
}
