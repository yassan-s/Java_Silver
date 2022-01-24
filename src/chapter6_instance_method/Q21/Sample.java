package chapter6_instance_method.Q21;

public class Sample {

	Sample(){
		System.out.print("A");
	}
	Sample(String str){
		System.out.print(str);
	}
	// コンストラクタの共通処理
	{
		System.out.print("B");
	}
}
