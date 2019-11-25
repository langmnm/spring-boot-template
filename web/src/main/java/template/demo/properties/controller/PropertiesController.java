package template.demo.properties.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import template.demo.properties.prop.BindProperties;
import template.demo.properties.prop.YamlProperties;

/**
 * 配置文件加载示例(yml/properties)
 *
 * @author S.Violet
 */
@RestController
@RequestMapping("/properties")
public class PropertiesController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${demo.properties.general.greet}")
    private String generalGreet;

    @Autowired
    private BindProperties bindProperties;

    @Autowired
    private YamlProperties yamlProperties;

    /**
     * http://localhost:8080/properties/
     */
    @RequestMapping("")
    public String test() {
        logger.info(generalGreet + "<br>" + bindProperties + "<br>" + yamlProperties);
        return generalGreet + "<br>" + bindProperties + "<br>" + yamlProperties;
    }

}
