
public class AddTwoNumbers 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        String firstList = "";
        String secondList = "";
        String resultString;
        
        ListNode resultNode;
        
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        
        while (currentNode1 != null)
        {
            firstList += currentNode1.val;
            currentNode1 = currentNode1.next;
        }
        
        while (currentNode2 != null)
        {
            secondList += currentNode2.val;
            currentNode2 = currentNode2.next;
        }
        
        resultString = "" + (Integer.parseInt(firstList) + Integer.parseInt(secondList));
        
        for (int i = resultString.length() - 1; i >= 0; i--)
        {
            int j = Integer.parseInt("" + resultString.charAt(i));
            resultNode = new ListNode(j);
            if (i != 0) 
            {            	
//            		resultNode = resultNode.next;
            }
        }
        
        return resultNode;
    }
}

class ListNode 
{
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
 