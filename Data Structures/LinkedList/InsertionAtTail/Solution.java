


    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
       // newNode.data=data;
        newNode.next=null;

        if(head==null){
            head=newNode;
           return head;
           
        }
       // newNode.next=null;
        
            SinglyLinkedListNode curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
              curr.next=newNode;  
            
             
            return head;
        
    }

