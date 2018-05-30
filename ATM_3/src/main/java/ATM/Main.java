package ATM;

import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		String buttonIndex = "1";

		Admin admin = new Admin();

		while (!buttonIndex.equals("0") && !(admin.isEmpty())) {
			buttonIndex = ATM.getMenu();

			if (buttonIndex.equals("1")) // 입금
			{
				ATM.deposit(admin);
			} else if (buttonIndex.equals("2")) // 출금
			{
				ATM.withdraw(admin);
			} else if (buttonIndex.equals("3")) // 계좌정보 확인
			{
				ATM.checkBalance();

			} else if (buttonIndex.equals("4")) // 계좌 이체
			{
				ATM.transfer(admin);
			} else if (buttonIndex.equals("5")) // 관리자 모드
			{
				ATM.changeAdmin(admin);
			} else if (buttonIndex.equals("6")) // 도난 신고
			{
				ATM.robberyreport();

			} else if(buttonIndex.equals("0"))// gui에서 exit버튼이 눌렸을 때
			{
				System.out.println("Exit the ATM...");
				break;
			}
			else
			{
				System.out.println("Wrong Approach!");
			}

		}

		System.out.println("Finished!");
	}

}
