package decorate;
/**
 * @Author: liuhao
 * @Description:
 * 装饰模式
 *
 *   		1：装饰类，需要去实现被装饰类接口
 *   		2：装饰类的本质是对已有的类进行功能增强
 *
 *   特点：
 *   		1：外表看起来是被装饰类的接口表示形式
 *   		2：内在其实使用的是被装饰类本身的功能，只是在此基础之上进行增强。
 *
 * @Date: Create in 4:35 PM 2019/5/29
 */
public class IPhoneDecorate implements Phone{
	
	//被装饰的类的实例，该实例由外部传入
	private Phone phone;
	//通过构造方法传入被装饰类的实例
	public IPhoneDecorate(Phone phone){
		this.phone = phone;
	}
	
	//对被装饰类的打电话功能进行装饰，使其功能增强
	@Override
	public void call() {
		//依然使用的是被装饰类的手机去打电话
		phone.call();
		System.out.println("听音乐");
	}
	
}
