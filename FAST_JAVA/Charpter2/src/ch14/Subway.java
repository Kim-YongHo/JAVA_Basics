package ch14;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int linNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusinfo() {
		System.out.println(lineNumber + "���� �°����� " + passengerCount + "���̰�, ������ " + money + "���Դϴ�.");
	}

}
