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
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    // sets it to point back
                    return true;
                }
            } else if(comparison > 0) {
                // newItem is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous()); // set previous entrys next to new item
                    // set new items previous link to current items previous link
                    newItem.setNext(currentItem).setPrevious(newItem); // setting the next to the current item
                    // setting the current items previous to the new item
                } else {
                    // the node without a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    // point back to the new item
                    this.root = newItem; // setting head to the new item
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison == 0) {
                // found item to delete
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison < 0) {
                currentItem = currentItem.next();
            } else {
                // comparison > 0
                // We are at an item greater than the one to be deleted
                // So the item is not in the list
                return false;
            }
        }
        // We have reached the end of the list without finding item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty");
        } else {
            while(root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
