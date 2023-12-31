package TREES;
// Correct
public class Inorder {
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
        public static void inorder(Node root){
            if (root == null){
                return;
            }
            inorder(root.left); //Left SubTree
            System.out.println(root.data+" "); // root Node
            inorder(root.right); // Right SubTree

        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
       Node root = tree.buildTree(nodes);

       tree.inorder(root);
//        System.out.println(root.data);  //1
    }
}
