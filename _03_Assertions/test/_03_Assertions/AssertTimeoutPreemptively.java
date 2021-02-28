package _03_Assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class AssertTimeoutPreemptively {

	@Test
	void timeoutNoMessage()
	{
		assertTimeoutPreemptively(Duration.ofNanos(1),()->{
			while(true)
			{
				System.out.println("Yo");
			}
		});
	}
	
	@Test
	void timeoutMessage()
	{
		assertTimeoutPreemptively(Duration.ofNanos(1),()->{
			while(true)
			{
				System.out.println("Yo");
			}
		},"Timeout exceeded");
	}
	
	@Test
	void timeoutSupplierMessage()
	{
		assertTimeoutPreemptively(Duration.ofNanos(1),()->{
			while(true)
			{
				System.out.println("Yo");
			}
		},()->"Timeout exceeded");
	}

}
