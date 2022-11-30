package in.ashokit.beans;
import org.springframework.stereotype.Component;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
@Component
public class CacheMemoryViaApplicationRunner implements ApplicationRunner
{
	public CacheMemoryViaApplicationRunner() 
	{
		System.out.println("Calling CacheMemoryViaApplicationRunner Constructor");
	}
	
	public void run(ApplicationArguments args)
	{
		System.out.println(">>>Application Runner>>>>Loading Data from DB and Storing it to cache memory");
		
	}

	
	

}
