/**********************************************************
 *  Copyright (C),2013, Hebei North University.
 * PrjName��   TheBall
 * FileName: TheBall.java
 * Author:   ����
 * Date:     2013-1-24 ����2:55:59  
 * Version :
 * Description:һ����m�׸߶��������£�ÿ�����غ�
 * ������ԭ�߶ȵ�һ�룻�����£������� ��n������ʱ�������������ף���n�η������ߣ�
 **********************************************************/
package com.trf;
import java.util.*;

public class TheBall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BallDowm bd = new BallDowm();
		
		System.out.print("�����߶� m =");
		private float m = input.nextFloat();
		System.out.print("�������ش��� n =");
		private int n = input.nextInt();
		input.close();
		
		bd.down(m, n);
	}
}
class BallDowm{
	public void down(float meter, int hits){
		private int i = 1;
		private float meters = meter;
		for(; i < hits; i++){
			meters += meter;
			meter = meter/2;
		}
		System.out.print("��"+hits+"������ʱ��������"+meters+"��,��"+hits+"�η���");
		System.out.println(meter+"�ס�");
	}
}
