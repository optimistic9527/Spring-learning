package example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author guoxingyong
 * @since 2019/2/13 22:34
 */
@Component
public class CycleA {

    @Autowired
    private CycleB cycleB;


}
