
public class Order {
	
	public static final int MAX_NUMBERS_ORDERED = 10;
	private int qtyOrdered = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	
	
	void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < 10) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
		}else System.out.println("Khong the nhap them");
	}
	
	void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i] == disc) {
				for(int j = i; j < qtyOrdered; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
			}
		}
		qtyOrdered--;
	}
		
	float totalCost() {
		float total = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
}
