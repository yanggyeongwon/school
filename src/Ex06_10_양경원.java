

abstract class Employee2{
		String empno,name;
		int pay,bonus;
		
		public Employee2(String empno, String name, int pay, int bonus) {
			this.empno = empno;
			this.name = name;
			this.pay = pay;
			this.bonus = bonus;
		}
		abstract double getMonthPay();
		
		public void show() {
			System.out.println("�Ҽ� : " +empno);
			System.out.println("�̸� : " +name);
			System.out.println("�ݾ� : " +pay);
			
		}
	}
	class FullTime extends Employee2{
		double bonus;
		
		public FullTime(String empno,String name,int pay,int bonus) {
			super(empno,name,pay,bonus);
			this.bonus = bonus;
		}
		@Override
		double getMonthPay() {
			return bonus = (pay/(double)12) + (bonus/(double)12);
		}
		public void show() {
			super.show();
			System.out.println("���ʽ� :"+ bonus);
			System.out.println("�ٸӴ� : "+  (pay/(double)12) + (bonus/(double)12));	
		}
		
	}
	class Contract extends Employee2{
		int hireYear;
		
		public Contract(String empno, String name, int pay,int hireYear) {
			super(empno, name, pay, hireYear);
			this.hireYear = hireYear;
		}
		
		@Override
		double getMonthPay() {
			return hireYear = (int)(pay/(double)12);
		}
		public void show() {
			super.show();
			System.out.println("���Ⱓ : "+ hireYear);
			System.out.println("�ٸӴ� : "+  pay/(double)12 * hireYear);	
		}

	}
	class PartTime extends Employee2{
		int workDay;
		
		public PartTime(String empno, String name, int pay, int workDay) {
			super(empno, name, pay, workDay);
			this.workDay = workDay;
		}
		
		@Override
		double getMonthPay() {
			return workDay = pay * workDay;
		}
		public void show() {
			super.show();
			System.out.println("�� �ٹ��� :"+ workDay);
			System.out.println("�ٸӴ� : "+ pay * workDay);	
		}

	}
public class Ex06_10_���� {
	static void getMonthPay(Employee2 s) {
		if(s instanceof FullTime) {
			FullTime f = (FullTime)s;
			f.show();
		}else if(s instanceof Contract) {
			Contract c = (Contract)s;
			c.show();
		}else if(s instanceof PartTime) {
			PartTime p = (PartTime)s;
			p.show();
		}
	}
	
	public static void main(String[] args) {
		Employee2 f =  new FullTime("F001","������",500,30);
		f.show();
		System.out.println("=============");
		Employee2 c =  new Contract("C001","��ȿ��",400,3);
		c.show();
		System.out.println("=============");
		Employee2 p =  new PartTime("P001","����",300,7);
		p.show();
		System.out.println("=============");
		
		Employee2 arr [] = {new FullTime("F001","������",500,30),new Contract("C001","��ȿ��",400,3),new PartTime("P001","����",300,7)};	
		
		for(int i=0; i<arr.length;i++) {
			getMonthPay(arr[i]);
			System.out.println("------------");
		}
	}
}
