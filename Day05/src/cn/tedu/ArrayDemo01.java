package cn.tedu;

public class ArrayDemo01 {

	public static void main(String[] args) {
		/*
		 * 数组：一组相同数据类型元素的集合
		 *数组是引用数据类型
		 *数组长度一旦声明了，不可改变
		 * 声明：两种
		 * 赋值：
		 * 使用：小标从零开始，最大到数组长度-1
		 */
		//1.声明
		int[] arr1,arr0;//引用类型
		int arr2[];
		//2.初始化
		int[] arr3 = new int[10];//10个0，动态初始化
		//静态初始化:数组初始化和元素的赋值是同时进行
		int[] arr4 = new int[] {1,2,3,4,5,6};
		int[] arr5 = {1,2,3,4,5,1};
		int[] arr6 = new int[] {};//数组中有0个

		arr1 = new int[5];
		arr2 = new int[] {1,2,3,4,5,6};
		//arr0 = {1,2,3};编译错误
		
		//把arr2数组置位空数组
		arr2 = new int[0];
		arr2 = new int[] {};
		
		//错误示范：
		//int arr = new int[];必须指定数组长度
		//int arr = new int[3]{};不可以指定数组长度
		//int[5] arr = new int[5];不可以在前面的[]加内容
		
		//3.使用：通过下标索引访问数组
		//数组的长度：数组名.lenght
		int lenght = arr3.length;
		System.out.println("数组的长度;"+lenght);//10
		//数组的第一个元素
		arr3[0] = 12;
		//数组的最后一个元素
		arr3[arr3.length-1] = 100;
		//遍历访问数组
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]+" ");
			
		}	
	}
}
