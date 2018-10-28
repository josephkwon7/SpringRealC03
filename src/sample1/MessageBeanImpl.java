package sample1;

public class MessageBeanImpl implements MessageBean {
	private String name;

	public void sayHello() {
		try{
		    Thread.sleep(5000);
		}catch(InterruptedException e){  
			e.printStackTrace();
		}
		System.out.println("Hello" + name + "!");
	}
	public void setName(String name) {
		this.name = name;
	}

}
