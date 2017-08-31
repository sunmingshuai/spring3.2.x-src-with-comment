package test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by sunms on 2017/4/25.
 */
@Aspect
public class ThreeAdviceAspect {
	
	private int totalCalls;
	
	@Around("execution(* getAge())")
	public int returnCallCount(ProceedingJoinPoint pjp) throws Exception {
		return totalCalls;
	}
	
	@Before("execution(* setAge(int)) && args(newAge)")
	public void countSet(int newAge) throws Exception {
		++totalCalls;
	}
	
	
}
