class AddTwoNumbers{

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
        ListNode res_head = new ListNode(-1);
        ListNode resRunner = res_head; // result list runner
        int remainder = 0; // remainder of each step sum
        
        while(l1 != null || l2 != null){
            
             int val_1 = l1 == null ? 0 : l1.val;
             int val_2 = l2 == null ? 0 : l2.val;

            int sum = (val_1 + val_2) + remainder;
            int firstDigit = sum % 10;
           
            remainder = sum / 10;
            
            resRunner.next = new ListNode(firstDigit);
            resRunner = resRunner.next;
            
            if (l1 != null)  l1 = l1.next;
            if (l2 != null)  l2 = l2.next;
        }
        
        
        if(remainder > 0)
            resRunner.next = new ListNode(remainder);
        
        return res_head.next;
    }
 }
