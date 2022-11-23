package com.example.beans.services;

import com.example.beans.components.HybridCar;
import com.example.beans.components.NewGenerationCar;
import com.example.beans.components.OldGenerationCar;
import com.example.beans.configuration.ConfigurationProperties;
import com.example.beans.pojo.Mechanic;
import com.example.beans.pojo.PrototypeBean;
import com.example.beans.pojo.SingletonBean;
import com.example.beans.pojo.XmlDefinedBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class CarService {

    // field injection
    @Autowired
    private Mechanic mechanic;

    @Autowired
    private List<OldGenerationCar> cars;

    // interface injection (injects implementations by name)
    @Autowired
    private OldGenerationCar dieselOldGenerationCar;

    private OldGenerationCar petrolOldGenerationCar;

    @Autowired
//    @Qualifier("hybridCar")
    private NewGenerationCar newGenerationCar;

    // setter injection
    @Autowired
    public void setPetrolCar(OldGenerationCar petrolOldGenerationCar) {
        this.petrolOldGenerationCar = petrolOldGenerationCar;
    }

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private BeanFactory beanFactory;

    @Value("${my.property.myprop}")
    private String myProperty;

    @Autowired
    private ConfigurationProperties configurationProperties;

    public void testCar() {
        // types of injection
        // postconstruct and predestroy
        mechanic.prepare();
        cars.forEach(OldGenerationCar::verifyFuel);
        dieselOldGenerationCar.turnOnEngine();
        petrolOldGenerationCar.turnOnEngine();
        newGenerationCar.showBattery();

        log.info("MyProperty: " + myProperty);
        log.info("AnotherProperty: " + configurationProperties.getAnotherProperty());

        // ApplicationContext usage
        // getBean is a factory method , uses factory pattern
        // BeanFactory(API for beans) extends ApplicationContext
        // ApplicationContext is more complex (Event handling) , supports all scopes, can use annotations
        HybridCar hybridCar = (HybridCar) applicationContext.getBean("hybridCar");
        hybridCar.showBattery();

        // beanFactory usage
        log.info(String.valueOf((beanFactory.isSingleton("hybridCar"))));

        // xml-bean defined
        ClassPathResource resource = new ClassPathResource("beans.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resource);
        XmlDefinedBean xmlDefinedBean = (XmlDefinedBean) factory.getBean("xmlDefinedBean");
        xmlDefinedBean.doSomething();
    }

}
