package com.sorted_collections;

/**
 * Challenge:
 * Modify the program so that adding items to the shopping basket doesn't
 * actually reduce the stock count, but instad, reserves the requested
 * number of items.
 *
 * You will need to add a "reserved" field to the StockItem class to store
 * the number of items reserved.
 *
 * Items can continue to be added to the basket, but it should not be possible
 * to reserve more than the available stock of any item.  An item's available stock
 * is the stock count less the reserved amount.
 *
 * The stock count for each item is reduced when a basket is checked out, at which
 * point all reserved items int he basket will have their actual stock count reduced.
 *
 * Once checkout is complete, the contents of the basket are also cleared.
 *
 * It should also be possible to "unreserve" items that were added to the basket by
 * mistake.
 *
 * The program shold prevent any attempt to unreserve more items than were
 * reserved for a basket.
 *
 * Add to to Main that will unreserve items after they have been added to the basket,
 * as well as unreserving items that have not been added to make sure the code
 * can cope with invalid requests like that.
 *
 * After checking out the baskets, display the full stock list and the contents of each
 * basket that you created.
 */

public class MainChallenge {
    public static void main(String[] args) {

    }
}
