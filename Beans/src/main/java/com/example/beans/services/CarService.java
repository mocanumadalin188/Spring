package com.example.beans.services;

import com.example.beans.components.HybridCar;
import com.example.beans.components.NewGenerationCar;
import com.example.beans.components.OldGenerationCar;
import com.example.beans.configuration.ConfigurationProperties;
import com.example.beans.pojo.Mechanic;
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
//@RequiredArgsConstructor
public class CarService {

    // field injection
    @Autowired
    private Mechanic mechanic;

    @Autowired
    private List<OldGenerationCar> cars;

    // interface injection (injects implementations by name)
    @Autowired
    private OldGenerationCar dieselOldGenerationCar;

//    private final OldGenerationCar petrolOldGenerationCar;  // pentru cazul în care se utilizează @RequiredArgsConstructor
    private final OldGenerationCar petrolOldGenerationCar;

    @Autowired
//    @Qualifier("hybridCar")
    private NewGenerationCar newGenerationCar;

    // setter injection for petrolOldGenerationCar (needs @Autowired)
//    @Autowired
//    public void setPetrolCar(OldGenerationCar petrolOldGenerationCar) {
//        this.petrolOldGenerationCar = petrolOldGenerationCar;
//    }

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private BeanFactory beanFactory;

    @Value("${proprietatea.Mea.RegulileMele.YOXO}")
    private String myProperty;

    @Autowired
    private ConfigurationProperties configurationProperties;


    // constructor injection for petrolOldGenerationCar (does not need @Autowired)
    public CarService(OldGenerationCar petrolOldGenerationCar) {
        this.petrolOldGenerationCar = petrolOldGenerationCar;
    }

//    public void testCar() {
//        // types of injection
//        // postconstruct and predestroy
//        mechanic.prepare();
//        cars.forEach(OldGenerationCar::verifyFuel);
//        dieselOldGenerationCar.turnOnEngine();
//        petrolOldGenerationCar.turnOnEngine();
//        newGenerationCar.showBattery();
//
//        log.info("MyProperty: " + myProperty);
//        log.info("AnotherProperty: " + configurationProperties.getAnotherProperty());
//
//        // ApplicationContext usage
//        // getBean is a factory method , uses factory pattern
//        // BeanFactory(API for beans) extends ApplicationContext
//        // ApplicationContext is more complex (Event handling) , supports all scopes, can use annotations
//        HybridCar hybridCarZZZ = (HybridCar) applicationContext.getBean("hybridCar");
//        hybridCarZZZ.showBattery();
//        log.info(String.valueOf(hybridCarZZZ.hashCode()));
//
//        // beanFactory usage
//        log.info(String.valueOf((beanFactory.isSingleton("hybridCar"))));
//        log.info(String.valueOf(beanFactory.getBean("hybridCar").hashCode()));
//
//        // xml-bean defined
//        ClassPathResource resource = new ClassPathResource("beans.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(resource);
//        XmlDefinedBean xmlDefinedBean = (XmlDefinedBean) factory.getBean("xmlDefinedBean");
//        xmlDefinedBean.doSomething();
//    }

}
