/**
 * Implements the doubly-linked list of messages for Teletext
 */

import java.awt.Graphics;

public class TeletextList
{
  private ListNode2 heading, topNode;

  /**
   * Creates a circular list of headlines.
   * First creates a circular list with one node, "Today's headlines:".
   * Saves a reference to that node in heading.
   * Adds a node holding an empty string before heading
   * and another node holding an empty string after heading.
   * Appends all the strings from headlines to the list, after
   * the blank line that follows heading,
   * preserving their order.  Sets topNode equal to heading.
   */
  public TeletextList(String[] headlines)
  {
    ListNode2 first = new ListNode2("Today's headlines:", null, null);
    heading = first;
    ListNode2 before= new ListNode2("", null, heading);
    heading.setPrevious(before);
    ListNode2 after = new ListNode2("", heading, null);
    heading.setNext(after);
    ListNode2 current = new ListNode2(headlines[0], after, null);
    after.setNext(current);
    for(int i=1;i<headlines.length;i++){
    	ListNode2 temp = new ListNode2(headlines[i], current, null);
    	current.setNext(temp);
    	current = temp;
    }
    current.setNext(before);
    before.setPrevious(current);
    topNode = heading;
    	
  }

  /**
   * Inserts a node with msg into the headlines list after the blank
   * line that follows heading.
   */
  public void insert(String msg)
  {
    addAfter(heading.getNext(), msg);
;  }

  /**
   * Deletes the node that follows topNode from the headlines list,
   * unless that node happens to be heading or the node before or after
   * heading that holds a blank line.
   */
  public void delete()
  {
    if(!topNode.getNext().getValue().equals("") && !topNode.getNext().getValue().equals(heading.getValue())){
    	topNode.setNext(topNode.getNext().getNext());
    	topNode.getNext().getNext().setPrevious(topNode);
    }
  }

  /**
   * Scrolls up the headlines list, advancing topNode to the next node.
   */
  public void scrollUp()
  {
    topNode = topNode.getNext();
  }

  /**
   * Adds a new node with msg to the headlines list before a given node.
   * Returns a referenece to the added node.
   */
  private ListNode2 addBefore(ListNode2 node, String msg)
  {
    ListNode2 newNode = new ListNode2(msg, node.getPrevious(), node);
    node.getPrevious().setNext(newNode);
    node.setPrevious(newNode);
    return newNode;
  }

  /**
   * Adds a new node with msg to the headlines list after a given node.
   * Returns a referenece to the added node.
   */
  private ListNode2 addAfter(ListNode2 node, String msg)
  {
    ListNode2 newNode = new ListNode2(msg, node, node.getNext());
    node.getNext().setPrevious(newNode);
    node.setNext(newNode);
    return newNode;
  }

  /**
   * Removes a given node from the list.
   */
  private void remove(ListNode2 node)
  {
    node.getPrevious().setNext(node.getNext());
  }

  /**
   * Draws nLines headlines in g, starting with topNode at x, y
   * and incrementing y by lineHeight after each headline.
   */
  public void draw(Graphics g, int x, int y, int lineHeight, int nLines)
  {
    ListNode2 node = topNode;
    for (int k = 1; k <= nLines; k++)
    {
      g.drawString((String)node.getValue(), x, y);
      y += lineHeight;
      node = node.getNext();
    }
  }
}
