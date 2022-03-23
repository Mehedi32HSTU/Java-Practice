package OOP_with_java;

import java.util.ArrayList;
import java.util.List;
//import org.apache.commons.codec.binary.Base64;

public class CheckClass {

	private static int[] res = new int[10];
	private static int[] used = new int[10];
	private static int[] arr = new int[] {0,1,2,3,4,5,6};
	private static List<String> str = new ArrayList<String>();


	private static String decoder() {
		
//		    for(int k=0; k<7; k++) 
//				System.out.print(res[k]+ " " );
//			System.out.println();

            String encoded = "";
            for( int i=0; i<7; i++) {
            	//System.out.println(str.get(res[i]));
            	encoded += str.get(res[i]);
            }
            
            System.out.println(encoded);
            
            byte [] barr = java.util.Base64.getDecoder().decode(encoded);
            System.out.println(barr);
//            byte[] decoded = Base64.decodeBase64(encoded);
//            System.out.println(new String(decoded, "UTF-8") + "\n");
            
            return encoded;
	}

	private static void fun(int pos, int n) {

		if( pos == n ) {
			decoder();
			return;
		}

		for(int i=0; i<n; i++){   /// starting form 0'th position
			if( used[i] == 0 ) {
				used[i] = 1;
				res [pos] = arr[i];
				fun( pos+1, n );
				used[i] = 0;
				
			}
			
		}
	}

	public static void main(String[] args) {

		// set the string 
//		str.add("MzIuY3NlLmhzdHUlNDBnbWFpbC5jb20ta3BjOG1ONHNZcjZ0TH");
//		str.add("50cnkuMTAxMzkwOTE1PXgzaG9SekhUQTZXazdRdFMtbWVoZWRp");
//		str.add("lwUUxTZS1nQUx1eFBKanJPVEZ2MnpCX0FSQVFBbEtGRHlYdTVS");
//		str.add("b2xHcGxablNvLUw2akFBL3ZpZXdmb3JtP3VzcD1wcF91cmwmZW");
//		str.add("NoNyZlbnRyeS4xOTU0MDUwMzA0PW1laGVkaTMyLmNzZS5oc3R1");
//		str.add("aHR0cHM6Ly9kb2NzLmdvb2dsZS5jb20vZm9ybXMvZC9lLzFGQU");
//		str.add("QGdtYWlsLmNvbQ==");
		str.add("lwUUxTZS1nQUx1eFBKanJPVEZ2MnpCX0FSQVFBbEtGRHlYdTVS");
		str.add("aHR0cHM6Ly9kb2NzLmdvb2dsZS5jb20vZm9ybXMvZC9lLzFGQU");
		str.add("QGdtYWlsLmNvbQ==");
		str.add("b2xHcGxablNvLUw2akFBL3ZpZXdmb3JtP3VzcD1wcF91cmwmZW");
		str.add("50cnkuMTAxMzkwOTE1PXVWbUlVblF2dURBaXlxY3gtbWVoZWRp");
		str.add("MzIuY3NlLmhzdHUlNDBnbWFpbC5jb20tUzZXOTZxVTRuYzM3MW");
		str.add("dYZyZlbnRyeS4xOTU0MDUwMzA0PW1laGVkaTMyLmNzZS5oc3R1");
		fun(0,7);

	}



}