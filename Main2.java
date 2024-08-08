class Node{
  int data = 0;
  Node left = right = null;

  Node(int val){
    this.data = val;
    left = right = null;
  }
    
}

class Main{

  public static void inOrder(Node root){
    if(root == null){
      return;
    }

    inOrder(root.left);
    System.out.print(root.data);
    inOrder(root.right);
  }
  
  public static void preOrder(Node root){
    if(root == null){
      return;
    }

    System.out.print(root.data);
    preOrder(root.left);
    preOrder(root.right);
  }
  
  public static void postOrder(Node root){
    if(root == null){
      return;
    }

    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data);
  }
  
  public static void main(String[] args){
    Node n1 = new Node(4);
    n1.left = new Node(2);
    n1.left.left = new Node(3);
    n1.left.left.right = new Node(9);
    n1.left.left.right.left = new Node(1);
    n1.left.right.left = new Node(5);
    n1.right.left = new Node(7);
    n1.right.right = new Node(6);
    n1.right.right.left = new Node(8);

    inOrder(n1);
    preOrder(n1);
    postOrder(n1);
  }
}
