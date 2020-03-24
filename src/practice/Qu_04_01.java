package practice;

import java.io.IOException;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("한 자리 숫자를 입력하세요. : ");
		
		int munja = System.in.read();
				
		if(munja>=48 && munja <=57) {
			
			if(munja%2==0)
			{
				System.out.println((char)munja + "는 2의 배수입니다.");
			}
			else
			{
				System.out.println((char)munja + "는 2의 배수가 아닙니다.");

			}
			
		}
		else
		{
			System.out.println("숫자만 입력하세요.");
		}

	}

}
