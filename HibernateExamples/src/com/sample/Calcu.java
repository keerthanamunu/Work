package com.sample;

public class Calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={4,2,1,5};
		System.out.println(a);
		int b[] = new int[a.length];

		int temp=0;

		for (int i = 0; i < a.length; i++) {

			temp=a[i];
			int pro=1;
			for (int j = 0; j < a.length; j++) 
			{
				if(temp!=a[j])
				{
					pro=pro*a[j];
				}
			}

			b[i]=pro;
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
