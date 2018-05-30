package ATM;

import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		String buttonIndex = "1";

		Admin admin = new Admin();

		while (!buttonIndex.equals("0") && !(admin.isEmpty())) {
			buttonIndex = ATM.getMenu();

			if (buttonIndex.equals("1")) // �Ա�
			{
				ATM.deposit(admin);
			} else if (buttonIndex.equals("2")) // ���
			{
				ATM.withdraw(admin);
			} else if (buttonIndex.equals("3")) // �������� Ȯ��
			{
				ATM.checkBalance();

			} else if (buttonIndex.equals("4")) // ���� ��ü
			{
				ATM.transfer(admin);
			} else if (buttonIndex.equals("5")) // ������ ���
			{
				ATM.changeAdmin(admin);
			} else if (buttonIndex.equals("6")) // ���� �Ű�
			{
				ATM.robberyreport();

			} else if(buttonIndex.equals("0"))// gui���� exit��ư�� ������ ��
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
