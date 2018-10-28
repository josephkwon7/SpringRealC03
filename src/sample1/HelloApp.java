package sample1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resource);
        MessageBean bean = (MessageBean)factory.getBean("proxy");
        bean.sayHello();
    }

}
