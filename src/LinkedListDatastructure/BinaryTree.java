package LinkedListDatastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    NodeTree root;

    public BinaryTree() {
        Scanner sc = new Scanner(System.in);
        root = CreateTree(sc);

    }

    NodeTree CreateTree(Scanner sc) {
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        NodeTree nt = new NodeTree(data);
        nt.left = CreateTree(sc);
        nt.right = CreateTree(sc);
        return nt;
    }

    void display() {
//      preOrder(root);
        inOrder(root);
    }

    void preOrder(NodeTree root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(NodeTree root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void levelOrder(NodeTree root) {
        Queue<NodeTree> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            NodeTree f = q.poll();
            System.out.println(f.data);
            if (f.left != null) {
                q.offer(f.left);
            }
            if (f.right != null) {
                q.offer(f.right);
            }

        }
    }
}

class NodeTree {
    int data;
    NodeTree left;
    NodeTree right;

    NodeTree(int d) {
        data = d;
        left = right = null;
    }

}
