import java.util.Scanner;

public class StringCalc
{

	public int add(String numbers)
	{
		int result = 0;
		if (numbers != null)
		{
			Scanner fi = new Scanner(numbers);
			fi.useDelimiter(",");
			while (fi.hasNextInt())
			{
				result = result + fi.nextInt();
			}
		}

		return result;
	}
}