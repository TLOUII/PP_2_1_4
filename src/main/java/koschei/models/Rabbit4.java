package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    @Autowired
    public Duck5 duck5;

    @Override
    public String toString() {
        return ", в зайце утка " + "" + duck5.toString();
    }
}
