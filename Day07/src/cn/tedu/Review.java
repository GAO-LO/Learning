package cn.tedu;

public class Review {

	public static void main(String[] args) {
		/*
	 * 	һά���飺
	 * 			��һά�����������ʼ��
	 * 				int arr[] = {};
	 * 			�ڷ�������ָ��λ��Ԫ��
	 * 			�ۻ�ȡ���鳤��
	 * 			�ܱ�������
	 * 			������Ԫ��Ĭ�ϳ�ʼ��
	 * 			���ڴ����
	 * 			������ĸ���
	 * 				Arrays.copyof(ԭ���飬����ĳ���)
	 * 				System.arraycopy(ԭ����, ԭ������±�, ������, ��������±�, Ҫ���Ƶ�Ԫ�صĸ���);
	 * 			�����������
	 * 				Arrays.sort(arr);��Ҫ���գ�����
	 * 				ð������for(int i=0;i<arr.lenght-1;i++){�����Ƶ�����
	 * 						for(int j=0;j<arr.lenght-i-1;j++){�����ƵĴ�����j��ʼֵΪ0���±�
	 * 							if(arr[j]<arr[j+1]){
	 * 							int t=arr[j];
	 * 							arr[j]=arr[j+1];
	 * 							arr[j+1]=t;
	 * 							}
							}
	 * 					}
	 * 
	 * 			������ĸ�ֵ������䣩
	 * 				int[] arr1 = new int[10];
	 * 				int[] arr2 = arr1;
	 * 				arr2[0] = 18;
	 * 				arr1[0] =?//18
	 * 				arr1 arr2ָ��ͬһ����ַ����������ͬһ������
	 * 			int[] arr1 = new int[]{1,2,3,4};
	 * 			int[] arr2 = new int[]{1,2,3,4};
	 * 			arr1=arr2?// f ��ַ��ͬ
	 * 
	 * 
	 *2.��ά�����ʹ�ã�
	 * 			�ٶ�ά�����������ʼ��
	 * 				int[][] arr;int arr[][];int[] arr[];
	 *				int[][] arr = new int[3][2];
	 *				int[][] arr = new int[3][];//int[] a;null
	 *   			arr[0] = new int[5];
	 *				int[][] arr = new int[][] {{1},{1,2},{}};
	 *				int[][] arr = {{1,3},{1,2},{6,8,10}};
	 * 			�ڷ�������ָ��λ��Ԫ��
	 * 				arr[0]---����int[]----��ӡʱ�����ַ/null
	 * 				arr[0][1]----����int---��ӡʱ�������Ԫ��Ĭ��ֵ���߿�ָ���쳣���ӡ��ֵ
	 * 			�ۻ�ȡ���鳤��
	 * 				arr.lenght
	 * 				arr[0].lenght
	 * 			�ܱ�������
	 * 				for(int i=0;i<arr.lenght-1;i++){
	 * 					for(int j=0;j<arr[i].lenght;j++){
	 * 						arr[i][j]
	 *     }
	 * }
	 * 			������Ԫ��Ĭ�ϳ�ʼֵ
	 * 				int[][] arr = new int[3][2]
	 * 					arr[0]---��ַ
	 * 					arr[0][0]----Ĭ��ֵ0
	 * 				int[][] arr = new int[3][]
	 * 					arr[0]--null
	 * 					arr[00][]---��ָ���쳣
	 * 			���ڴ����
		 */
		int[] arr = new int[10];
				System.out.println(arr[10]);//�±�Խ��
		int[] arr1 = null;
				System.out.println(arr[0]);//��ָ���쳣
	}

}