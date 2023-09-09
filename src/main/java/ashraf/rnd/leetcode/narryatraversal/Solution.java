package ashraf.rnd.leetcode.narryatraversal;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

//        Integer []rootArray = {1,null,3,2,4,null,5,6};
        Integer[] rootArray = {1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14};

        System.out.println("rootArray = " + rootArray.length);
        System.out.println("rootArray = " + rootArray);

//        createNTree(rootArray);


    }

    public List<Integer> postOrder(Node root) {

        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (root == null) {
            return output;
        }

        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.addFirst(node.val);
            stack.addAll(node.children);
        }

        return output;

    }

    public List<Integer> postOrder(Node root, List<Integer> numberList) {
        if (root == null) return numberList;
        for (Node n : root.children) {
            postOrder(n, numberList);
        }
        numberList.add(root.val);
        return numberList;
    }

    private static Node createNTree(Integer[] rootArray) {

        Queue<Integer> numberTreeQueue = new LinkedList<>();
        Queue<Node> nodeQueue = new LinkedList<>();

        Node head;
        int i = 0;

        while (i < rootArray.length) {

            if (i == 0) {
                head = new Node(rootArray[i]);
                nodeQueue.add(head);
                numberTreeQueue.add(rootArray[i]);
                i++;
            } else if (rootArray[i] != null) {
                Node node = new Node(rootArray[i]);
                nodeQueue.add(node);
                numberTreeQueue.add(rootArray[i]);
                i++;
            } else {
                i++;


            }

        }

        System.out.println("nodeQueue = " + numberTreeQueue);


        return null;
    }

}
