public class basic {
    public static void main(String[] args) {
        // System.out.println("Hello, WEBCAMP!");
        // System.out.println("Hello, Java!");

        //----------------------------------------

        // int num1;
        // String str1;

        // num1 = 10;
        // str1 = "Hello, World";

        // System.out.println(num1);
        // System.out.println(str1);

        // num1 = 20;
        // System.out.println(num1);

        // int num2 = 30;

        // System.out.println(num2);

        //----------------------------------------

        // final int MIN_NUMMBER = 10;
        // System.out.println(MIN_NUMMBER);

        //----------------------------------------

        // String string1;

        // string1 = "テスト";
        // System.out.println(string1 + "の文字数:" + string1.length());

        // string1 = "";
        // System.out.println(string1 + "の文字数:" + string1.length());

        // string1 = null;
        // System.out.println(string1 + "の文字数:" + string1.length());
        
        //-----------------------------------------
//    	final int LUCK_NUMMBER = 7;
//    	String name = "hiro";
//    	System.out.println(name);
//    	name = "mac";
//    	System.out.println(name);
//    	
//    	System.out.println(LUCK_NUMMBER);
    	
    	 //-----------------------------------------
    	
//    	long long1 = 100L;
//    	System.out.println(long1);
//    	
//    	double double1 = 50.0;
//    	System.out.println(double1);
//    	
//    	boolean boolean1 = true;
//    	System.out.println(boolean1);
    	
    	//-----------------------------------------
    	
//    	int val = 2+5;
//    	System.out.println(val);
//    	val++;
//    	System.out.println(val);
//    	val *= 5;
//    	System.out.println(val);
//    	
//    	boolean bool;
//    	bool = (val == 50);
//    	System.out.println(bool);
//    	bool = (val < 50) && (val%10 == 0);
//    	System.out.println(bool);
    	
    	//-----------------------------------------
    	
//    	int distance = 11;
//    	if (distance <= 5) {
//    		System.out.println("とても近いです");
//    	} else if (distance >5 && distance <= 10) {
//    		System.out.println("近いです");
//    	} else if (distance >10 && distance <= 15) {
//    		System.out.println("遠いです");
//    	} else {
//    		System.out.println("長いです");
//    	}
    	
//    	String color = "a";
//    	switch (color) {
//    	case "red":
//    		System.out.println("赤信号です");
//    		break;
//    	case "yellow":
//    		System.out.println("黄信号です");
//    		break;
//    	case "blue":
//    		System.out.println("青信号です");
//    		break;
//    	default:
//    		System.out.println("あ");
//    	}
    	//-----------------------------------------
    	
//    	int nummber = 1;
//    	while (nummber < 50) {
//    		nummber *= 2;
//    		System.out.println("basic" + nummber);
//    	}
    	
    	//-----------
//    	for (int nummber = 1; nummber <= 5; nummber++) {
//    		System.out.println("basic =" + nummber);
//    	}
    	
//    	int nummber = 1;
//    	while (nummber < 5) {
//    		System.out.println(nummber * nummber);
//    		nummber++;	
//    	}
//    	int array[] = {1,5,10,15};
//    	for (int i = 0; i < array.length; i++) {
//    		System.out.println(array[i]);
//    	}
    	//------------------------
    	
//    	double fuelCost = 12.5;
//    	
//    	double fuelAmount = 55.0;
//    	
//    	Car car = new Car (fuelCost, fuelAmount);
//    	
//    	car.move(20);
//    	System.out.println("残量は、" + car.getFuelAmount() + "です"); 
    	
    	//北ソフト工房練習問題 	
    	
//    	System.out.println("Hello, World");
//    	
//    	int x = 11;
//    	
//    	System.out.println("x=" + x);
    	
//    	int x = 13;
//    	int y = 17;
//    	
//    	System.out.println("x=" + x + "," + "y=" + y);
    	
//    	int x = 13+17;
//    	
//    	System.out.println(x);
//    	
//    	System.out.println(13*17);
    	
//    	int x = 7;
//    	
//    	x = x*3;
//    	
//    	System.out.println(x);
//    	
//    	x = x/2;
//    	
//    	System.out.println(x);
    	
//    	int x = 3;
//    	int y = 7;
//    	
//    	x = 7;
//    	y = 3;
//
//    	System.out.println( "x=" + x + ",y=" + y );
    	
//    	int x = 19;
//        int y = 23;
//        
//        int z = x*y;
//        
//        System.out.println(z);
    	
//    	int x = 2;
//    	
//    	System.out.println(x*2 + "," + x*3 + "," + x*4);
    	
//    	int x = 9;
//    	
//    	System.out.println(x/3 + "," + x%2);
    	
//    	int x = 2;
//    	x++;
//    	System.out.println(x);
//    	x--;
//    	x--;
//    	System.out.println(x);
    	
//    	String s = "Hello World";
//    	System.out.println(s);
//    	
//    	int x = 5;
//    	System.out.println(x);
    	
//    	int x = 2;
//    	x *= x;
//    	System.out.println(x);
//    	x *= x;
//    	System.out.println(x);
//    	x *= x;
//    	System.out.println(x);
    	
//    	int x = 6;
//    	int y = 4;
//    	
//    	System.out.println(x + y);
//    	System.out.println(x - y);
//    	System.out.println(x * y);
//    	System.out.println(x / y);
//    	System.out.println(x % y);
    	
//    	int sum = 0;
//    	int[] data = {2,6};
//    	for (int i = 0; i < data.length; i++) {
//    		sum += data[i];
//    	}
//    	int ave = sum/data.length;
//    	System.out.println(ave);
    	
//    	int age = 26;
//    	System.out.println(age*365);
    	
//    	int x = 6;
//    	int y = 3;
//    	
//    	if (x > y) {
//    		System.out.println("xはyより大きいです");
//    	} else {
//    		System.out.println("xはYより小さいです");
//    	}
    	
//    	int x = 6;
//    	int y = 6;
//    	
//    	if (x > y) {
//    		System.out.println("xはyより大きいです");
//    	} else if (x == y) {
//    		System.out.println("xとyは等しいです");
//    	} else {
//    		System.out.println("xはyより小さいです");
//    	}
//    	
//    	int x = 7;
//    	
//    	if (x % 2 == 0) {
//    		System.out.println("偶数");
//    	} else {
//    		System.out.println("奇数");
//    	}
    	
//    	int x = -6;
//    	
//    	if (x % 2 == 0) {
//    		if (x > 0) {
//    			System.out.println("正の偶数");
//    		} else {
//    			System.out.println("負の偶数");
//    		}
//    	} else {
//    		if (x > 0) {
//    			System.out.println("正の奇数");
//    		} else {
//    			System.out.println("負の奇数");
//    		}
//    	}
    	
//    	int result = 59;
//    	
//    	if (result >= 60) {
//    		System.out.println("合格");
//    	} else {
//    		System.out.println("不合格");
//    	}
//    	
//    	int result2 = 79;
//    	
//    	if (result2 >= 80) {
//    		System.out.println("大変よくできました");
//    	} else if (result2 >= 60 && result2 < 80) {
//    		System.out.println("よくできました");
//    	} else {
//    		System.out.println("残念でした");
//    	}
//    	
//    	int result3 = 79;
//    	
//    	if (result3 >= 80) {
//    		System.out.println("優");
//    	} else if (result3 >= 70 && result3 < 80) {
//    		System.out.println("良");
//    	} else if (result3 >= 60 && result3 < 70) {
//    		System.out.println("可");
//    	} else {
//    		System.out.println("負荷");
//    	}
    	
//    	String spam = "SPAM";
//    	
//    	for ( int i = 1; i <= 10; i++) {
//    		System.out.println(spam);
//    	}
    	
//    	for (int i = 1; i < 9; i++) {
//    		System.out.print(3 * i + " ");
//    	}
    	
//    	int x = 1;
//    	
//    	for (int i = 1; i <= 8; i++) {
//    		x *= 2;
//    		
//    		System.out.println("2の" + i + "乗=" + x);
//    	}
    	
//    	int number = 1;
//    	
//    	while (number < 50) {
//    		number *= 2;
//    		System.out.println("while01=" + number);
//    	}
    	
//    	for (int number = 1; number <= 5; number++) {
//    		System.out.println("For01=" + number);
//    	}
    	
//    	int[] array = {1,2,3,4,5};
//    	
//    	for (int number : array) {
//    		System.out.println("For02=" + number);
//    	}
    	
//    	int num = 1;
//    	while (num <= 5) {
//    		System.out.println(num * num);
//    		num++;
//    	}
    	
    	int[] array = {1,2,3,4};
    	for (int num = 0; num < array.length; num++) {
    		if (num % 2 == 0) {
    			continue;
    		}
    		System.out.println(num);
    	}
    	
    	
    }
}
