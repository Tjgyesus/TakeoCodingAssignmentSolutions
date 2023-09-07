package com.takeo.address;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class AddressApplication {

    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("/Users/Tj-Gebreyesus/Desktop/Takeo/TakeoCodingAssignmentSolutions/week6/day3/Address/src/main/java/com/takeo/address/config/address.xml"));
        Object object = factory.getBean("address");
        Address address = (Address) object;

        address.addressInfo();


    }

}
