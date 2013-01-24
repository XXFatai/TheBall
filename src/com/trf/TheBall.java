/**********************************************************
 *  Copyright (C),2013, Hebei North University.
 * PrjName   TheBall
 * FileName: TheBall.java
 * Author:   润发
 * Date:     2013-1-24 12:55:59  
 * Version :
 * Description:一球从m米高度自由落下，每次落地后反跳回原高度
 * 的一半；再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
 **********************************************************/
package com.trf;
import java.util.*;

public class TheBall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BallDowm bd = new BallDowm();
		
		System.out.print("输入高度 m =");
		float m = input.nextFloat();
		System.out.print("输入落地次数 n =");
		int n = input.nextInt();
		input.close();
		
		bd.down(m, n);
	}
}
class BallDowm{
	public void down(float meter, int hits){
		int i = 1;
		float meters = meter;
		for(; i < hits; i++){
			meters += meter;
			meter = meter/2;
		}
		System.out.print("第"+hits+"次落地共经过"+meters+"第"+hits+"次弹起");
		System.out.println(meter+"米。");
	}
}
