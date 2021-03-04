class array{
	public static void main(String[] args){
//		int[][] arr = new int[4][];
		int[][] td = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15} }
		for(int i = 0; i<td[i].length; i++){
		//	arr[i] = new int[]{1,2,4};
			for(int j= 0; j<td.length; j++){
				System.out.print(td[j][i]+" ");
			}
			System.out.println();;
		}
	}
}
