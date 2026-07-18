package access.ex;

public class ShoppingCart {

    private int itemCount = 0;
    private int max = 10;

    private Item[] items = new Item[max];

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("최대 초과");
            return;
        }

        items[itemCount] = item;
        itemCount++;

    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명:" + items[i].getName() + ",합계:" + items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합:" + (calculateTotalPrice()));
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
