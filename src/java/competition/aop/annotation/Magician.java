package competition.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author the-ramones
 */
@Aspect
@Component
public class Magician implements MindReader {

    @Pointcut("execution(* competition.aop.annotation.Thinker.think*(..) and args(thoughts)")
    public void thinking(String thoughts) {        
    }
    
    private String thoughts;
    
    @Override
    @Before("thinking(thoughts)")
    public void interceptThoughts(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return this.thoughts;
    }
}
