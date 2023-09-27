package TREES;
public class PreOrder {
    static class  Node{
        public static Node root;
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]); //Create new node for left And Right Subtree
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        public static void preorder(Node root){
            if (root == null){
                return;
            }
            System.out.println(root.data+" "); //subse pahle ye print karega root ko ---> step 1
            preorder(root.left); //pahle left subtree mai --> step 2
            preorder(root.right);// then last mai right subtree --- step 3
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        tree.preorder(root) ;
    }
}
//output
//        1
//        2
//        4
//        5
//        3
//        6
//Time Complexity :- O(N)