import javax.swing.*;

class Atv2
{
	public static void main (String entrada[])
	{
		int num1, num2, mult = 1;
		char op = 0;
		String msg = "", msgEntr = "Digite 1 para a multiplicação\nDigite 2 para a produtória do primeiro pelo segundo número";
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
		switch(op)
		{
			case '1':
			{
				if (num1 > 0 && num2 > 0)
				{
					mult = num1*num2;
					msg = msg + "Resultado da multiplicação de " + num1 + " por " + num2 + " = " + mult + "\n\n" ;
				}
				break;
			}
			case '2':
			{
				for (int i=1; i <= num2; i=i+1)
				{
					mult = mult * num1;
				}
				msg = msg + "A produtória de " + num1 + " por " + num2 + " = " + mult + "\n\n";
				break;
			}
			default: JOptionPane.showMessageDialog(null,"Opção inválida.");
		}
		
		if (op >='1' && op <='3' )
		{
			JOptionPane.showMessageDialog(null,msg);
		}
		System.exit(0);
	}
}