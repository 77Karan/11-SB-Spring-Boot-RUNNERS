package in.ashokit.beans;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
@Component
public class CacheManager implements CommandLineRunner
{
	public CacheManager() 
	{
		System.out.println("Cache Manager Constructor Calling");
	}
	
	public void run(String... args) 
	{
		System.out.println(">>CommandLineRunner>>>>>>Data is loading from DB and loading in Cache memory");
	}
	

}
