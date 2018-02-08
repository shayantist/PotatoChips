// Team PotatoChips
// Daniel Gelfand, Tabassum Fabiha, Shayan Chowdhury
// APCS2 Period 2
// HW #03: I Am Still Searching
// 2018--02--02

public class MFDriver {
    public static int[][] inputer(int size)
    {
	int[][] temp = new int[size][size];
	int x = 1;
	for (int r = 0; r < size; r++)
	    {
		for (int c = 0; c < size; c++)
		    {
			temp[r][c] = x;
			x += 1;
		    }
	    }

	return temp;
    }

    public static void main(String[] args)
    {
	int[][] tester;
	double timer;
	for (int x = 1000; x < 2000; x += 100)
	    {
		tester = inputer(x);
		MatrixFinder.finder(tester, x*x - x + 1);
	    }
    }
}
