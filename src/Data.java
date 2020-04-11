/**
 * Title      : Data.java
 * Description: use this to store the data from the interface
 * Copyright  : Copyright (c) 2020
 * @version  1.0
 */

public class Data {
    //dish personalize
    //list of options
    private static String[][] dishOptions; //[sequence of options][0 for the name of the option, 1,2,3... for the chioces of the option]
    private static String[] basicAdds;//like boiled egg
    //options choice
    private static int[] dishChoice;//[sequence of options] => 0 is invalid! 1,2,3... for the corresponds choice of the option, corresponds to dishPErsonalize
    private static Boolean[] basicAddsChoice;
    //remaining
    private static int[][] dishOptionsRemain;//[sequence of options][0 not used! 1,2,3... for the remaining number of the corresponds choices of the option] corresponds to dishPersonalize
    private static int[] basicAddsRemain;
    private static double dishFixedPrice;
    
    //addons
    private static String[] addonsName;
    private static double[] addonsPrice;
    private static int[] addonsRemain;
    private static int[] addonsnum;//numbers corresponds to the addons String that the user ordered, 0 for not.
    
    private static int spiciness;
    private static double totalPrice;
    
    //membership
    private static String username = "";
    private static String password = "";
    private static String email = "";
    private static String phoneNum="";
    private static int stamps = 0;
    
    
    public static void setAll() {
    	//以下内容都需要调用file中的读取函数读取数据库
    	String[][] dishOptions = {{"Soup", "Tonkotsu", "Shoyu", "Shio"}, 
    		    {"Noodles", "Soft", "Medium", "Firm"}, 
    		    {"Spring onion", "No please", "Just a little", "A lot!"}};
    	String[] basicAdds = {"Nori", "Chashu", "Boiled egg"};
    	int[][] dishOptionsRemain = {{0, 10, 10, 10}, {0, 10, 10, 10}, {0, 10, 10, 10}};
    	int[] basicAddsRemain = {10, 10, 10};
    	double dishFixedPrice = 9.99;
    	String[] addonsName = {"Extra Nori", "Extra boiled egg", "Bamboo shoots", "Extra Chashu"};
    	double[] addonsPrice = {1, 1, 1, 2};
    	int[] addonsRemain = {10, 10, 10, 10};
    	int spiciness = 5;
    	
    	//
    	setDishOptions(dishOptions, dishFixedPrice, dishOptionsRemain);
    	setBasicAdds(basicAdds, basicAddsRemain);
    	setAddons(addonsName, addonsPrice, addonsRemain);
    }
    
    public static void setMenbership(String[] str) {
    	setUsername(str[0]);
    	setPassword(str[1]);
    	setEmail(str[2]);
    	setPhoneNum(str[3]);
    	setStamps( Integer.parseInt(str[4]));
    }
    
    /**
     * @return the dishName arrays String
     */
    public static String[][] getDishOptions() {
	return dishOptions;
    }
    
    /**
     * @return the basicAdds
     */
    public static String[] getBasicAdds() {
	return basicAdds;
    }
    
    /**
     * @return the dishChoice [sequence of options] => 0 not used! 1,2,3... for the corresponds choice of the option
     */
    public static int[] getDishChoice() {
	return dishChoice;
    }
    
    /**
     * @return the basicAddsChoice
     */
    public static Boolean[] getBasicAddsChoice() {
	return basicAddsChoice;
    }
    
    /**
     * @param optionsNum the sequence number of the options
     * @param dishChoice the dishChoice to set [0 not used! 1,2,3... for the corresponds choice of the option]
     */
    public static void setDishChoice(int optionsNum, int choiceNum) {
	Data.dishChoice[optionsNum] = choiceNum;
    }

    /**
     * @param basicAddsNum the sequence number of basicadds
     * @param basicAddsChoice the basicAddsChoice to set
     */
    public static void setBasicAddsChoice(int basicAddsNum, Boolean basicAddsChoice) {
	Data.basicAddsChoice[basicAddsNum] = basicAddsChoice;
    }
 
    /**
     * @param dishName the name of dish
     * @param dishPrice the price of dish
     * @param dishRemain the number of dish remaining
     */
    public static void setDishOptions(String[][] dishOptions, double dishFixedPrice, int[][] dishOptionsRemain) {
	Data.dishOptions = dishOptions;
	Data.setDishFixedPrice(dishFixedPrice);
	Data.dishOptionsRemain = dishOptionsRemain;
	Data.dishChoice = new int[Data.dishOptions.length];//获取菜品后，初始化选择
	for (int i = 0; i < Data.dishOptions.length; i++) //购买选择初始化为0
	    Data.dishChoice[i] = 0;
    }
    
    public static void setBasicAdds(String[] basicAdds, int[] basicAddsRemain) {
	Data.basicAdds = basicAdds;
	Data.basicAddsRemain = basicAddsRemain;
	Data.basicAddsChoice = new Boolean[Data.basicAdds.length];//获取basic adds后，初始化选择
	for (int i = 0; i < Data.basicAdds.length; i++) //选择初始化为false
	    Data.basicAddsChoice[i] = false;
    }

    /**
     * @return the dishOptionsRemain
     */
    public static int[][] getDishOptionsRemain() {
	return dishOptionsRemain;
    }

    /**
     * @return the basicAddsRemain
     */
    public static int[] getBasicAddsRemain() {
	return basicAddsRemain;
    }
    
    /**
     * @return the dishFixedPrice
     */
    public static double getDishFixedPrice() {
	return dishFixedPrice;
    }

    /**
     * @param dishFixedPrice the dishFixedPrice to set
     */
    public static void setDishFixedPrice(double dishFixedPrice) {
	Data.dishFixedPrice = dishFixedPrice;
    }

    /**
     * @return the addonsName
     */
    public static String[] getAddonsName() {
	return addonsName;
    }

    /**
     * @return the addonsPrice
     */
    public static double[] getAddonsPrice() {
	return addonsPrice;
    }

    /**
     * @return the addonsRemain
     */
    public static int[] getAddonsRemain() {
	return addonsRemain;
    }
    
    /**
     * @param addonsName the name of addons
     * @param addonsPrice the price of addons
     * @param addonsRemain the number of addons remaining
     */
    public static void setAddons(String[] addonsName, double[] addonsPrice, int[] addonsRemain) {
	Data.addonsName = addonsName;
	Data.addonsPrice = addonsPrice;
	Data.addonsRemain = addonsRemain;
	Data.addonsnum = new int[Data.addonsPrice.length];//获取菜品后，初始化购买数量
	for (int i = 0; i < addonsPrice.length; i++) //购买数量初始化为0
	    Data.addonsnum[i] = 0;
    }
    
    /**
     * @param dishNo the No. of dish
     * @param ordernum how many dish the user ordered
     */
    public static void setAddonsnum(int addonsNo, int addonsnum) {
	Data.addonsnum[addonsNo] = addonsnum;
    }
    
    /**
     * @return the addons number that user ordered
     */
    public static int[] getAddonsnum() {
	return addonsnum;
    }

    /**
     * @return the spiciness
     */
    public static int getSpiciness() {
	return spiciness;
    }

    /**
     * @param spiciness the spiciness to set
     */
    public static void setSpiciness(int spiciness) {
	Data.spiciness = spiciness;
    }
    
    /**
     * @return the totalPrice
     */
    public static double getTotalPrice() {
	totalPrice = 0;
	for (int i = 0; i < addonsPrice.length; i++)
	    totalPrice = totalPrice + addonsPrice[i] * (double)addonsnum[i];
	totalPrice = totalPrice + dishFixedPrice;
	return totalPrice;
    }

    
    //membership
    
    /**
     * @return the username
     */
    public static String getUsername() {
	return username;
    }

    /**
     * @param username the username to set
     */
    public static void setUsername(String username) {
	Data.username = username;
    }

    /**
     * @return the password
     */
    public static String getPassword() {
	return password;
    }

    /**
     * @param password the password to set
     */
    public static void setPassword(String password) {
	Data.password = password;
    }
    
    /**
     * @return the email
     */
    public static String getEmail() {
	return email;
    }

    /**
     * @param email the email to set
     */
    public static void setEmail(String email) {
	Data.email = email;
    }

    /**
     * @return the phoneNum
     */
    public static String getPhoneNum() {
	return phoneNum;
    }

    /**
     * @param phoneNum the phoneNum to set
     */
    public static void setPhoneNum(String phoneNum) {
	Data.phoneNum = phoneNum;
    }

    /**
     * @return the stamps
     */
    public static int getStamps() {
	//get stamps from memberlist here
	return stamps;
    }
    
    /**
     * @param the stamps
     */
    public static void setStamps(int stamps) {
    	Data.stamps=stamps;
    }
}
