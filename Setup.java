import bridges.connect.Bridges;
import bridges.base.Array;
import bridges.base.Element;


public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "jzaquitzal", "593208066198");

	    /* Set an assignment title */
	    bridges.setTitle("Jorge Zaquitzal");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    /* Populate the array with integers */
	    /* TODO: Make the array store square numbers*/
	    for(int i = 0; i < arraySize; i++){
	    	arr.getElement(i).setValue(i*i);
	    	 arr.getElement(i).setLabel(String.valueOf(i));
	    }
	    
	    
	    //arr.getElement(0).setValue (0);
	    /* set the value as a Label */
	   
	    
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}
