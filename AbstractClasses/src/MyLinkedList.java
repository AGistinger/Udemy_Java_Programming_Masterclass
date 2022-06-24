public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            // the list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                // new item is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // reached end, no next insert at end of list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem); // sets it to point back
                    return true;
                }
            } else if(comparison > 0) {
                // newItem is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem); // set previous entrys next to new item
                    newItem.setPrevious(currentItem.previous()); // set new items previous link to current items previous link
                    newItem.setNext(currentItem); // setting the next to the current item
                    currentItem.setPrevious(newItem); // setting the current items previous to the new item
                } else {
                    // the node without a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem); // point back to the new item
                    this.root = newItem; // setting head to the new item
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
            return false;
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
