/*
����һ����Ʊ��Stock
����һ����ΪStock�Ĺ�Ʊ�࣬����������һ����Ϊsymbol���ַ���
�������ʾ��Ʊ���룬һ����Ϊname���ַ����������ʾ��Ʊ���ơ�
һ����ΪpreviousClosingPrice��double���������洢ǰһ�յĹ�Ʊ���׼۸�
һ����ΪcurrentPrice���������洢��ǰ�Ĺ�Ʊ���׼۸񡣴���һ�����ض���������ƵĹ�Ʊ�Ĺ��췽��
һ����ΪgetChangePercent()�������ش�previousClosingPrice�仯��currentPrice�İٷֱȡ�
*/
import java.util.Scanner;

class Stock
{
	String name;
	String symbol;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock(String symbol,String name)
	{
		this.symbol=symbol;
		this.name=name;
	}
	
	public double changePercent()
	{
		double result;
		result=(currentPrice-previousClosingPrice)/previousClosingPrice;
		return result;
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String symbol1=input.next();
		String name1=input.next();
		Stock stock=new Stock(symbol1,name1);
		
		stock.previousClosingPrice=input.nextDouble();
		
		stock.currentPrice=input.nextDouble();
		
		System.out.println(stock.name+"price changed: " + stock.changePercent() * 100 + "%");
		input.close();
	}
}