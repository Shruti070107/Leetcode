/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

// T.C. - O(N)  && S.C.- O(1)
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        insertCopy(head);
        connectRandom(head);
        return getDeepCopy(head);
    }

    private void insertCopy(Node head){
        Node temp= head;
        while(temp != null){
            Node copyNode = new Node(temp.val);
            copyNode.next= temp.next;
            temp.next= copyNode;
            temp= copyNode.next;
        }
    }

    private void connectRandom(Node head){
        Node temp= head;
        while(temp != null){
            Node copyNode = temp.next;
            if(temp.random !=null){
                copyNode.random= temp.random.next;
            }
            temp= temp.next.next;
        }
    }

    private Node getDeepCopy(Node head){
        Node dummy= new Node(-1);
        Node rest= dummy;
        Node temp= head;
        while(temp != null){
            Node copyNode = temp.next;
            temp.next= copyNode.next;
            rest.next= copyNode;
            rest= copyNode;
            temp=temp.next;
        }
    return dummy.next;
    }
}

/*
// T.C. - O(N)  && S.C.- O(N)

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) 
           return null;
        Map<Node, Node> map = new HashMap<>();

        // Create a copy of every node
        Node curr = head;
        while(curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Connect next and random pointers
        curr = head;
        while(curr != null) {
            Node copy= map.get(curr);
            copy.next= map.get(curr.next);
            copy.random= map.get(curr.random);
            curr =curr.next;
        }

    return map.get(head);
    }
}
 */