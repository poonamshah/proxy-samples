package javaconfig;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaConfig.class)
public class JavaConfigTest {
	@Autowired
	private AccountService accountService;
	
	
	@Test
	public void updateAccount() {
		this.accountService.delete(new Account());
	}
	

}
