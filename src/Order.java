
public class Order {
    private String[] orderList;// a content list of an order
   /**
    * This is the method for creat a order and return the content list of an order
    * @param
    */
    
    public String[] creatOrder() {
	    String[][] dishOptions = Data.getDishOptions();
	    String[] basicAdds = Data.getBasicAdds();
	    int[] dishChoice = Data.getDishChoice();
	    Boolean[] basicAddsChoice = Data.getBasicAddsChoice();
	    int spiciness = Data.getSpiciness();
	
	    String[] addonsName = Data.getAddonsName();
	    double[] addonsPrice = Data.getAddonsPrice();
	    int[] addonsnum = Data.getAddonsnum();
	    double totalPrice = Data.getTotalPrice();
	
	    int dishOptionsLen = dishOptions.length;
	    int basicAddsLen = basicAdds.length;
	    int addonsLen = addonsName.length;
	
	    orderList = new String[dishOptionsLen + basicAddsLen + addonsLen + 2];
		
	    for(int i = 0; i < dishOptionsLen; i++)
	        orderList[i] = String.format("%s: %s", dishOptions[i][0], dishOptions[i][dishChoice[i]]);
	    for(int i = 0; i < basicAddsLen; i++) {
	        if(basicAddsChoice[i] == true)
		        orderList[i + dishOptionsLen] = String.format("%s: Yes", basicAdds[i]);
	        else
		        orderList[i + dishOptionsLen] = String.format("%s: No", basicAdds[i]);
	    }
	    orderList[dishOptionsLen + basicAddsLen] = String.format("Spiciness: %d", spiciness);
	    for(int i = 0; i < addonsLen; i++) {
	        orderList[i + dishOptionsLen + basicAddsLen + 1] = String.format("%s: %d %.2f", addonsName[i], addonsnum[i], addonsnum[i] * addonsPrice[i]);
	    }
	    orderList[dishOptionsLen + basicAddsLen + addonsLen + 1] = String.format("Total: %.2f", totalPrice);
	
	    return orderList;
    }
    /**
     * @return the orderList
     */
    public String[] getOrderList() {
	return orderList;
    }
    
    public String toString() {
	double dishFixedPrice = Data.getDishFixedPrice();
	String str = String.format("Order\n----------\nDish fixed price: %.2f\n", dishFixedPrice);
	for (int i = 0; i < orderList.length; i++) {
	    str = str + orderList[i] + "\n";
	}
	return str;
	
    }
}
