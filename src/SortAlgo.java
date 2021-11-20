
public class SortAlgo {
	
	public static String bubbleSort(int[] num) {

	String hold="";

	int temp=0;

	for (int outer = 0; outer < num.length; outer++) {

	for (int inner = 0; inner < num.length-1; inner++) {

	if(num[inner]>num[inner+1]) {

	temp=num[inner+1];

	num[inner+1]=num[inner];

	num[inner]=temp;

	} //end of if

	}//end of inner loop

	for (int i = 0; i < num.length; i++) {

	hold+=num[i]+" ";

	}

	hold+="\n";

	} //end of outer loop

	return hold;

	}

	public static String exchangeSort(int[] num) {

	String hold="";

	int temp=0;

	for (int outer = 0; outer < num.length-1; outer++) {

	for (int inner=outer+1; inner < num.length; inner++) {

	if(num[outer]<num[inner]) {

	temp=num[inner];

	num[inner]=num[outer];

	num[outer]=temp;

	} //end of if

	}//end of inner loop

	for (int i = 0; i < num.length; i++) {

	hold+=num[i]+" ";

	}

	hold+="\n";

	} //end of outer loop

	return hold;

	}

	public static String selectionSort(int[] num) {

	String hold="";

	int temp=0,lowest=0, inner=0;

	for (int outer = 0; outer < num.length; outer++) {

	lowest=outer;

	for (inner=outer+1; inner<num.length; inner++) {

	if(num[inner]>num[lowest]) {

	lowest=inner;

	} //end of if

	}//end of inner loop

	temp=num[lowest];

	num[lowest]=num[outer];

	num[outer]=temp;



	for (int i = 0; i < num.length; i++) {

	hold+=num[i]+" ";

	}

	hold+="\n";

	} //end of outer loop

	return hold;
	


	}

	public static void main(String[] args) {

	int num1[]= {74,99,8,15,11,9};

	long start=0, end=0;

	start=System.nanoTime();

	System.out.println("Bubble Sort\n"+SortAlgo.bubbleSort(num1));

	end=System.nanoTime();

	System.out.println(end-start+" units.");

	int num2[]= {74,99,8,15,11,9};

	start=System.nanoTime();

	System.out.println("Exchange Sort\n"+SortAlgo.exchangeSort(num2));

	end=System.nanoTime();

	System.out.println(end-start+" units.");

	int num3[]= {74,99,8,15,11,9};
	
	System.out.println("Selection Sort\n"+SortAlgo.selectionSort(num3));

	end=System.nanoTime();

	System.out.println(end-start+" units.");


	}

	}

